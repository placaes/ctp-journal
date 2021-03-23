package com.group3.ctpjournal.services.field;

import com.group3.ctpjournal.infrastructure.mysql.repository.FieldRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldService {
    private final FieldRepository repository;

    public FieldService(FieldRepository repository) {
        this.repository = repository;
    }

    public List<Field> findAll() {
        return FieldMapper.entityListToModelList(repository.findAll());
    }

    public Field createField(Field field) {
        return FieldMapper.entityToModel(repository.save(FieldMapper.modelToEntity(field)));
    }

    public Field readField(Integer fieldId) {
        return FieldMapper.entityToModel(repository.findById(fieldId).orElse(null));
    }

    public Field updateField(Field field, Integer fieldId) {
        return FieldMapper.entityToModel(repository.save(FieldMapper.modelToEntity(field)));
    }

    public void deleteField(Integer fieldId) {
        repository.deleteById(fieldId);
    }
}
