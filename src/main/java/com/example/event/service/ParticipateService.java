package com.example.event.service;

import java.util.List;

import com.example.event.model.Participate;

public interface ParticipateService {
    List<Participate> getAllParticipates();
    Participate getParticipateById(Long id);
    Participate createParticipate(Participate participate);
    Participate updateParticipate(Long id, Participate participate);
    void deleteParticipate(Long id);
    List<Participate> getParticipatesByEventId(Long eventId);
}
