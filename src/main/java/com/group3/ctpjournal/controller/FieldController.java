package com.group3.ctpjournal.controller;

import com.group3.ctpjournal.services.field.Field;
import com.group3.ctpjournal.services.field.FieldService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/fields")
public class FieldController {
    private final FieldService service;

    public FieldController(FieldService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Field> findAll() {
        return service.findAll();
    }

    @PostMapping()
    public Field create(@RequestBody Field field) {
        return service.createField(field);
    }

    @GetMapping("{fieldId}")
    public Field read(@PathVariable Integer fieldId) {
        return service.readField(fieldId);
    }

    @PutMapping("{fieldId}")
    public Field update(@PathVariable Integer fieldId, @RequestBody Field field) {
        return service.updateField(field, fieldId);
    }

    @DeleteMapping("{fieldId}")
    public void delete(@PathVariable Integer fieldId) {
        service.deleteField(fieldId);
    }
}
