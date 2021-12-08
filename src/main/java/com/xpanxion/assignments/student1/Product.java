package com.xpanxion.assignments.student1;

public class Product extends Base {
    private String productName;
    private double productPrice;

    public Product(int pid, String pName, double price) {
        super(pid);
        this.productName = pName;
        this.productPrice = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

}
