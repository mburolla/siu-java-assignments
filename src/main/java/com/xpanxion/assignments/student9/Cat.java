package com.xpanxion.assignments.student9;

public class Cat {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Cat{").append("name='").append(name).append('\'').append('}').toString();
    }
}
