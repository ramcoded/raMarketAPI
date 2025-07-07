package com.raMarket.raMarketAPI;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1L, "Wireless Mouse", 799.99),
                new Product(2L, "Gaming Chair", 5999.50),
                new Product(3L, "Laptop Stand", 1499.00)
        );
    }
}
