package com.example.validation.application.validation_application.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = CompanyEmailValidator.class)
public @interface ValidCompanyEmail {
    String message() default "Email must be from company domain";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
