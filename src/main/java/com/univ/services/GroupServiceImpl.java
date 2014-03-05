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
    public void createGroup(Group group, int userId) {
        groupDao.insertGroupData(group, userId, true);
    }

    @Override
    public void insertGroup(Group group) {
//        groupDao.insertGroupData(group);
    }

    @Override
    public List<Group> findGroupByCategoryId(int id) {
        return groupDao.getGroupByCategoryId(id);
    }

    @Override
    public List<Group> findGroupByUserId(int id) {
        return groupDao.getGroupByUserId(id);
    }

    @Override
    public Group findGroupByGroupId(int id) {
        return groupDao.getGroupByGroupId(id);
    }

    @Override
    public boolean isUserAdmin(int groupId, int userId) {
        return groupDao.getAdminStatus(groupId, userId);
    }
}
