package com.example.onlineschool.controller;

import com.example.onlineschool.model.Student;
import com.example.onlineschool.model.User;
import com.example.onlineschool.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {
    private final UserServiceImpl userService;

    @Autowired
    public AuthController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public void createUser(@RequestBody User user) {
        System.out.println("auth create completed");
        userService.create(user);
    }
}

