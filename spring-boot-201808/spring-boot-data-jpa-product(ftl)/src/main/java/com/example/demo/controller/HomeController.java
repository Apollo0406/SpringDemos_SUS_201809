package com.example.demo.controller;

import com.example.demo.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/home")
public class HomeController {

    private static final Logger logger  = LoggerFactory.getLogger(HomeController.class);

    @Value(value = "${home}")
    private String title;
    @Value(value = "${home.teacher}")
    private String teacher;
    @Value(value =  "${home.project}")
    private String project;
    @Value(value = "${home.number}")
    private Integer number;

    @Value("#{product}")
    private Product product;
    @Bean
    public Product product(){
        return new Product(1, "apple",123.33);
    }
    @RequestMapping
    public String home(){
        logger.info("this is a log test info");
        logger.error("this is a log test info");
        return "welcome to my home";
    }
    @GetMapping("/get")
    public HashMap<String,Object> getProducts(@RequestParam String name){
        HashMap<String,Object> map = new HashMap<>();
        map.put("title",title);
        map.put("name",name);
        map.put("teacher",teacher);
        map.put("project",project);
        map.put("number",number);
        map.put("product",product);
        return map;
    }

    @GetMapping("/product/{name}/{price}")
    public Product getProduct(@PathVariable String name,@PathVariable Double price){
        return new Product(4,name,price);
    }
}
