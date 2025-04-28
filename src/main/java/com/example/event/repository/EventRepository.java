package com.example.event.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.event.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByTitle(String title);
    List<Event> findByCategory(String category);
    List<Event> findByDate(String eventDate);
    List<Event> findByLocation(String location);
    Optional<Event> findById(Long id) ;
       
}
