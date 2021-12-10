package com.xpanxion.assignments.student1;

public class Circle extends Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return "I am a " + color + " circle.";
    }
}
