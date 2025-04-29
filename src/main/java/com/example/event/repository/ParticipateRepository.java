package com.example.event.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.event.model.Participate;


@Repository
public interface ParticipateRepository  extends JpaRepository<Participate, Long>  {
    List<Participate> findByEventId(Long eventId);

}