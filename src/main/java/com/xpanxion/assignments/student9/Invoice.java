package com.xpanxion.assignments.student9;

import java.util.ArrayList;
import java.util.Objects;

public class Invoice extends Base implements Comparable<Invoice>{
    private int id;
    private ArrayList<Product> productList;


    public Invoice(int id){
        super(id);
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public double getTotalCost(){
        var total = 0.0;
        for (var temp : this.productList){
           total += temp.getCost();
        }
        return total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.productList);
    }

    @Override
    public boolean equals(Object o){
        if(this == o ) return true;
        if(!(o instanceof Invoice)) return false;
        var that = (Invoice) o;
        return this.id == that.id && Objects.equals(this.productList,that.productList);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Invoice{").append("id=").append(id).append(", ProductList=").append(productList).append('}').toString();
    }

    @Override
    public int compareTo(Invoice o) {return this.id - o.id;}
}
