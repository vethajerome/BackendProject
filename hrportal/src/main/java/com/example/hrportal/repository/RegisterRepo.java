package com.example.hrportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrportal.model.RegisterModel;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterModel, Integer> {

}
