package com.xpanxion.assignments.student1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Invoice extends Base {
    private final List<Product> products = new ArrayList<>();

    public Invoice(int id) {
        super(id);
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
