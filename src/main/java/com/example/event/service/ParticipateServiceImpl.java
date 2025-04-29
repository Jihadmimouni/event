package com.example.event.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.event.model.Participate;
import com.example.event.repository.ParticipateRepository;

@Service
public class ParticipateServiceImpl implements ParticipateService {

    // Assuming you have a repository for Participate
    private final ParticipateRepository participateRepository;

    public ParticipateServiceImpl(ParticipateRepository participateRepository) {
        this.participateRepository = participateRepository;
    }

    @Override
    public List<Participate> getAllParticipates() {
        return participateRepository.findAll();
    }

    @Override
    public Participate getParticipateById(Long id) {
        return participateRepository.findById(id).orElse(null);
    }

    @Override
    public Participate createParticipate(Participate participate) {
        return participateRepository.save(participate);
    }

    @Override
    public Participate updateParticipate(Long id, Participate participate) {
        if (participateRepository.existsById(id)) {
            participate.setId(id);
            return participateRepository.save(participate);
        }
        return null;
    }

    @Override
    public void deleteParticipate(Long id) {
        participateRepository.deleteById(id);
    }

    @Override
    public List<Participate> getParticipatesByEventId(Long eventId) {
        return participateRepository.findByEventId(eventId);
    }


}
