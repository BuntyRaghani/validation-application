package com.example.validation.application.validation_application.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class CreditCard extends PaymentMethod {
    private String number;

    private LocalDate expiryDate;

    private int cvv;
}
