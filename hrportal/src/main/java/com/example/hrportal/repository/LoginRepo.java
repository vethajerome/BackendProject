package com.example.hrportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrportal.model.LoginModel;

@Repository
public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
