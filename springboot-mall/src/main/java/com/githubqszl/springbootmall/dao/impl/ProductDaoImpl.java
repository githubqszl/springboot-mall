package com.githubqszl.springbootmall.dao.impl;

import com.githubqszl.springbootmall.dao.ProductDao;
import com.githubqszl.springbootmall.model.Product;
import com.githubqszl.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    //@Autowired
    //写上边的会画红色波浪，改为下边的就好了
    @Resource
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer productId) {
        String sql = "SELECT product_id,product_name,category,image_url,price,stock,description,created_date,last_modified_date FROM product WHERE product_id = :productId";

        Map<String,Object> map = new HashMap<>();
        map.put("productId",productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if(productList.size() > 0){
            return productList.get(0);
        }else{
            return null;
        }

    }
}
