package com.example.event.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.event.dto.ParticipateDTO;
import com.example.event.dto.ParticipateMapper;
import com.example.event.model.Participate;
import com.example.event.service.ParticipateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/participate")
public class ParticipateController {
    final ParticipateService participateService;
    public ParticipateController(ParticipateService participateService) {
        this.participateService = participateService;
    }
    
    @GetMapping
    public List<ParticipateDTO> getAllparticipate() {
        return participateService.getAllParticipates().stream()
            .map(ParticipateMapper::toDTO)
            .collect(Collectors.toList());
    }   
    
    @GetMapping("/event/{eventId}")
    public List<ParticipateDTO> getParticipatesByEventId(@PathVariable Long eventId) {
        return participateService.getParticipatesByEventId(eventId).stream()
            .map(ParticipateMapper::toDTO)
            .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ParticipateDTO getParticipateById(@PathVariable Long id) {
        return ParticipateMapper.toDTO(participateService.getParticipateById(id));
    }
    
    @PostMapping
    public Participate createParticipate(@RequestBody Participate participate) {
        return participateService.createParticipate(participate);
    }

    @PutMapping("/{id}")
    public Participate updateParticipate(Long id, Participate participate) {
        return participateService.updateParticipate(id, participate);
    }

    @DeleteMapping("/{id}")
    public void deleteParticipate(@PathVariable Long id) {
        participateService.deleteParticipate(id);
    }
}
