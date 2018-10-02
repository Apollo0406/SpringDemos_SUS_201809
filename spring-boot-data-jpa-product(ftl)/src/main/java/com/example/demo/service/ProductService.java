package com.example.demo.service;

import com.example.demo.Dao.ProductJpaDao;
import com.example.demo.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductJpaDao productDao;

    public List<Product> getProducts(){
        return (List<Product>) productDao.findAll();
    }

    public Product getById(int id) {
        return productDao.findOne(id);
    }

    public List<Product> getProductByName(String name){
        return productDao.findByName(name);
    }

    public List<Product> getProductByNameAndPrice(String name,double price){
        return productDao.findByNameAndPrice(name,price);
    }

    public Product addProduct(String name,double price){
        return productDao.save(new Product(name,price));
    }

    public Product updateProduct(int id,String name,double price){
        return productDao.save(new Product(id,name,price));
    }

    public void deleteProduct(int id){
        productDao.delete(id);
    }
}
