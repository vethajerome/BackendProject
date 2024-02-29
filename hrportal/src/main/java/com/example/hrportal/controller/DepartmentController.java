package com.example.hrportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrportal.model.Department;
import com.example.hrportal.service.DepartmentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService serv;

    @PostMapping("/post")
    public Department postMethodName(@RequestBody Department d) {
        return serv.post(d);
    }

    @GetMapping("/get")
    public List<Department> getAll() {
        return serv.get();
    }

    @DeleteMapping("/delete")
    public String delete() {
        return serv.delete();
    }

}
