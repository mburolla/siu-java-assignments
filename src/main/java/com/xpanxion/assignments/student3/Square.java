package com.xpanxion.assignments.student3;

public class Square extends Shape{

    public Square(String color){
        this.color = color;
    }

    public String draw(){
        return "I am a " + color + " Square.";
    }
}
