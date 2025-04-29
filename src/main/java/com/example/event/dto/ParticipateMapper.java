package com.example.event.dto;

import com.example.event.model.Participate;

public class ParticipateMapper {
    public static ParticipateDTO toDTO(Participate participate) {
        if (participate == null) return null;
        return new ParticipateDTO(
            participate.getId(),
            participate.getEvent() != null ? participate.getEvent().getId() : null,
            participate.getName(),
            participate.getEmail(),
            participate.getPhone()
        );
    }
}
