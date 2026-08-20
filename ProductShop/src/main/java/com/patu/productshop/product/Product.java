package com.patu.productshop.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
    @Id
    @NotNull
    @Min(value = 1, message = "Id must be greater than 0")
    @Max(value = 1000000, message = "Id must be less than 1000000")
    private Integer id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotEmpty(message = "Category cannot be empty")
    private String category;

    @NotNull(message = "Stock is required")
    @PositiveOrZero(message = "Stock must be positive or zero")
    private int stock;

    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.001", message = "Price must be less than 1000")
    @DecimalMax(value = "999.99", message = "Price must be less than 1000")
    private Double price;

    private String status;
    
}
