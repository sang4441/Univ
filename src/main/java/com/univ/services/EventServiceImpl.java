package com.univ.services;

import com.univ.dao.GroupDao;
import com.univ.model.Group;
import org.springframework.beans.factory.annotation.Autowired;

public class EventServiceImpl implements EventService {

    @Autowired EventDao eventDao;

    @Override
    public void insertEvent(Event event) {
        eventDao.insertData(event);
    }
}
