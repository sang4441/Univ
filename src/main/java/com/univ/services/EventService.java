package com.univ.services;

import com.univ.model.Event;

import java.util.List;


public interface EventService {

    public void insertEvent(Event event);

    public List<Event> findEventByCategoryId(int id);

    public List<Event> findEventbyUserId(int id);

    public List<Event> findEventByGroupId(int id);
}
