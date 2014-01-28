package com.univ.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.univ.model.User;
/**
 * Created by sang4441 on 14-01-27.
 */
public class UserDaoImpl implements UserDao{
    @Autowired
    DataSource dataSource;

    public void insertData(User user) {

        String sql = "INSERT INTO user (email, password, first_name, last_name) VALUES (?, ?, ?, ?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql,
                new Object[] { user.getEmail(), user.getPassword(),
                        user.getFirstName(), user.getLastName() });
    }
}
