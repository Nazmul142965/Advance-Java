package com.patu.notunproject;

import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class carForm {

    @NotBlank(message = "Car name is required")
    private String name;
    @NotBlank(message = "Car model is required")
    private String year;
    @NotBlank(message = "Car price is required")
    @Positive(message = "Car price must be a positive number")
    private String price;
    @NotBlank(message = "Car license is required")
    private String license;
}
