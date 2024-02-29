package com.example.hrportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrportal.model.LoginModel;
import com.example.hrportal.service.LoginService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService serv;

    @PostMapping("/post")
    public LoginModel postMethod(@RequestBody LoginModel model) {

        return serv.create(model);
    }

    @GetMapping("/get")
    public List<LoginModel> getAll() {
        return serv.read();
    }

    @GetMapping("/get/{id}")
    public LoginModel getById(@PathVariable int id) {
        return serv.getDetailsById(id);
    }

    @PutMapping("/update/{id}")
    public LoginModel putMethodName(@PathVariable int id, @RequestBody LoginModel mod) {

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

    @GetMapping("/pagination")
    public ResponseEntity<List<LoginModel>> getPagination(@RequestParam(value = "offset") int offset,
            @RequestParam(value = "pagesize") int size) {
        List<LoginModel> list = serv.pagination(offset, size);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/paginationsort")
    public ResponseEntity<List<LoginModel>> getSortedPagination(@RequestParam(value = "offset") int offset,
            @RequestParam(value = "pagesize") int size, @RequestParam(value = "field") String field) {
        List<LoginModel> list = serv.sortPagination(offset, size, field);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/sort")
    public ResponseEntity<List<LoginModel>> getSort(@RequestParam(value = "field") String field) {
        List<LoginModel> list = serv.sort(field);
        if (list.size() == 0) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
