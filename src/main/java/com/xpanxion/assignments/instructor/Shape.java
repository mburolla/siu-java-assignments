package com.xpanxion.assignments.instructor;

public abstract class Shape {

    protected String name;
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract String draw();
}
