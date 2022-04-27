package com.xpanxion.assignments.instructor;

public final class Circle extends Shape {

    public Circle(String color) {
        super(color);
    }

    @Override
    public String draw() {
        return "I am a " + this.color + " circle.";
    }
}
