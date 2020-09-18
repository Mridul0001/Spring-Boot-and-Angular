package com.example.springangular.controller;

import com.example.springangular.employee.Employee;
import com.example.springangular.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("search")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> showAll(){
        return employeeService.showAll();
    }
    @GetMapping(path = "{name}")
    public Employee getEmployeeByName(@PathVariable("name") String name){
        return employeeService.getEmployeeByName(name).orElse(new Employee(-1,
                "-------", "-------", "-------",
                "-------"));
    }

}
