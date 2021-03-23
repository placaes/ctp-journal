package com.group3.ctpjournal.controller;


import com.group3.ctpjournal.services.input.Input;
import com.group3.ctpjournal.services.input.InputFilter;
import com.group3.ctpjournal.services.input.InputMapper;
import com.group3.ctpjournal.services.input.InputService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/inputs")
public class InputController {

    private final InputService service;

    public InputController(InputService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public List<Input> findAll() {
        return service.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping()
    public Input create(@RequestBody Input input) {
        return service.createInput(input);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("{inputId}")
    public Input read(@PathVariable Integer inputId) {
        return service.readInput(inputId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("{inputId}")
    public Input update(@PathVariable Integer inputId, @RequestBody Input input) {
        return service.updateInput(input, inputId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("{inputId}")
    public void delete(@PathVariable Integer inputId) {
        service.deleteInput(inputId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/find")
    public List<Input> readAll(@RequestBody InputFilter filter) {
        return service.readAll(filter);
    }

}
