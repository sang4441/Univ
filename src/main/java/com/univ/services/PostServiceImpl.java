package com.univ.services;

import com.univ.dao.PostDao;
import com.univ.model.Post;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;


public class PostServiceImpl implements PostService{

    @Autowired
    PostDao postDao;

    public List<Post> findPostByGroupId(int id) {
        List<Post> posts = postDao.getPostByGroupId(id);
        for (Post post : posts) {
            Date dateDiff = post.getTime_ago();
//            int seconds = dateDiff.;

        }

        return posts;
    }

    public void insertPost(Post post) {
        postDao.insertPosts(post);
    }
}
