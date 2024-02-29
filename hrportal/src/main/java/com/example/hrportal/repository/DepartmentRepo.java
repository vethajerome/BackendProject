package com.example.hrportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hrportal.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
