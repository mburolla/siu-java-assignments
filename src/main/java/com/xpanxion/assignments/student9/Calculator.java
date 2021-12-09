package com.xpanxion.assignments.student9;

import org.w3c.dom.ls.LSOutput;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private String operation;
    private int result;

    public Calculator(int firstNum, int secondNum, String operation){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operation = operation;
        this.result = getResult();
    }

    public int getResult() {
        return switch (operation) {
            case "add" -> this.firstNum + this.secondNum;
            case "sub" -> this.firstNum - this.secondNum;
            case "div" -> this.firstNum / this.secondNum;
            case "mul" -> this.firstNum * this.secondNum;
            default -> 0;
        };
    }


    @Override
    public String toString() {
        switch (operation) {
            case "add":
                return new StringBuilder().append(firstNum).append(" ").append(" + ").append(" ").append(secondNum).append(" ").append(" = ").append(result).toString();
            case "sub":
                return new StringBuilder().append(firstNum).append(" ").append(" - ").append(" ").append(secondNum).append(" ").append(" = ").append(result).toString();
            case "div":
                return new StringBuilder().append(firstNum).append(" ").append(" / ").append(" ").append(secondNum).append(" ").append(" = ").append(result).toString();
            case "mul":
                return new StringBuilder().append(firstNum).append(" ").append(" * ").append(" ").append(secondNum).append(" ").append(" = ").append(result).toString();
        }
        return null;
    }
}