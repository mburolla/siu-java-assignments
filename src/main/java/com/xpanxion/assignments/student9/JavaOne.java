package com.xpanxion.assignments.student9;

import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.print("Enter your name >");
        var scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        System.out.printf("Your name in upper case is > %s ",name.toUpperCase());
    }

    public void ex2() {
        System.out.print("Enter a String >");
        var scanner = new Scanner(System.in);
        var line = scanner.nextLine();
        var count =0;
        for(var index = 0; index < line.length();index++){
           if(Character.isUpperCase(line.charAt(index))){
               count++;
           } // else char is not upper, doNothing()
        }
        System.out.printf("Number of uppercase letters : %d",count);
    }

    public void ex3() {
        System.out.print("Enter a String > ");
        var scanner = new Scanner(System.in);
        var tempLine =scanner.nextLine();
        tempLine.toLowerCase();
        var isCap = true;
        var builder = new StringBuilder();
        for (var temp : tempLine.split(" ")){
            if(isCap){
                builder.append(temp.toUpperCase()).append(" ");
                isCap = false;
            } else {
                builder.append(temp).append(" ");
                isCap = true;
            }
        }
        System.out.println(builder);
    }

    //
    // Private helper methods
    //
}
