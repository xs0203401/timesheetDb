package com.demo.timesheet.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

}
