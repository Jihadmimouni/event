package com.example.event.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    private LocalDateTime date;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private Integer availableSlots;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;
}
