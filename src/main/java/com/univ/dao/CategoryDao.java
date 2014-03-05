package com.univ.dao;

import com.univ.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CategoryDao {
    @Autowired
    DataSource dataSource;

    public List<Category> getCategoriesByParentId(int id) {
        String sql = "select * from categories where parent_id = ?";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Category> catetories  = jdbcTemplate.query(
                sql,
                new Object[] {id},
                new BeanPropertyRowMapper(Category.class));

        return catetories;
    }
}
