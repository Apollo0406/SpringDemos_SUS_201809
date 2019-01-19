package com.dhrama.spring.Controller;

import com.dhrama.spring.model.Product;
import com.dhrama.spring.service.ProductService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public @ResponseBody String  welcome(){
        return "welcome";
    }

    @GetMapping("/product")
    public @ResponseBody List<Product> getAll(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/getid/{id}")
    public @ResponseBody Product getById(@PathVariable  long id){
        return productService.getById(id);
    }

    @GetMapping("/product/getname/{name}")
    public @ResponseBody List<Product> getByName(@PathVariable String name){
        return productService.getByName(name);
    }

    @DeleteMapping("product/{id}")
    public HttpStatus deleteProduct(@PathVariable long id){
        productService.deleteProduct(id);
        return HttpStatus.NO_CONTENT;
    }

    @PostMapping("/product")
    public HttpStatus addProduct(@RequestBody Product product){
        return  productService.updateProduct(product)? HttpStatus.CREATED:HttpStatus.BAD_REQUEST;

    }
}
