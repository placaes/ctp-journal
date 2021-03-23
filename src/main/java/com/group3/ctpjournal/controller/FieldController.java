package com.group3.ctpjournal.controller;

import com.group3.ctpjournal.services.field.Field;
import com.group3.ctpjournal.services.field.FieldService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/fields")
public class FieldController {
    private final FieldService service;

    public FieldController(FieldService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public List<Field> findAll() {
        return service.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping()
    public Field create(@RequestBody Field field) {
        return service.createField(field);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("{fieldId}")
    public Field read(@PathVariable Integer fieldId) {
        return service.readField(fieldId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("{fieldId}")
    public Field update(@PathVariable Integer fieldId, @RequestBody Field field) {
        return service.updateField(field, fieldId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("{fieldId}")
    public void delete(@PathVariable Integer fieldId) {
        service.deleteField(fieldId);
    }
}
