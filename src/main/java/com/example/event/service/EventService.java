package com.example.event.service;

import java.util.List;
import java.util.Optional;

import com.example.event.model.Event;

public interface EventService {
    List<Event> getAllEvents();
    Optional<Event> getEventById(Long id);
    Event createEvent(Event event);
    Event updateEvent(Long id, Event event);
    void deleteEvent(Long id);
}
