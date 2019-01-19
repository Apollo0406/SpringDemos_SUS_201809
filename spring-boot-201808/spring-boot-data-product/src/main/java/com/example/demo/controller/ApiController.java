package com.example.demo.controller;

import com.example.demo.Dao.ProductDaoImpl;
import com.example.demo.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    ProductDaoImpl productDao;

    @PostMapping(value = "/hello")
    public HashMap<String, Object> get(@RequestParam String name){
        HashMap<String,Object> map = new HashMap<>();
        map.put("action","hello");
        map.put("name",name);
        logger.info(name + " said happy national day");
        return map;
    }

    @GetMapping("/product/get/{id}")
    public Product get(@PathVariable int id){
        return productDao.findById(id);
    }

    @PostMapping("/product/add/{name}/{price}")
    public int insert(@PathVariable String name,@PathVariable double price){
        Product product = new Product(name,price);
        return  productDao.insert(product);
    }

    @GetMapping("/product/get/name/{name}")
    public Product getByName(@PathVariable String name){
        return productDao.findByName(name);
    }

    @DeleteMapping("/product/delete/{name}")
    public int delete(@PathVariable String name){
        Product product = productDao.findByName(name);
        return productDao.delete(product.getId());
    }

    @GetMapping("/product")
    public List<Product> findAll(){
        return productDao.findAll();
    }
}
