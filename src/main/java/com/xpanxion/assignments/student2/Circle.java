package com.xpanxion.assignments.student2;

public class Circle extends Shape {

    String color;

    Circle(String color) {
        this.color = color;
    }

    String draw() {
        return "I am a " + color + " circle.";
    }

}
