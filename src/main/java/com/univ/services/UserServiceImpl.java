package com.univ.services;

import com.univ.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import com.univ.model.User;

/**
 * Created by sang4441 on 14-01-27.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userdao;

    @Override
    public void insertUser(User user) {
        userdao.insertData(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userdao.getUserByEmail(email);
    }

    @Override
    public User findUserById(int id) {
        return userdao.getUserById(id);
    }
}
