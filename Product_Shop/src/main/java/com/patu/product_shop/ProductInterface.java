package com.patu.product_shop;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInterface extends JpaRepository<Product, Integer> {

}
