package kh.edu.bbu.firststartspringboot.services.impl;

import kh.edu.bbu.firststartspringboot.constants.Constants;
import kh.edu.bbu.firststartspringboot.models.Category;
import kh.edu.bbu.firststartspringboot.repositories.CategoryRepository;
import kh.edu.bbu.firststartspringboot.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAllByStatusInOrderByIdDesc(Constants.getAllStatusString());
    }

    @Override
    public List<Category> getAllCategoriesByStatus(String status) {
        return categoryRepository.findAllByStatus(status);
    }

    @Override
    public void create(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
