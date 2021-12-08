package com.xpanxion.assignments.student8;

public class Cat {

    // Data

    private String name;

    // Constructor

    public Cat(String name) {
        this.name = name;
    }

    // Override

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
