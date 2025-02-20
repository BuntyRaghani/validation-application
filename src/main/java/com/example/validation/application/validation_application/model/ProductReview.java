package com.example.validation.application.validation_application.model;

import lombok.Data;

import java.time.LocalDate;

@Data


public class ProductReview {
    private int rating;

    private String comment;

    private LocalDate reviewDate;
}
