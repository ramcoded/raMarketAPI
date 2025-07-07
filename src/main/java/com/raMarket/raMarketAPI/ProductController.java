package com.raMarket.raMarketAPI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1L, "Wireless Mouse", 799.99),
                new Product(2L, "Gaming Chair", 5999.50),
                new Product(3L, "Laptop Stand", 1499.00)
        );
    }
}
