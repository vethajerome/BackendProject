package com.example.hrportal.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee {
    @Id
    private int eid;
    private String ename;
    @OneToMany(targetEntity = LeaveRequest.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "eid")
    private List<LeaveRequest> request;
    @OneToOne(targetEntity = Department.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private Department dept;
    private String salary;

}
