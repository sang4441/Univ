package com.univ.services;

import com.univ.dao.EventDao;
import com.univ.model.Event;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EventServiceImpl implements EventService {

    @Autowired
    EventDao eventDao;

    @Override
    public void insertEvent(Event event) {
        eventDao.insertData(event);
    }

    @Override
    public List<Event> findEventByCategoryId(int id) {
        return eventDao.getEventByCategoryID(id);
    }
}
