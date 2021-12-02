package com.xpanxion.assignments.student8;

import java.text.NumberFormat;
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
    Scanner scanner = new Scanner(System.in);


    public void ex1() {
        System.out.println("Student 8: ex1.");
//        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name in upper case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 8: ex2.");
        System.out.print("Enter a string: ");
//        Scanner scanner = new Scanner(System.in);
        String phraseToCountUppers = scanner.nextLine();

        int numOfUppers = 0;
        for (char c : phraseToCountUppers.toCharArray()) {
            if (Character.isUpperCase(c)) {
                numOfUppers++;
            }
        }
        System.out.println("Number of uppercase letters: " + numOfUppers);
    }

    public void ex3() {
        System.out.println("Student 8: ex3.");
        System.out.println("Enter a string: ");
        String userPhrase = scanner.nextLine();
        String[] userTokens = userPhrase.split(" ");

        for (int i = 0; i < userTokens.length; i += 2) {
            userTokens[i] = userTokens[i].toUpperCase();
        }

        String formattedPhrase = String.join(" ", userTokens);

        System.out.println(formattedPhrase);
    }

    public void ex4() {
        System.out.println("Student 8: ex4.");
        System.out.print("Enter string: ");
        String userWord = scanner.next().toLowerCase();
        StringBuilder sb = new StringBuilder(userWord);
        sb = sb.reverse();
        String reversedWord = sb.toString();


        if (reversedWord.equals(userWord)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void ex5() {
        System.out.println("Student 8: ex5.");
        String userStr = "";

        while(!userStr.toLowerCase().equals("quit")) {
            System.out.print("Enter a string: ");
            userStr = scanner.nextLine().toLowerCase();
            if (userStr.equals("quit")) {
                break;
            } else {
                int vowelCount = 0;
                int consonantCount = 0;
                for (int i = 0; i < userStr.length(); i++) {

                    char c = userStr.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        vowelCount++;
                    else if (c >= 'a' && c <= 'z')
                        consonantCount++;
                }
                System.out.println("Number of vowels: " + vowelCount);
                System.out.println("Number of consonants: " + consonantCount);
            }
        }
    }

    public void ex6() {
        System.out.println("Student 8: ex6.");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int result = a + b;
        System.out.printf("Result: %s%n", result);

    }

    public void ex7() {
        System.out.println("Student 8: ex7.");

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = scanner.next();
        int result = 0;
        if (operation.equals("add"))
            result = a + b;
        else if (operation.equals("sub"))
            result = a - b;
        else if (operation.equals("mul"))
            result = a * b;
        else if (operation.equals("div"))
            result = a / b;

        System.out.printf("Result: %s", result);
    }

    public void ex8() {
        System.out.println("Student 8: ex8");


        System.out.print("Enter price per square feet: ");
        double price = scanner.nextDouble();
        double totalDimensions = 0.0;


        while(true) {
            System.out.print("Enter room dimensions (width x height): ");
            String dimensions = scanner.nextLine();

            if (!dimensions.equals("done")) {
                StringTokenizer tokens = new StringTokenizer(dimensions);
                float width = Float.parseFloat(tokens.nextToken());
                tokens.nextToken();
                float height = Float.parseFloat(tokens.nextToken());
                totalDimensions += (width * height);
            } else {
                break;
            }
        }
        double totalCost = totalDimensions * price;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();


        System.out.printf("Total cost: %s", formatter.format(totalCost));

    }

    public void ex9() {
        System.out.println("Student 8: ex.");
        int rand = (int) Math.round((Math.random() * 5) + 1);
        int guess = 0;

        while(true) {
            System.out.print("Enter a number between 1 and 5: ");
            guess = scanner.nextInt();
            if (rand == guess) {
                System.out.println("You guessed it!!!");
                break;
            } else {
                System.out.println("Try again...");
                continue;
            }
        }
    }
    //
    // Private helper methods
    //
}
