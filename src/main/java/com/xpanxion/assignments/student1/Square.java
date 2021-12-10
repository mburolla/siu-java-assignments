package com.xpanxion.assignments.student1;

public class Square extends Shape{
    private String color;
    private String shape;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return "I am a " + color + " square.";
    }
}
