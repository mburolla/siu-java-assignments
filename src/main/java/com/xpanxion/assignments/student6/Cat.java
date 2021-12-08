package com.xpanxion.assignments.student6;

public class Cat {

    //MEM VARS
    private String name;

    //CONSTRUCTOR

    public Cat(String name) {
        this.name = name;
    }

    //GETTER AND SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
