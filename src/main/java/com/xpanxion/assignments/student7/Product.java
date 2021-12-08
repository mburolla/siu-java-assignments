package com.xpanxion.assignments.student7;

import java.math.BigDecimal;
import java.util.Objects;

public class Product extends Base {


    private String name;
    private double price;

    public Product (int id, String name, double price) {
        super(id);
        this.name=name;
        this.price=price;
    }

    //setters & getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
