package com.xpanxion.assignments.student5;

public class CalculatorException extends Exception{
    private String error;
    public CalculatorException(String errorMessage){
        error = errorMessage;
        System.out.println(error);;
    }
    public String getError(){
        return error;
    }
}