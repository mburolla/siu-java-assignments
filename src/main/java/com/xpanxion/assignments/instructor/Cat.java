package com.xpanxion.assignments.instructor;

public class Cat {

    //
    // Data members
    //

    private String name;

    //
    // Constructors
    //

    public Cat(String name) {
        this.name = name;
    }

    //
    // Accessors
    //

    public String getName() {
        return name;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
