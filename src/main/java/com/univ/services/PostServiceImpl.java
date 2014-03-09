package com.univ.services;

import com.univ.dao.PostDao;
import com.univ.model.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class PostServiceImpl implements PostService{

    @Autowired
    PostDao postDao;

    public List<Post> findPostByGroupId(int id) {
        return postDao.getPostByGroupId(id);
    }

    public void insertPost(Post post) {
        postDao.insertPosts(post);
    }
}
