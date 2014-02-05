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


public class GroupDaoImpl implements GroupDao{

    @Autowired
    DataSource dataSource;

    public void insertData(Group group) {

        String sql = "INSERT INTO groups (name, description, type_id, category_id) VALUES (?, ?, ?, ?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql,
                new Object[] { group.getName(), group.getDescription(),
                        group.getTypeId(), group.getCategory_id() });
    }

    public List<Group> getGroupById(int id) {

        String sql = "SELECT * FROM groups where category_id = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        List<Group> groups = new ArrayList<Group>();

        List<Group> group  = jdbcTemplate.query(sql,
                new BeanPropertyRowMapper(Group.class));
//        List<Group> rows = jdbcTemplate.queryForList(sql, new Object[]{id});
//        for (Map row : rows) {
//            Group group = new Group();
//            group.setName(row.get("name"));
//            group.setName((String)row.get("NAME"));
//            group.setAge((Integer)row.get("AGE"));
//            group.add(customer);
//        }
        return group;
    }
}

