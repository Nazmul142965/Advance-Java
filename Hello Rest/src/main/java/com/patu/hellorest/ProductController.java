package com.patu.hellorest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getAll(){
        return productService.findAll();
    }

    @PostMapping("/products")
    public Product save(@RequestBody Product product){
        return productService.create(product);
    }

    @PutMapping("/products/{id}")
    public Product update(@PathVariable String id, @RequestBody Product product ){
        return productService.update(id, product);

    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable String id){
        return productService.findById(id);
    }

    @DeleteMapping("/products/{id}")
    public void delete(@PathVariable String id) {
        productService.delete(id);
    }


}
