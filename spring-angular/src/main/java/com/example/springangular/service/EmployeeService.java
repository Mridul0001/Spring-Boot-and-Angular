package com.example.springangular.service;

import com.example.springangular.employee.Employee;
import com.example.springangular.repo.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(@Qualifier("empdb") EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public Optional<Employee> getEmployeeByName(String name){
        return employeeDao.getEmployeeByName(name);
    }

    public List<Employee> showAll(){return employeeDao.showAll();}
}
