package com.univ.dao;

import com.univ.model.Event;
import com.univ.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;


public class EventDao {

    @Autowired
    DataSource dataSource;

    public void insertData(Event event) {

        String sql = "INSERT INTO events (name, description, location, date_event, date_created, group_id, type_id, created_by) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql,
                new Object[] { event.getName(), event.getDescription(),
                        event.getLocation(), event.getDate_event(), event.getDate_created(), event.getGroup_id(), event.getType_id(), event.getCreated_by() });
    }

    public List<Event> getEventByCategoryID(int id) {
        String sql = "select * from events";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Event> events  = jdbcTemplate.query(
                sql,
//                new Object[] {id},
                new BeanPropertyRowMapper(Event.class));

        return events;
    }

    public List<Event> getEventByUserId(int id) {
//        String sql = "select ev.*, gr.name as group_name from events as ev \n" +
//                "left join groups as gr on ev.group_id = gr.id\n" +
//                "left join userGroup as ug on ug.group_id = gr.id\n" +
//                "where ug.user_id = ?";
        //can be used for event and group info

        String sql = "select ev.* from events as ev \n" +
                "left join userGroup as ug on ug.group_id = ev.group_id\n" +
                "where ug.user_id = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Event> events  = jdbcTemplate.query(
                sql,
                new Object[] {id},
                new BeanPropertyRowMapper(Event.class));

        return events;
    }

    public List<Event> getEventByGroupId(int groupId) {
        String sql = "select * from events where group_id = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Event> events  = jdbcTemplate.query(
                sql,
                new Object[] {groupId},
                new BeanPropertyRowMapper(Event.class));

        return events;
    }
}

