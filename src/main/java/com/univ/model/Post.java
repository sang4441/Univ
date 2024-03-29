package com.univ.model;

import java.util.Date;

/**
 * Created by kimsanghwan on 3/4/2014.
 */
public class Post {
    private int id;

    private int group_id;

    private String content;

    private int created_by;

    private String user_name;

    private Date time_ago;

    private Date date_created;

    private Date date_modified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getTime_ago() {
        return time_ago;
    }

    public void setTime_ago(Date time_ago) {
        this.time_ago = time_ago;
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
}
