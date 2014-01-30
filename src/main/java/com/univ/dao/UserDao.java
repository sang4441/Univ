package com.univ.dao;

import com.univ.model.User;

/**
 * Created by sang4441 on 14-01-27.
 */
public interface UserDao {
    public void insertData(User user);

    public User getUserByEmail(String email);

}
