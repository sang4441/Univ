package com.univ.dao;

import com.univ.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;



public class EventDaoImpl implements EventDao{

    @Autowired
    DataSource dataSource;

    public void insertData(Event event) {

        String sql = "INSERT INTO events (name, description, group_id) VALUES (?, ?, ?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql,
                new Object[] { event.getName(), event.getDescription(),
                        event.getGroup_id() });
    }
}

