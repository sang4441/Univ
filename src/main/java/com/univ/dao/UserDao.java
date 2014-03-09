package com.univ.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.univ.model.User;

import java.util.List;

/**
 * Created by sang4441 on 14-01-27.
 */
public class UserDao {
    @Autowired
    DataSource dataSource;

    public void insertData(User user) {

        String sql = "INSERT INTO users (email, student_number, password, first_name, last_name) VALUES (?, ?, ?, ?, ?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
           sql,
                new Object[] { user.getEmail(), user.getStudent_number(), user.getPassword(),
                        user.getFirstName(), user.getLastName() });
    }

    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM users where email = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<User> users = jdbcTemplate.query(sql, new Object[]{email}, new BeanPropertyRowMapper(User.class));
        if (users.size() < 1) {
            return new User();
        }
        return users.get(0);
    }

    public User getUserById(int id) {
        String sql = "SELECT * FROM users where id = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<User> users = jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(User.class));
        if (users.size() < 1) {
            return new User();
        }
        return users.get(0);
    }
}
