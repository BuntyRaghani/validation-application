package com.example.validation.application.validation_application.service;

import com.example.validation.application.validation_application.model.User;
import org.springframework.stereotype.Service;
import com.example.validator.service.ValidationService;

@Service
public class UserService {
    private final ValidationService validationService;

    public UserService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public User createUser(User user) {
        validationService.validate(user);
        // Add business logic here
        return user;
    }
}
