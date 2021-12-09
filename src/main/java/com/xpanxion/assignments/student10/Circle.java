package com.xpanxion.assignments.student10;

public class Circle extends Shape{
    private String color;

    public Circle (String color){
        this.color = color;
    }

    String draw(){
        String say = String.format("I am a %s Circle", this.color);
        return say;
    }
}
