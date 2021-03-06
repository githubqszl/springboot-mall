package com.githubqszl.springbootmall.dao;

import com.githubqszl.springbootmall.dto.ProductRequest;
import com.githubqszl.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
