package com.xpanxion.assignments.student5;

import java.awt.*;

public class MyPoint extends Point {
//
//    constructor
//
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

//
//    public methods
//
    public double distance(MyPoint pointB){
        double x2 = pointB.getX();
        double y2 = pointB.getY();

        double distance = Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));

        return distance;
    }
}
