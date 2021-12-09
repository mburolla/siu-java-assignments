package com.xpanxion.assignments.student9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

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
        try{
            var myFile = new FileReader("input-1.txt");
            var reader = new Scanner(myFile);
            while(reader.hasNextLine()){
                var display = reader.nextLine();
                System.out.println(display);
            }
        } catch (FileNotFoundException IO){
            System.out.println("unable to find file");
            IO.printStackTrace();
        }
    }

    public void ex4(){

    }

}
