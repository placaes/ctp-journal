package com.group3.ctpjournal.services.input;

import com.group3.ctpjournal.infrastructure.mysql.repository.InputRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InputService {

    private final InputRepository repository;

    public InputService(InputRepository repository) {
        this.repository = repository;
    }

    public List<Input> findAll() {
        return InputMapper.entityListToModelList(repository.findAll());
    }

    public Input createInput(Input input) {
        return InputMapper.entityToModel(repository.save(InputMapper.modelToEntity(input)));
    }

    public Input readInput(Integer inputId) {
        return InputMapper.entityToModel(repository.findById(inputId).orElse(null));
    }

    public Input updateInput(Input input, Integer inputId) {
        return InputMapper.entityToModel(repository.save(InputMapper.modelToEntity(input)));
    }

    public void deleteInput(Integer inputId) {
        repository.deleteById(inputId);
    }

    public void readAll(InputFilter filter) {
        repository.findAllWithFilters(filter.getDate().minusDays(1), filter.getDate().plusDays(1));
    }
}
