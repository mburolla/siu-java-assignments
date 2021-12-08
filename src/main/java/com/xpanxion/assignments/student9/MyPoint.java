package com.xpanxion.assignments.student9;

public class MyPoint {
    private double pointOne;
    private double pointTwo;

    public MyPoint(int pointOne, int pointTwo){
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public double getPointOne() {
        return this.pointOne;
    }

    public void setPointOne(int pointOne) {
        this.pointOne = pointOne;
    }

    public double getPointTwo() {
        return this.pointTwo;
    }

    public void setPointTwo(int pointTwo) {
        this.pointTwo = pointTwo;
    }

    public double distance(MyPoint myPointTwo){
      return Math.sqrt(Math.pow(myPointTwo.pointOne - this.pointOne,2) + Math.pow(myPointTwo.pointTwo- this.pointTwo,2));
    }
}
