package com.xpanxion.assignments.student5;

public class CalculatorException extends Exception{
    public CalculatorException(String errorMessage){
        System.out.println(errorMessage);
    }
}