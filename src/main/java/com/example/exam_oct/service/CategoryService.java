package com.example.exam_oct.service;

import com.example.exam_oct.model.entity.Category;
import com.example.exam_oct.model.entity.CategoryNameEnum;

public interface CategoryService {
    void initCategories();

    Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum);
}
