package com.group3.ctpjournal.controller;

import com.group3.ctpjournal.services.category.Category;
import com.group3.ctpjournal.services.category.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/categories")
public class CategoryController {

    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public List<Category> findAll() {
        return service.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping()
    public Category create(@RequestBody Category category) {
        return service.createCategory(category);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("{categoryId}")
    public Category read(@PathVariable Integer categoryId) {
        return service.readCategory(categoryId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("{categoryId}")
    public Category update(@PathVariable Integer categoryId, @RequestBody Category category) {
        return service.updateCategory(category, categoryId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("{categoryId}")
    public void delete(@PathVariable Integer categoryId) {
        service.deleteCategory(categoryId);
    }
}
