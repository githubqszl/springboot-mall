package com.githubqszl.springbootmall.dao;

import com.githubqszl.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
