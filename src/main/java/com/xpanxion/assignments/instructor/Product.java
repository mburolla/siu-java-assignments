package com.xpanxion.assignments.instructor;

public class Product {

    //
    // Data members
    //

    private int id;
    private String name;
    private double cost;

    //
    // Constructors
    //

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    //
    // Accessors
    //

    public double getCost() {
        return cost;
    }
}
