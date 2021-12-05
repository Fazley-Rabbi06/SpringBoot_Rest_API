package com.rabbi11372.springbootrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeResources {
    @Autowired
    EmployeeRepository emp;

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return emp.createEmployee();
    }

    @PostMapping("/addEmployee")
    public List<Employee> addEmployees(@RequestBody Employee employee) {
        return emp.addEmployee(employee);
  }


}
