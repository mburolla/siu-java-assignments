package com.xpanxion.assignments.student3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private  int x, y, z;
    private String op;
    private List<String> history = new ArrayList<String>();

    public Calculator(){

    }

    public int calculate (int x, int y, String op){
        switch (op) {
            case "+" -> z = x + y;
            case "-" -> z = x - y;
            case "*" -> z = x * y;
            case "/" -> z = x / y;
            default -> System.out.println("Invalid Operator");
        }

        history.add(String.format("%s %s %s = %s", x, op, y, z));
        return z;
    }


    public List<String> getHistory() {
        return history;
    }
}
