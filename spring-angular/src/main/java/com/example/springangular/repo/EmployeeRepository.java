package com.example.springangular.repo;

import com.example.springangular.employee.Employee;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("empdb")
public class EmployeeRepository implements EmployeeDao{
    List<Employee> employeeDB = new ArrayList<>();
    //add Employees to list

    @PostConstruct
    public void populateDB(){
        employeeDB.add(new Employee(1, "JAMES", "ACCOUNTS", "SENIOR ACCOUNTANT", "NEW YORK"));
        employeeDB.add(new Employee(2, "PLANK OTO", "ACCOUNTS", "ACCOUNTANT", "MICHIGAN"));
        employeeDB.add(new Employee(3, "GREEN FIELD", "MANAGEMENT", "MANAGER", "CALIFORNIA"));
        employeeDB.add(new Employee(4, "DEWANE PAUL", "DEVELOPMENT", "DEVELOPER", "NEW YORK"));
        employeeDB.add(new Employee(5, "MATTS", "IT", "SECURITY ANALYST", "DETROIT"));
    }

    @Override
    public Optional<Employee> getEmployeeByName(String name) {
        return employeeDB.stream().filter(employee ->
           employee.getName().toLowerCase().contains(name.toLowerCase())).findFirst();
    }

    @Override
    public List<Employee> showAll() {
        return employeeDB;
    }
}
