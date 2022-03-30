package com.example.jonlineshop.services;

import com.example.jonlineshop.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();
    private long id = 0;

    {
        products.add(new Product(++id, "PS 5", "PlayStation", "Saint-Petersburg", "Alex", 65_000));
        products.add(new Product(++id, "Apple Iphone", "Iphone", "Moscow", "Aurora", 25_000));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++id);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id))
                return product;
        }
        return null;
    }
}
