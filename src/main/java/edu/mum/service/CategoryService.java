package edu.mum.service;

import edu.mum.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories();
    Category getCategoryById(Long id);
}
