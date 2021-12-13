package com.xpanxion.assignments.student4;

public class Product extends Base {
    String name;
    double cost;


     public Product(int id, String name, double cost) {
         super(id);
        this.name = name;
        this.cost = cost;
    }
    public double getCost(){
        return cost;
    }

}
