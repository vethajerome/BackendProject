package com.example.hrportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrportal.model.LeaveRequest;

import com.example.hrportal.service.LeaveRequestService;

@RestController
@RequestMapping("/leave")
public class LeaveRequestController {
    @Autowired
    LeaveRequestService serv;

    @PostMapping("/post")
    public LeaveRequest postMethodName(@RequestBody LeaveRequest d) {
        return serv.post(d);
    }

    @GetMapping("/get")
    public List<LeaveRequest> getAll() {
        return serv.get();
    }

    @DeleteMapping("/delete")
    public String delete() {
        return serv.delete();
    }
}
