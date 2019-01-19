package com.example.demo.bean;

public class Product {
    private int id;
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {

        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCount(Double price) {
        this.price = price;
    }
}
