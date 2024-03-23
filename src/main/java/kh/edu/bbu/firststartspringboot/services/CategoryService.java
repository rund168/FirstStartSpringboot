package kh.edu.bbu.firststartspringboot.services;

import kh.edu.bbu.firststartspringboot.models.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    List<Category> getAllCategoriesByStatus(String status);
    void create(Category category);
    Category getCategoryById(Integer id);
}
