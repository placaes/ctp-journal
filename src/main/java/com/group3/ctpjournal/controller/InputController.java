package com.group3.ctpjournal.controller;


import com.group3.ctpjournal.services.input.Input;
import com.group3.ctpjournal.services.input.InputService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/inputs")
public class InputController {

    private final InputService service;

    public InputController(InputService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Input> findAll() {
        return service.findAll();
    }

    @PostMapping()
    public Input create(@RequestBody Input input) {
        return service.createInput(input);
    }

    @GetMapping("{inputId}")
    public Input read(@PathVariable Integer inputId) {
        return service.readInput(inputId);
    }

    @PutMapping("{inputId}")
    public Input update(@PathVariable Integer inputId, @RequestBody Input input) {
        return service.updateInput(input, inputId);
    }

    @DeleteMapping("{inputId}")
    public void delete(@PathVariable Integer inputId) {
        service.deleteInput(inputId);
    }
}
