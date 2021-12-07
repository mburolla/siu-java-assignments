package com.xpanxion.assignments.student10;

public class Product {

    private int id;
    private String name;
    private double cost;

    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() {return this.id;}
    public String getName() {return this.name;}
    public double getCost() {return this.cost;}
}
