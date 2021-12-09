package com.xpanxion.assignments.student10;

import java.util.ArrayList;
import java.util.List;

public class Invoice extends Base {

    private List<Product> productList = new ArrayList<>();

    public Invoice(int id){
        this.id = id;
    }
    public int getId() {return this.id;}

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double getTotalCost() {
        double total = productList.stream().mapToDouble(Product::getCost).sum();
        return total;
    }
}
