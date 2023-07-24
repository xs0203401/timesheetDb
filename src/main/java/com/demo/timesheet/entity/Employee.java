package com.demo.timesheet.entity;


import com.demo.timesheet.enumeration.StatusEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id")
    private Position position;

    @Column(name = "hour_rate", precision = 10, scale = 2)
    private Double hourRate;

    @Column(name = "status", nullable = false, length = 1)
    private StatusEnum status;
}
