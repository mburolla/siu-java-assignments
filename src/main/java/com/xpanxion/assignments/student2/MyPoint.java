package com.xpanxion.assignments.student2;

public class MyPoint {

    double x;
    double y;

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(MyPoint point2) {
        return Math.sqrt( Math.pow(this.x - point2.x, 2) + Math.pow(this.y - point2.y, 2) );
    }

}