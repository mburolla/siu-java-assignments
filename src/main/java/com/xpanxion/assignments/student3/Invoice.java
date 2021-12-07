package com.xpanxion.assignments.student3;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private int id;
    private List<Product> products = new ArrayList<>();
    private double totalCost;

    public Invoice (int id){
        this.id = id;
    }

    public void addProduct(Product product){
        products.add(product);
        totalCost += product.getCost();

    }

    public double getTotalCost(){
        return totalCost;
    }
}
