package com.xpanxion.assignments.student9;

public class JavaThree {

    public void ex1(){
        try{
            var result = 10 / 0;
           /* System.out.println(result);*/
        } catch (ArithmeticException e){
            System.out.println("cannot divide by zero ");
        }
    }

    public void ex2() throws CalculatorException {
        var calculator = new Calculator();
        var result = calculator.calculate(10, 0, "div");
        System.out.println(result);
    }

    public void ex3(){

    }

}
