package com.xpanxion.assignments.student10;

public class Square extends Shape{

    private String color;

    public Square (String color){
        this.color = color;
    }

    String draw() {
        String say = String.format("I am a %s Square", this.color);
        return say;
    }
}
