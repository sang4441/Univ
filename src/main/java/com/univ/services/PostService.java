package com.univ.services;

import com.univ.model.Post;

import java.util.List;

public interface PostService {
    public List<Post> findPostByGroupId(int id);

    public void insertPost(Post post);
}
