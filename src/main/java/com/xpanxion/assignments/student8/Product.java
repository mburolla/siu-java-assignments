package com.xpanxion.assignments.student8;

public class Product {

    // Data
    private int id;
    private String name;
    private double cost;

    // Constructor
    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    // Accessors

    public double getCost() {
        return cost;
    }
}
