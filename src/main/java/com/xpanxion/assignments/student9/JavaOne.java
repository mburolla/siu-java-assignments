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
    public void ex4() {
        System.out.print("Enter String > ");
        var scanner = new Scanner(System.in);
        var tempString = scanner.nextLine();
        var tempReverse = new StringBuilder();
        for (var index = tempString.length() -1; index >=0; index--){
            tempReverse.append(tempString.charAt(index));
        }
        if(tempReverse.toString().toLowerCase().equals(tempString.toLowerCase())){
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }

    public void ex5() {

        while (true) {
            System.out.print("Enter a String > ");
            var scanner = new Scanner(System.in);
            var tempString = scanner.nextLine();
             if(tempString.equals("quit")){
                 return;
             }
            var vowelCount = 0;
            var constantsCount = 0;
        for(var index = 0; index <tempString.length();index++){
            var tempChar = tempString.charAt(index);
            if(tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u'){
                vowelCount++;
            } else {
                constantsCount++;
            }
            }
            System.out.printf("Number of vowels : %d%n",vowelCount);
            System.out.printf("Number of constants : %d%n",constantsCount);
        }
    }

    public void ex6() {
        System.out.print("Enter first number > ");
        var scanner = new Scanner(System.in);
        var firstNumber = scanner.nextInt();
        System.out.print("Enter the second number > ");
        var secondNumber = scanner.nextInt();
        var result = firstNumber + secondNumber;
        System.out.printf("Result > %d",result);
    }

    public void ex7() {
        System.out.print("Enter first number > ");
        var scanner = new Scanner(System.in);
        var firstNumber = scanner.nextInt();
        System.out.print("Enter the second number > ");
        var secondNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter operation > ");
        var operationString =scanner.nextLine();
        var result =0;
        if(operationString.toLowerCase().equals("add")){
            result = firstNumber + secondNumber;
        } else if(operationString.toLowerCase().equals("sub")){
           result = firstNumber - secondNumber;
        } else if(operationString.toLowerCase().equals("mul")){
            result = firstNumber * secondNumber;
        } else if(operationString.toLowerCase().equals("div")){
            result = firstNumber / secondNumber;
        } else{
            System.out.println("Invalid operation");
        }
        System.out.printf("Result > %d",result);
    }

    //
    // Private helper methods
    //
}
