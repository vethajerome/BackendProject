package com.example.hrportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrportal.model.Department;
import com.example.hrportal.repository.DepartmentRepo;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepo repo;

    public Department post(Department d) {
        return repo.save(d);
    }

    public List<Department> get() {
        return repo.findAll();
    }

    public String delete() {
        repo.deleteAll();
        return "Deleted  all records Successfully";
    }
}
