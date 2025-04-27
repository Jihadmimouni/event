package com.example.event.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, length = 20)
    private String phone;
}