package com.patu.productshop.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    //select * from product where stock > 10;
    List<Product>findAllByStockGreaterThan(int stock);
    //select* from product name =? and category= ?
    List<Product>findAllByNameEqualsIgnoreCaseAndCategoryEqualsIgnoreCase(String name, String category);

    void deleteAllByCategoryEqualsIgnoreCase(String category);

    long countAllByCategory(String category);

}
