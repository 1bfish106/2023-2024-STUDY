package com.ohgiraffers.homework.employee.controller;

import com.ohgiraffers.homework.common.Pagenation;
import com.ohgiraffers.homework.common.PagingButton;
import com.ohgiraffers.homework.employee.dto.EmployeeDTO;
import com.ohgiraffers.homework.employee.dto.JobDTO;
import com.ohgiraffers.homework.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/{empId}")
    public String findEmployeeByEmpId(@PathVariable int empId, Model model) {
        EmployeeDTO resultEmployee = employeeService.findEmployeeByEmpId(empId);
        model.addAttribute("employee", resultEmployee);
        return "employee/detail";
    }

    @GetMapping("/list")
    public String findEmployeeList(Model model, @PageableDefault Pageable pageable) {

        Page<EmployeeDTO> employeeList = employeeService.findEmployeeList(pageable);
        PagingButton paging = Pagenation.getPagingButtonInfo(employeeList);
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("paging", paging);

        return "employee/list";
    }

    @GetMapping("/querymethod")
    public void queryMethodPage() {}

    @GetMapping("/search")
    public String findByEmployeeSalary(
            @RequestParam Integer salary, Model model
    ) {
        List<EmployeeDTO> employeeList = employeeService.findBySalary(salary);
        model.addAttribute("employeeList", employeeList);
        model.addAttribute("salary", salary);
        return "employee/searchResult";
    }

    @GetMapping("/regist")
    public void registPage(){}

    @GetMapping("/job")
    @ResponseBody
    public List<JobDTO> findJobList(){
        return employeeService.findAllJob();
    }

    @PostMapping("/regist")
    public String registNewEmployee(@ModelAttribute EmployeeDTO employeeDTO) {

        employeeService.registEmployee(employeeDTO);

        return "redirect:/employee/list";
    }

    @GetMapping("/modify")
    public void modifyPage() {}

    @PostMapping("/modify")
    public String modifyEmployee(@ModelAttribute EmployeeDTO employeeDTO) {
        employeeService.modifyEmployee(employeeDTO);
        return "redirect:/employee/" + employeeDTO.getEmpId();
    }

    @GetMapping("/delete")
    public void deletePage(){}

    @PostMapping("/delete")
    public String deleteEmployee(@RequestParam Integer empCode) {
        employeeService.deleteEmployee(empCode);
        return "redirect:/employee/delete";
    }

}
