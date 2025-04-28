package com.example.event.service;

import java.util.List;

import com.example.event.model.Event;

public interface EventService {
    Event create(Event event);
    Event getById(Integer id);
    List<Event> listAll();
    Event update(Integer id, Event event);
    void delete(Integer id);
}