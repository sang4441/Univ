package com.univ.services;

import com.univ.dao.GroupDao;
import com.univ.model.Group;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kimsanghwan on 1/28/2014.
 */
public class GroupServiceImpl implements GroupService {

    @Autowired
    GroupDao groupDao;

    @Override
    public void insertGroup(Group group) {
        groupDao.insertData(group);
    }
}
