package com.example.event.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "registration_id", nullable = false, unique = true)
    private Registration registration;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(nullable = false)
    private String transactionId;

    @Column(nullable = false)
    private LocalDateTime paymentDate;

    public enum Status {
        PENDING, COMPLETED, FAILED
    }
}
