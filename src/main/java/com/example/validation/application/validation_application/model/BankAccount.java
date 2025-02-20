package com.example.validation.application.validation_application.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BankAccount extends PaymentMethod {
    private String routingNumber;

    private String accountNumber;
}