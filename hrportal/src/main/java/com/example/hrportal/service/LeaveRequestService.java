package com.example.hrportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrportal.model.LeaveRequest;

import com.example.hrportal.repository.LeaveRequestRepo;

@Service

public class LeaveRequestService {
    @Autowired
    LeaveRequestRepo repo;

    public LeaveRequest post(LeaveRequest d) {
        return repo.save(d);
    }

    public List<LeaveRequest> get() {
        return repo.findAll();
    }

    public String delete() {
        repo.deleteAll();
        return "Deleted  all records Successfully";
    }
}
