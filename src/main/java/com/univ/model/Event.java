package com.univ.model;

import java.sql.Time;
import java.util.Date;

/**
 * Created by bhj0308 on 2014. 1. 30..
 */
public class Event {
    private int id;

    private String name;

    private String description;

    private String location;

    private Date date_event;

    private String date_event_string;

    private String time_event_string;

    private Date date_created;

    private Date date_modified;

    private int group_id;

    private int type_id;

    private int created_by;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate_event() {
        return date_event;
    }

    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }

    public String getDate_event_string() {
        return date_event_string;
    }

    public void setDate_event_string(String date_event_string) {
        this.date_event_string = date_event_string;
    }

    public String getTime_event_string() {
        return time_event_string;
    }

    public void setTime_event_string(String time_event_string) {
        this.time_event_string = time_event_string;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public Date getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(Date date_modified) {
        this.date_modified = date_modified;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }
}
