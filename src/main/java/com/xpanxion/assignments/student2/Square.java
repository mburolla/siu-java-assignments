package com.xpanxion.assignments.student2;

public class Square extends Shape {

    String color;

    Square(String color) {
        this.color = color;
    }

    String draw() {
        return "I am a " + color + " square.";
    }
}