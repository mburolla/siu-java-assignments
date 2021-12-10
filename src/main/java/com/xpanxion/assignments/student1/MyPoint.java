package com.xpanxion.assignments.student1;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(MyPoint x2) {
        return Math.sqrt(Math.pow((x2.x - this.x), 2) + Math.pow((x2.y - this.y), 2));
    }
}
