package com.xpanxion.assignments.student3;

public class Calculator {
    private static int z;

    public Calculator (){
    }

    public static int plus(int x, int y) {
        z = x + y;
        return z;
    }

    public static int sub(int x, int y) {
        z = x - y;
        return z;
    }

    public static int multi(int x, int y) {
        z = x * y;
        return z;
    }

    public static int div(int x, int y) {
        z = x / y;
        return z;
    }
}
