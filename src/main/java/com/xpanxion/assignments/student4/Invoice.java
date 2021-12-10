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
        double value;
        value = product.stream().mapToDouble(Product::getCost).sum();           //for (Product p : product) {
        return value;                                                           //value =value+ p.getCost();
    }                                                                           // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
