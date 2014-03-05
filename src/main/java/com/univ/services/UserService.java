package com.univ.services;

/**
 * Created by sang4441 on 14-01-27.
 */
import com.univ.model.User;

public interface UserService {

    public void insertUser(User user);

    public User findUserByEmail(String email);

    public User findUserById(int id);
}
