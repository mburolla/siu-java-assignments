package com.xpanxion.assignments.instructor;

public class Product extends Base {

    //
    // Data members
    //

    //private int id;
    private final String name;
    private final double cost;

    //
    // Constructors
    //

    public Product(int id, String name, double cost) {
        //this.id = id;
        super(id);
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
