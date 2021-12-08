package com.xpanxion.assignments.student8;

import java.util.ArrayList;

public class Invoice extends Base {

    // Data
    private int id;
    private ArrayList<Product> listOfProducts;

    // Constructor
    public Invoice(int id) {
        super(id);
        this.listOfProducts = new ArrayList<>();
    }

    protected void addProduct(Product product) {
        listOfProducts.add(product);
    }

    protected double getTotalCost() {
        double totalCost = 0.0;
        for (Product product : listOfProducts) {
            totalCost += product.getCost();
        }
        return totalCost;
    }


}
