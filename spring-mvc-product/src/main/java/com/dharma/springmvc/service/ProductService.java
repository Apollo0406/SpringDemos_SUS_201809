package com.dharma.springmvc.service;

import com.dharma.springmvc.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService implements IProductService {

    private static final AtomicLong counter = new AtomicLong();
    private static List<Product> products;

    static {
        products = initData();
    }

    private static List<Product> initData() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(counter.incrementAndGet(),"iphone xs",9999,100));
        products.add(new Product(counter.incrementAndGet(),"mate 2",2999,90));
        products.add(new Product(counter.incrementAndGet(),"MI",3899,80));
        return products;
    }

    @Override
    public  List<Product> getProducts() {
        return products;
    }

    @Override
    public Product getProduct(long id){
        for(Product p : products){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean isProductExist(Product product){
        for(Product p : products){
            if(p.getName().equalsIgnoreCase(product.getName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addProduct(Product product){
        product.setId(counter.incrementAndGet());
        products.add(product);
    }

    @Override
    public void deleteProduct(long id) {
        //按照拿到的id去遍历寻找该商品，直接从模拟数据库中将该商品remove()
        for(Product p : products){
            if(p.getId() == id){
                products.remove(p);
            }
        }

    }

    @Override
    public void updateProduct(Product product) {
        int index = products.indexOf(product);
        products.set(index,product);
    }
}

