package com.xpanxion.assignments.student2;

public class Product extends Base {

    private final int productId;
    private final String productName;
    private final double productCost;

    Product(int productId, String productName, double productCost) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    double getProductCost() {
        return productCost;
    }
}
