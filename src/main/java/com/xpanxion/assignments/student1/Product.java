package com.xpanxion.assignments.student1;

public class Product {
    private int productID;
    private String productName;
    private double productPrice;

    public Product(int pid, String pName, double price) {
        this.productID = pid;
        this.productName = pName;
        this.productPrice = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
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
