package com.xpanxion.assignments.student6;

public class Product {

    //MEM VARS
    private int id;
    private final String name;
    private final double cost;

    //CONSTRUCTOR
    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }
}
