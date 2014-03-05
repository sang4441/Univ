package com.univ.services;

import com.univ.model.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> findTopCategories();

    public List<Category> findChildCategoryById(int id);
}
