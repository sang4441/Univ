package com.univ.services;

import com.univ.dao.CategoryDao;
import com.univ.model.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> findTopCategories() {
        return categoryDao.getCategoriesByParentId(1);
    }

    @Override
    public List<Category> findChildCategoryById(int id) {
        return categoryDao.getCategoriesByParentId(id);
    }
}
