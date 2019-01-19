package com.example.demo.bean;

public class Product {
    private String name;
    private Long id;
    private Double price;

    public Product() {
    }

    public Product(String name, Long id, Double price) {

        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setCount(Double price) {
        this.price = price;
    }
}
