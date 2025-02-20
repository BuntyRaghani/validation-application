package com.example.validation.application.validation_application.controller;

import com.example.validation.application.validation_application.model.User;
import com.example.validation.application.validation_application.service.UserService;
import com.example.validator.service.ValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/abc")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        try {
            User createdUser = userService.createUser(user);
            return ResponseEntity.ok(createdUser);
        } catch (ValidationService.ValidationException ex) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "error", "Validation failed",
                            "details", "error")
            );
        }
    }
}