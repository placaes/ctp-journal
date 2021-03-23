package com.group3.ctpjournal.services.category;

import com.group3.ctpjournal.infrastructure.mysql.repository.CategoryRepository;
import com.group3.ctpjournal.services.field.Field;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        return CategoryMapper.entityListToModelList(repository.findAll());
    }

    public Category createCategory(Category category) {
        return CategoryMapper.entityToModel(repository.save(CategoryMapper.modelToEntity(category)));
    }

    public Category readCategory(Integer categoryId) {
        return CategoryMapper.entityToModel(repository.findById(categoryId).orElse(null));
    }

    public Category updateCategory(Category category, Integer categoryId) {
        return CategoryMapper.entityToModel(repository.save(CategoryMapper.modelToEntity(category)));
    }

    public void deleteCategory(Integer categoryId) {
        repository.deleteById(categoryId);
    }
}
