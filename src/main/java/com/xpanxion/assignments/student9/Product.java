package com.xpanxion.assignments.student9;

import java.util.Objects;

public class Product extends Base implements Comparable<Product>{
    private int id;
    private String name;
    private double cost;

    public Product(int id, String name, double cost){
       super(id);
        this.name = name;
        this.cost = cost;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Product{").append("id=").append(id).append(", name='").append(name).append('\'').append(", cost=").append(cost).append('}').toString();
    }

    @Override
    public int compareTo(Product o) {
        var comparison = this.name.compareTo(o.name);
        return comparison == 0 ? Double.compare(this.cost,o.cost) : comparison;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.cost);
    }

    @Override
    public boolean equals (Object o){
        if(this == o ) return true;
        if(!(o instanceof Product)) return false;
        var that = (Product) o;
        return this.id == that.id && Objects.equals(this.name, that.name) && this.cost == that.cost;
    }
}
