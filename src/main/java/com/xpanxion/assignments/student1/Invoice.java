package com.xpanxion.assignments.student1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Invoice {
    private final List<Product> products = new ArrayList<>();
    private int invoiceID;

    public Invoice(int iID) {
        this.invoiceID = iID;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalCost() {
        var totalCost = products
                .stream()
                .map(Product::getProductPrice)
                .reduce(Double::sum);

        return totalCost.orElse(1.00);
    }
}
