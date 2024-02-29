package com.example.hrportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrportal.model.Employee;
import com.example.hrportal.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo repo;

    // post
    public Employee add(Employee employee) {
        return repo.save(employee);
    }

    // get
    public List<Employee> get() {
        return repo.findAll();
    }

    // delete
    public String delete() {
        repo.deleteAll();
        return "Deleted All Recods";
    }

}
