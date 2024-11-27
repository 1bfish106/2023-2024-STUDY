package com.ohgiraffers.homework.reprository;

import com.ohgiraffers.homework.entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findBySalaryGreaterThan(Integer salary, Sort sort);
}
