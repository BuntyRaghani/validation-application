package com.example.validation.application.validation_application.validation;

import com.example.validation.application.validation_application.model.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.regex.Pattern;

public class CompanyEmailValidator
        implements ConstraintValidator<ValidCompanyEmail, User> {

    private static final Pattern COMPANY_PATTERN = Pattern.compile(".+@company\\.com$");

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        return COMPANY_PATTERN.matcher(user.getEmail()).matches();
    }
}

