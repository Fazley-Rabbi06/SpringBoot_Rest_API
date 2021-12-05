package com.rabbi11372.springbootrest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeRepository {

    List<Employee> employees = new ArrayList<>();

    public List<Employee> createEmployee(){
        Employee e1 = new Employee();
        e1.setId(11372);
        e1.setName("Fazley");
        e1.setDepartment("Java");

        Employee e2 = new Employee();
        e2.setId(11373);
        e2.setName("Rabbi");
        e2.setDepartment("Java");

        employees.add(e1);
        employees.add(e2);

        return employees;

    }

    public List<Employee> addEmployee(Employee employee) {
        employees.add(employee);
        return employees;

    }
}
