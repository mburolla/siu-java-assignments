package com.xpanxion.assignments.student7;

import java.util.ArrayList;
import java.util.List;

public class Invoice extends Base {

    private Product product;
    private List<Product> listOfProducts = new ArrayList<Product>();

    public Invoice(int id) {
       super(id);
    }

    public void addProduct(Product product) {
        listOfProducts.add(product);
    }

    public double getTotalCost() {
         double calculatedTotal = 0;
        for (Product product: listOfProducts) {
           calculatedTotal = Double.sum(calculatedTotal,product.getPrice());
        }
        return calculatedTotal;
    }













}
