package com.demo.timesheet.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "timesheet_register")
public class TimesheetRegister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private Employee employee;


}
