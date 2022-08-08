package com.githubqszl.springbootmall.service;

import com.githubqszl.springbootmall.dto.ProductQueryParams;
import com.githubqszl.springbootmall.dto.ProductRequest;
import com.githubqszl.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
