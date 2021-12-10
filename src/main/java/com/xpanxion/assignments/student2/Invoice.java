package com.xpanxion.assignments.student2;

import java.util.ArrayList;
import java.util.List;

public class Invoice extends Base {

    int invoiceId;
    private final List<Product> products = new ArrayList<>();

    Invoice(int invoiceId) {
        super();
        this.invoiceId = invoiceId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    double getTotalCost() {
        double totalCost = 0;
        totalCost = products.stream()
                .mapToDouble(Product::getProductCost)
                .sum();
        return totalCost;
    }
}
