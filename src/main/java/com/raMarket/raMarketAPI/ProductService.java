package com.raMarket.raMarketAPI;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(1L, "Wireless Mouse", 799.99));
        productList.add(new Product(2L, "Gaming Chair", 5999.50));
        productList.add(new Product(3L, "Laptop Stand", 1499.00));
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public Product getProductById(Long id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                product.setProductName(updatedProduct.getProductName());
                product.setProductPrice(updatedProduct.getProductPrice());
                return product;
            }
        }
        return null;
    }

    public boolean deleteProduct(Long id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                productList.remove(product);
                return true;
            }
        }
        return false;
    }


}
