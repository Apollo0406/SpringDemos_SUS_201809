package com.example.springboothelloworld.Controller;

import com.example.springboothelloworld.Product.product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/{id}")
    public product getById(@PathVariable("id") long id){
            return new product (id,"myproduct",445.2);
    }
}
