package com.group3.ctpjournal.controller;

import com.group3.ctpjournal.services.category.Category;
import com.group3.ctpjournal.services.category.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Category> findAll() {
        return service.findAll();
    }

    @PostMapping()
    public Category create(@RequestBody Category category) {
        return service.createCategory(category);
    }

    @GetMapping("{categoryId}")
    public Category read(@PathVariable Integer categoryId) {
        return service.readCategory(categoryId);
    }

    @PutMapping("{categoryId}")
    public Category update(@PathVariable Integer categoryId, @RequestBody Category category) {
        return service.updateCategory(category, categoryId);
    }

    @DeleteMapping("{categoryId}")
    public void delete(@PathVariable Integer categoryId) {
        service.deleteCategory(categoryId);
    }
}
