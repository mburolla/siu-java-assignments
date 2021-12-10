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
    public Calculator() {
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

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public boolean isOperationAdd() {
        return this.operation.equalsIgnoreCase("add");

    }

    public boolean isOperationSub() {
        return this.operation.equalsIgnoreCase("sub");
    }

    public boolean isOperationMul(){
        return this.operation.equalsIgnoreCase("mul");
    }

    public boolean isOperationDiv() {
        return this.operation.equalsIgnoreCase("div");
    }

    public int calculate(int firstNum, int secondNum, String operation) throws CalculatorException {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.operation = operation;

        if(operation.equalsIgnoreCase("div")){
            try {
                this.result = getResult();
            } catch (ArithmeticException ex){
                throw new CalculatorException("Cannot divide by zero");
            }
        }  else {
            this.result= getResult();
        }
        return result;
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
