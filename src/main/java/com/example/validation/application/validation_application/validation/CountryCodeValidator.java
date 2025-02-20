package com.example.validation.application.validation_application.validation;

import com.example.validation.application.validation_application.model.CountryCode;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CountryCodeValidator
        implements ConstraintValidator<ValidCountryCode, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            CountryCode.valueOf(value);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
