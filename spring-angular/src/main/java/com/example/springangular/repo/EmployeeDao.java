package com.example.springangular.repo;

import com.example.springangular.employee.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {
    Optional<Employee> getEmployeeByName(String name);
    List<Employee> showAll();
}
