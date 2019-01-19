package com.dharma.springmvc.service;

import com.dharma.springmvc.model.Product;
//import oracle.jvm.hotspot.jfr.Producer;

import java.util.List;

public interface IProductService {

    List<Product> getProducts();

    Product getProduct(long id);

    boolean isProductExist(Product product);

    void addProduct(Product product);

    void deleteProduct(long id);

    void updateProduct(Product product);
}
