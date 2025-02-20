package com.example.validation.application.validation_application.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CreditCard.class, name = "creditCard"),
        @JsonSubTypes.Type(value = BankAccount.class, name = "bankAccount")
})
public abstract class PaymentMethod {
    private String type;
}
