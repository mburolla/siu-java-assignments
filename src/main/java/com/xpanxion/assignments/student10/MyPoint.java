package com.xpanxion.assignments.student10;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint p2){
        double distance = Math.sqrt(((p2.x - this.x)*(p2.x - this.x))+((p2.y - this.y)*(p2.y - this.y)));
        return distance;
    }

}
