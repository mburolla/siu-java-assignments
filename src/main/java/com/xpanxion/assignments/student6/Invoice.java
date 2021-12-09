package com.xpanxion.assignments.student6;

import java.util.ArrayList;
import java.util.List;

public class Invoice extends Base {

    //MEM VARS
    //private final int id;
    private final List<Product> productList;

    //CONSTRUCTOR
    public Invoice(int id) {
        //this.id = id;
        super(id);
        this.productList = new ArrayList<>();
    }

    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    //METHODS

    public void addProduct(Product product) {

        this.productList.add(product);
    }

    public double getTotalCost() {
//        double totalCost = 0.0;

        //CHANGE TO STREAM FOREACH
        double totalCost = productList.stream().mapToDouble(Product::getCost).sum();

//        for (Product p : productList) {
//            totalCost += p.getCost();
//        }
        return totalCost;
    }
}
