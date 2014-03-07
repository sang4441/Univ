package com.univ.dao;

import com.univ.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by kimsanghwan on 1/28/2014.
 */


public class GroupDao {

    @Autowired
    DataSource dataSource;

    public void insertGroupData(Group group, int userId, boolean isAdmin) {

        String sql = "INSERT INTO groups (name, description, type_id, category_id, date_created, created_by) VALUES (?, ?, ?, ?, ?, ?);";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql, new Object[]{group.getName(), group.getDescription(), group.getType_id(), group.getCategory_id(), group.getDate_created(), group.getCreated_by()});

        sql = "SELECT MAX(id) FROM groups";

        String LAST_INSERT_ID = (String)jdbcTemplate.queryForObject(sql, String.class);


        sql = "INSERT INTO userGroup (user_id, group_id, is_admin) VALUES (?, ?,?);";

        jdbcTemplate.update(
                sql, new Object[] {userId, LAST_INSERT_ID, isAdmin});

    }

    public List<Group> getGroupByCategoryId(int id) {

        String sql = "SELECT gr.*, ur.first_name as leaderName, ur.last_name FROM groups as gr\n" +
                "left join user as ur\n" +
                "on gr.leader_id = ur.id\n" +
                "where gr.category_id = ?; ";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Group> group  = jdbcTemplate.query(
                sql,
                new Object[] {id},
                new BeanPropertyRowMapper(Group.class));

        return group;
    }

    public List<Group> getGroupByUserId(int id) {

        String sql = "SELECT gr.* FROM groups as gr\n" +
                "left join userGroup as ur\n" +
                "on gr.id = ur.group_id\n" +
                "where ur.user_id = ?; ";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Group> group  = jdbcTemplate.query(
                sql,
                new Object[] {id},
                new BeanPropertyRowMapper(Group.class));
        return group;
    }

    public Group getGroupByGroupId(int id) {
        String sql = "SELECT * FROM groups where id = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        Group group = (Group)jdbcTemplate.queryForObject(
                sql,
                new Object[]{id},
                new BeanPropertyRowMapper(Group.class));
        return group;
    }

    public Boolean getAdminStatus(int groupId, int userId) {

        String sql = "SELECT is_admin FROM userGroup where group_id = ? and user_id = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Boolean isAdmin  = jdbcTemplate.queryForObject(
                sql,
                new Object[]{groupId, userId}, Boolean.class);
        return isAdmin;
    }
}

