package com.xpanxion.assignments.student9;

public class JavaThree {

    public void ex1(){
        try{
            var result = 10 / 0;
            System.out.println(result);
        } catch (Exception e){
            System.out.println("cannot divide by zero ");
        }
    }


}
