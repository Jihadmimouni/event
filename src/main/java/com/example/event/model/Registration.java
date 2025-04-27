package com.example.event.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "participant_id", nullable = false)
    private Participant participant;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod paymentMethod;

    public enum PaymentMethod {
        CARD, CASH
    }
}