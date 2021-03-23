package com.group3.ctpjournal.controller;

import com.group3.ctpjournal.services.user.User;
import com.group3.ctpjournal.services.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public List<User> findAll() {
        return service.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping()
    public User create(@RequestBody User user) {
        return service.createUser(user);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("{userId}")
    public User read(@PathVariable Integer userId) {
        return service.readUser(userId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("{userId}")
    public User update(@PathVariable Integer userId, @RequestBody User user) {
        return service.updateUser(user, userId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("{userId}")
    public void delete(@PathVariable Integer userId) {
        service.deleteUser(userId);
    }
}
