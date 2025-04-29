package com.example.event.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Participate> getAllparticipate() {
        return participateService.getAllParticipates();

    }   
    
    @GetMapping("/event/{eventId}")
    public List<Participate> getParticipatesByEventId(@PathVariable Long eventId) {
        return participateService.getParticipatesByEventId(eventId);
    }   

     @GetMapping("/{id}")
    public Participate getParticipateById(@PathVariable Long id) {
        return participateService.getParticipateById(id);
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
