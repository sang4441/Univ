package com.univ.model;

/**
 * Created by bhj0308 on 2014. 1. 30..
 */
public class Event {
    private int id;

    private String title;

    private int privacy_level;

    private String location;

    private String description;

    private int group_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrivacy_level() {
        return privacy_level;
    }

    public void setPrivacy_level(int privacy_level) {
        this.privacy_level = privacy_level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

}
