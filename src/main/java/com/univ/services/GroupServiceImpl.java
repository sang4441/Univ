package com.univ.services;

import com.univ.dao.GroupDao;
import com.univ.model.Group;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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

    @Override
    public List<Group> findGroupByCategoryId(int id) {
        return groupDao.getGroupById(id);
    }
}
