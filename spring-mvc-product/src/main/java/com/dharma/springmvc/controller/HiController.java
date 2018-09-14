package com.dharma.springmvc.controller;


import com.dharma.springmvc.model.Product;
import com.dharma.springmvc.service.IProductService;
import com.dharma.springmvc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //是一个组件
@RequestMapping("/")
public class HiController {
   // @RequestMapping(value = "/",method = RequestMethod.GET)
   /* public String Hi(ModelMap model){
        model.addAttribute("greeting","Hi")
                .addAttribute(888)
                .addAttribute("hhh","apollo");
        System.out.println(model.toString());
        return "index";
    }*/
   @Autowired
   IProductService productService;

   @GetMapping("/")
   public ResponseEntity<String> Hi(){
       return new ResponseEntity<>("restful spring-mvc",HttpStatus.OK);
    }



    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable long id){
       System.out.println("id is :"+id);
       Product product = productService.getProduct(id);

       if(product == null){
           System.out.println("id is:"+id+"is not found");
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);

       }
       return new ResponseEntity<>(product,HttpStatus.OK);
    }


    @GetMapping("/product/")
    public ResponseEntity<List<Product>> getProducts(){
        //System.out.println("/product............");
        List<Product> products = productService.getProducts();
        if(products.isEmpty()){
            return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
    }



    @PostMapping("/product/")
    public ResponseEntity<Void> createProduct(@RequestBody Product product){
       System.out.println("Create product:"+product.getName());

       if(productService.isProductExist(product)){
           return new ResponseEntity<>(HttpStatus.CONFLICT);
       }
       productService.addProduct(product);
       return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value="/product/delete/{id}",method=RequestMethod.DELETE)
    public ResponseEntity deleteProduct(@PathVariable("id") long id){
       System.out.println("deleteProduct id:"+id);
        Product p = productService.getProduct(id);
        if(p == null){
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
        productService.deleteProduct(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/product/update/{id}",method = RequestMethod.PUT)
    public ResponseEntity updateProduct(@PathVariable("id") long id,@RequestBody  Product product){
       System.out.println("updating id:"+id);
       Product p = productService.getProduct(id);
       if(p == null){
           return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
       }
       p.setId(product.getId());
       p.setName(product.getName());
       p.setPrice(product.getPrice());
       p.setCount(product.getCount());

       productService.updateProduct(p);
       return new ResponseEntity(p,HttpStatus.OK);
    }
}
