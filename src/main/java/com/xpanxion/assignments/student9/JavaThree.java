package com.xpanxion.assignments.student9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
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
        var personList = new ArrayList<Person>();
        try{
            var myFile = new FileReader("input-2.txt");
            var reader = new Scanner(myFile);
            while(reader.hasNextLine()){
                var display = reader.nextLine();
                String[] splits = display.split(",");
                var idTemp = Integer.parseInt(splits[0]);
                var fullName = splits[1];
                String[] nameSplit = fullName.trim().split(" ");
                var firstName = nameSplit[0];
                var lastName = nameSplit[1];
                personList.add(new Person(idTemp,firstName,lastName));
            }
        } catch (FileNotFoundException IO){
            System.out.println("unable to find file");
            IO.printStackTrace();
        }
        personList.forEach(System.out::println);
    }

}
