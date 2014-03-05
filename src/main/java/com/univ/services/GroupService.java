package com.univ.services;

import com.univ.model.Group;

import java.util.List;

/**
 * Created by kimsanghwan on 1/28/2014.
 */
public interface GroupService {

    public void createGroup(Group group, int userId);

    public void insertGroup(Group group);

    public List<Group> findGroupByCategoryId(int id);

    public List<Group> findGroupByUserId(int id);

    public Group findGroupByGroupId(int id);

    public boolean isUserAdmin(int groupId, int userId);
}
