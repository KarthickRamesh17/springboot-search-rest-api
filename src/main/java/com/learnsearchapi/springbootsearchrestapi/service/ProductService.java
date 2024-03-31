package com.learnsearchapi.springbootsearchrestapi.service;

import com.learnsearchapi.springbootsearchrestapi.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
