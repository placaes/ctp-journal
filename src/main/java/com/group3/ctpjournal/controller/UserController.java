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

    @GetMapping()
    public List<User> findAll() {
        return service.findAll();
    }

    @PostMapping()
    public User create(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("{userId}")
    public User read(@PathVariable Integer userId) {
        return service.readUser(userId);
    }

    @PutMapping("{userId}")
    public User update(@PathVariable Integer userId, @RequestBody User user) {
        return service.updateUser(user, userId);
    }

    @DeleteMapping("{userId}")
    public void delete(@PathVariable Integer userId) {
        service.deleteUser(userId);
    }
}
