package com.example.demo.Dao;

import com.example.demo.bean.Product;

import java.util.List;

public interface ProductDao {
    Product findById(int id);

    Product findByName(String name);

    int insert(Product product);

    int update(Product product);

    int delete(int id);

    List<Product> findAll();
}
