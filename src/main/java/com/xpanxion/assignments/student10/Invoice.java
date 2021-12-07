package com.xpanxion.assignments.student10;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private int id;

    private List<Product> productList = new ArrayList<>();

    public Invoice(int id){
        this.id = id;
    }
    public int getId() {return this.id;}

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double getTotalCost() {
        double total = 0.00;
        for (Product product : productList) {
            total = total + product.getCost();
        }
        return total;
    }
}
