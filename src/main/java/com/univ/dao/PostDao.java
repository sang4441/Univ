package com.univ.dao;

import com.univ.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by kimsanghwan on 3/8/2014.
 */
public class PostDao {

    @Autowired
    DataSource dataSource;

    public List<Post> getPostByGroupId(int groupId) {
        String sql = "select * from posts where group_id = ? order by date_created desc";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Post> Posts  = jdbcTemplate.query(
                sql,
                new Object[] {groupId},
                new BeanPropertyRowMapper(Post.class));

        return Posts;
    }

    public void insertPosts(Post post) {
        String sql = "INSERT INTO posts (group_id, content, created_by, date_created) VALUES (?, ?, ?, ?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(
                sql,
                new Object[] {post.getGroup_id(), post.getContent(), post.getCreated_by(), post.getDate_created()});
    }
}
