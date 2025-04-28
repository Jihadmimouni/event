package com.example.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.event.model.Registration;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
    List<Registration> findByEventId(Integer eventId);
    List<Registration> findByParticipantId(Integer participantId);
}