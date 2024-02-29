package com.example.hrportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrportal.model.RegisterModel;
import com.example.hrportal.repository.RegisterRepo;

@Service
public class RegisterService {
    @Autowired
    RegisterRepo repo;

    public RegisterModel create(RegisterModel mod) {
        return repo.save(mod);
    }

    public List<RegisterModel> read() {
        return repo.findAll();
    }

    public RegisterModel getDetailsById(int id) {
        return repo.findById(id).orElse(null);
    }

    public String delete(int id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }

    public RegisterModel update(int id, RegisterModel mod) {
        RegisterModel model = repo.findById(id).orElse(null);
        if (model != null) {
            model.setName(mod.getName());
            repo.save(model);
            return model;
        } else
            return mod;

    }

    public String deletAll() {
        repo.deleteAll();
        return "Deleted All Records";
    }

}
