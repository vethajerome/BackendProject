package com.example.hrportal.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
@Entity
public class LeaveRequest {
    @Id

    private int req_id;
    private String start_date;
    private String end_date;
    private String reason;
}
