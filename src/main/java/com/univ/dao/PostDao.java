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
        String sql = "select pt.*, CONCAT_WS(\" \", ur.first_name, ur.last_name) AS `user_name`, TIMEDIFF(NOW(), pt.date_created) as time_ago from posts pt\n" +
                "inner join users ur\n" +
                "on pt.created_by = ur.id\n" +
                "where pt.group_id = ?\n" +
                "order by pt.date_created desc";

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
