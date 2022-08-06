package com.githubqszl.springbootmall.service;

import com.githubqszl.springbootmall.constant.ProductCategory;
import com.githubqszl.springbootmall.dto.ProductRequest;
import com.githubqszl.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
