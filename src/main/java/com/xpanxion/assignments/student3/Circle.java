package com.xpanxion.assignments.student3;

public class Circle extends Shape{

    public Circle(String color) {
        this.color = color;
    }

    public String draw(){
        return "I am a " + color + " circle.";
    }
}