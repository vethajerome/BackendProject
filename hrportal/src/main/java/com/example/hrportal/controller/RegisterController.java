package com.example.hrportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hrportal.model.RegisterModel;
import com.example.hrportal.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService serv;

    @PostMapping("/post")
    public RegisterModel postMethod(@RequestBody RegisterModel model) {

        return serv.create(model);
    }

    @GetMapping("/get")
    public List<RegisterModel> getAll() {
        return serv.read();
    }

    @GetMapping("/get/{id}")
    public RegisterModel getById(@PathVariable int id) {
        return serv.getDetailsById(id);
    }

    @PutMapping("/update/{id}")
    public RegisterModel putMethodName(@PathVariable int id, @RequestBody RegisterModel mod) {

        return serv.update(id, mod);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return serv.delete(id);
    }

    @DeleteMapping("/delete")
    public String deletAll() {
        return serv.deletAll();
    }
}
