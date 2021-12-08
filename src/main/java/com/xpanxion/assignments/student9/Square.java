package com.xpanxion.assignments.student9;

public class Square extends Shape {
    public Square(String color) {
        super(color);
    }
    public void draw(){
        System.out.printf("I am a %s Square",getColor());
    }
}
