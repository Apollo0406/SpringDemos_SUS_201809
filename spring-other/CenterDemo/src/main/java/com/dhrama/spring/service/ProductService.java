package com.dhrama.spring.service;

import com.dhrama.spring.model.Product;
import com.dhrama.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Transactional
    public List<Product> getAllProducts(){
        return (List<Product>)productRepository.findAll();
    }

    @Transactional
    public Product getById(long id){
        return productRepository.findOne(id);
    }

    @Transactional
    public List<Product> getByName(String name){
        return productRepository.findByName(name);
    }

    @Transactional
    public void deleteProduct(long productId){
        productRepository.delete(productId);
    }

    @Transactional
    public void deleteAllProducts(){
        productRepository.deleteAll();
    }

    @Transactional
    public boolean updateProduct(Product product){
        return productRepository.save(product)!= null;
    }
}
