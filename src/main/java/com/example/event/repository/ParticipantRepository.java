package com.example.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.event.model.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant,Integer> {
}