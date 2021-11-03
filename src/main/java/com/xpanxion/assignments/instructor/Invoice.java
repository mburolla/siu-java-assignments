package com.xpanxion.assignments.instructor;

import java.util.ArrayList;
import java.util.List;

public class Invoice extends Base {

    //
    // Data Members
    //

    //private final int id;
    private final List<Product>productList;

    //
    // Constructors
    //

    public Invoice(int id) {
        //this.id = id;
        super(id);
        this.productList = new ArrayList<>();
    }

    //
    // Methods
    //

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public double getTotalCost() {
        double retval = 0.0;
        for (Product p: productList) {
            retval += p.getCost();
        }
        return retval;
    }
}
