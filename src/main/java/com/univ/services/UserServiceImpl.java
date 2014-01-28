package com.univ.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.univ.dao.UserDao;
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
}
