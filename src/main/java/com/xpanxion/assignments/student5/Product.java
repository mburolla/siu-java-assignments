package com.xpanxion.assignments.student5;

public class Product extends Base{
    private String prodName;
    private double prodCost;

    public Product(int id, String prodName, double prodCost) {
        this.id = id;
        this.prodName = prodName;
        this.prodCost = prodCost;
    }

//
// GETTERS AND SETTERS
//
    public int getId() {return id;}
    public String getProdName() {return prodName;}
    public double getProdCost() {return prodCost;}

    public void setId(int id) {
        this.id = id;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdCost(double prodCost) {
        this.prodCost = prodCost;
    }
}

