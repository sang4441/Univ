package com.univ.dao;

import com.univ.model.Group;

import java.util.List;

/**
 * Created by kimsanghwan on 1/28/2014.
 */
public interface GroupDao {
    public void insertData(Group group);

    public List<Group> getGroupById(int id);
}
