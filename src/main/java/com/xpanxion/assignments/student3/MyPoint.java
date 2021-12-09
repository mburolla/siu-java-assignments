package com.xpanxion.assignments.student3;

import java.awt.*;
import java.awt.geom.Point2D;

public class MyPoint extends Point {

    public MyPoint (int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint p4) {
        double dx = p4.getX();
        double dy = p4.getY();
        double distance = Math.sqrt(Math.pow(dx - x, 2) + Math.pow(dy - y, 2));
        return distance;
    }
}
