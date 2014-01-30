package com.univ.dao;

import com.univ.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

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
}

