package com.xpanxion.assignments.student5;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaOne {

    //
    // Constructors
    //

    JavaOne() {}

    //
    // Public methods
    //

    public void ex1(){
        var sc = new Scanner(System.in);

        System.out.println("====Ex.1====");

        System.out.print("Enter your name: ");
        var name = sc.nextLine();

        System.out.println("Your name in upper case is: " + name.toUpperCase());
        sc.close();
    }

    public void ex2(){
        var sc = new Scanner(System.in);
        var validLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        var capsCount = 0;

        System.out.println("\n\n====Ex.2====");
        System.out.print("Enter a string: ");
        var sentence = sc.nextLine();
        for (char letter : sentence.toCharArray()){
            if (validLetters.indexOf(letter) != -1) capsCount++;
        }
        System.out.println("Number of uppercase letters: " + capsCount);
        sc.close();
    }

    public void ex3(){
        var sc = new Scanner(System.in);
        var upperLower = new StringBuilder();
        System.out.println("\n\n====Ex.3====");

        System.out.print("Enter a string: ");
        String words[] = sc.nextLine().split(" ");
        for (int i = 0; i < words.length; i++){
            if (i % 2 == 0) upperLower.append(words[i].toUpperCase() + " ");
            else upperLower.append(words[i].toLowerCase() + " ");
        }
        System.out.println(upperLower);
        sc.close();
    }

    public void ex4(){
        var sc = new Scanner(System.in);
        var reverseString = new StringBuilder();
        System.out.println("\n\n====Ex.4====");

        System.out.print("Enter string: ");
        var inputString = sc.nextLine().toLowerCase();

        reverseString = reverseString.append(inputString).reverse();

        if (inputString.equals(reverseString.toString())) System.out.println("YES");
        else System.out.println("NO");

        sc.close();
    }

    public void ex5(){
        var sc = new Scanner(System.in);
        var vowels = "aeiou";
        var consonants = "bcdfghjklmnpqrstvwxyz";
        int vowelCount;
        int consCount;
        System.out.println("\n\n====Ex.5====");
        while(true) {
            vowelCount = 0;
            consCount = 0;
            System.out.print("Enter a string: ");
            var inputString = sc.nextLine().toLowerCase();
            if (inputString.equals("quit")) break;
            for (char letter : inputString.toCharArray()) {
                if (vowels.indexOf(letter) != -1) vowelCount++;
                else if (consonants.indexOf(letter) != -1) consCount++;
            }
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consCount);
        }
        sc.close();
    }

    public void ex6(){
        var sc = new Scanner(System.in);
        System.out.println("\n\n====Ex.6====");
        System.out.print("Enter first number: ");
        var num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter second number: ");
        var num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Result: " + (num1+num2));
        sc.close();
    }
    public void ex7(){
        var sc = new Scanner(System.in);
        System.out.println("\n\n====Ex.7====");
        System.out.print("Enter first number: ");
        var num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter second number: ");
        var num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter operation (add, sub, mul, div): ");
        var operation = sc.nextLine().toLowerCase();
        var result = 0;
        switch (operation) {
            case "add" -> result = num1+num2;
            case "sub" -> result = num1-num2;
            case "mul" -> result = num1*num2;
            case "div" -> result = num1/num2;
            default -> System.out.println("Invalid Number!");
        }
        System.out.print("Result: " + result);
        sc.close();
    }

    public void ex8(){
        var sc = new Scanner(System.in);
        double price = 0.00;
        double cost;
        var formatter = NumberFormat.getCurrencyInstance();

        System.out.println("\n\n====Ex.8====");
        System.out.print("Enter price per square feet: ");
        price = Double.parseDouble(sc.nextLine());

        var totalSqft = 0;
        String userInput;


        while(true){
            ArrayList<String> tokens = new ArrayList<>();
            System.out.print("Enter room dimensions (width x height): ");
            userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("done")) break;
            StringTokenizer inputs = new StringTokenizer(userInput, " X ");
            while (inputs.hasMoreElements()) {
                tokens.add(inputs.nextToken());
            }
            // var inputs = userInput.split(" ");
            if (tokens.size() != 2) {
                System.out.println("input is not properly formatted.");
                continue;
            }
            totalSqft += Integer.parseInt(tokens.get(0)) * Integer.parseInt(tokens.get(1));

        }
        cost = price*totalSqft;

        System.out.println("Total cost: " + formatter.format(cost));
        sc.close();
    }

    public void ex9(){
        var sc = new Scanner(System.in);
        int maxNumber = 5;
        int minNumber = 1;

        System.out.println("\n\n====Ex.9====");
        int random = (int) (Math.random()*(maxNumber-minNumber)) + minNumber;
        int guess;
        while (true) {
            System.out.print("Enter a number: ");
            guess = Integer.parseInt(sc.nextLine());

            if (guess == random){
                System.out.println("You guessed it!!!");
                break;
            }

            System.out.println("Try again...");
        }
        sc.close();
    }

    public void ex10(){
        var sc = new Scanner(System.in);
        System.out.println("\n\n====Ex.10====");
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        ArrayList<String> tokens = new ArrayList<>();
        StringTokenizer inputs = new StringTokenizer(userInput, " X ");
        while (inputs.hasMoreElements()) {
            tokens.add(inputs.nextToken());
        }
        for (String word : tokens){
            int spaces = 0;
            for (char letter: word.toCharArray()){
                for (int i = 0; i < spaces; i++ ) System.out.print(" ");
                System.out.println(letter);
                spaces++;
            }
        }
        sc.close();
    }

    //
    // Private helper methods
    //
}
