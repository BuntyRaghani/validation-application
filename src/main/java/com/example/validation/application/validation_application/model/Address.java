package com.example.validation.application.validation_application.model;

import lombok.Data;

@Data
public class Address {

    private String street;

    private String city;

    private String zipCode;

    private String countryCode;
}
