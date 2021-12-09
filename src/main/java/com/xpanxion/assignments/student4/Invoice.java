package com.xpanxion.assignments.student4;


import java.util.ArrayList;
import java.util.List;

public class Invoice extends Base{
    private List<Product>product;
    public Invoice(int id) {
        super(id);
        this.product = new ArrayList<>();
    }
    public void addProduct(Product product) {
        this.product.add(product);
    }
    public double getTotalCost() {
        double value = 0.0;
        for (Product p : product) {
            value =value+ p.getCost();
        }
        return value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
