package com.xpanxion.assignments.student5;

import java.util.ArrayList;
import java.util.List;

public class Invoice extends Base{
//
// Data members
//
    private List<Product> products = new ArrayList<>();
    private double totalCost;
//
// CONSTRUCTORS
//
    public Invoice(int id) {
        this.id = id;
    }
//
// PUBLIC METHODS
//
    public void addProduct(Product product) {
        products.add(product);
        totalCost += product.getProdCost();
    }
//
// PRIVATE METHODS
//

//
// GETTERS AND SETTERS
//
    public double getTotalCost() {
        return totalCost;
    }
}
