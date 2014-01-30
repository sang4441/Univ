package com.univ.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.univ.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM user where email = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        jdbcTemplate.


        List<User> users = jdbcTemplate.query(sql, new Object[]{email}, new BeanPropertyRowMapper(User.class));
        if (users.size() < 1) {
            return new User();
        }
        return users.get(0);
    }
}
