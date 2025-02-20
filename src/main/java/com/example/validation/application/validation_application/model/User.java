package com.example.validation.application.validation_application.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class User {
    private String name;

    private String email;

    private String password;

    private int age;

    private Address address;

    private List<PaymentMethod> paymentMethods;

    private Map<String, ProductReview> reviews;
}
