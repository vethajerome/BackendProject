package com.example.hrportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrportal.model.Employee;
import com.example.hrportal.request.Request;
import com.example.hrportal.service.EmployeeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService serv;

    @PostMapping("/post")
    public Employee postMethodName(@RequestBody Request e) {

        return serv.add(e.getEmployee());
    }

    @GetMapping("/get")
    public List<Employee> get() {
        return serv.get();
    }

    @DeleteMapping("/delete")
    public String delete() {
        return serv.delete();
    }

}
