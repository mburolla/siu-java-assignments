package com.xpanxion.assignments.student9;

public class Circle extends Shape {
    public Circle(String color) {
        super(color);
    }

    public void draw(){
        System.out.printf("I am a %s Circle",getColor());
    }
}
