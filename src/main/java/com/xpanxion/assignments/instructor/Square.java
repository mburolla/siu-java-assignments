package com.xpanxion.assignments.instructor;

public final class Square extends Shape {

    public Square(String color) {
        super(color);
    }

    @Override
    public String draw() {
        return "I am a " + this.color + " square.";
    }
}
