package com.xpanxion.assignments.student3;

public class Product extends Base {

    //private int id;
    private String name;
    private double cost;

    public Product (int id, String name, double cost){
        super(id);
        //this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public double getCost(){
        return cost;
    }

}
