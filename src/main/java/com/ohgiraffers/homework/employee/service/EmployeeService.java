package com.ohgiraffers.homework.employee.service;

import com.ohgiraffers.homework.employee.dto.EmployeeDTO;
import com.ohgiraffers.homework.employee.dto.JobDTO;
import com.ohgiraffers.homework.entity.Employee;
import com.ohgiraffers.homework.entity.Job;
import com.ohgiraffers.homework.reprository.EmployeeRepository;
import com.ohgiraffers.homework.reprository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final JobRepository jobRepository;
    private final ModelMapper modelMapper;

    public EmployeeDTO findEmployeeByEmpId(int empId) {
        Employee FoundEmployee = employeeRepository.findById(empId).orElseThrow(IllegalAccessError::new);
        return modelMapper.map(FoundEmployee, EmployeeDTO.class);
    }

    public Page<EmployeeDTO> findEmployeeList(Pageable pageable) {
        pageable = PageRequest.of(
                pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() -1,
                pageable.getPageSize(),
                Sort.by("empId").descending()
        );

        Page<Employee> employeeList = employeeRepository.findAll(pageable);
        return employeeList.map(employee -> modelMapper.map(employee, EmployeeDTO.class));
    }

    @Transactional
    public void registEmployee(EmployeeDTO employeeDTO) {
        employeeRepository.save(modelMapper.map(employeeDTO, Employee.class));
    }

    @Transactional
    public void modifyEmployee(EmployeeDTO employeeDTO) {
        Employee foundEmployee =
                employeeRepository.findById(employeeDTO.getEmpId()).
                        orElseThrow(IllegalAccessError::new);

        foundEmployee.modifyEmpName(employeeDTO.getEmpName());
    }

    public List<EmployeeDTO> findBySalary(Integer salary) {

        List<Employee> employeeList =
                employeeRepository.findBySalaryGreaterThan(
                        salary,
                        Sort.by("salary").descending()
                );

        return employeeList.stream()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    public List<JobDTO> findAllJob() {
        List<Job> jobList = jobRepository.findAllJob();
        return jobList.stream()
                .map(job -> modelMapper.map(job, JobDTO.class))
                .collect(Collectors.toList());
    }

    @Transactional
    public void deleteEmployee(Integer empCode) {
        employeeRepository.deleteById(empCode);
    }
}
