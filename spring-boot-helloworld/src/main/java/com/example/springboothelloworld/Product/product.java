package com.example.springboothelloworld.Product;

public class product {
    private long id;
    private String name;
    private Double price;

    public product(long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public product() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
