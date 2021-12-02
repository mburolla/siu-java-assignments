package com.xpanxion.assignments.student10;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.Random;

public class JavaOne {

    //
    // Constructors
    //

    JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        // Test.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student 10: ex1.");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name in upper case is: ");
        System.out.print(name.toUpperCase(Locale.ROOT));
    }

    public void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student 10: ex2.");
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if(Character.isUpperCase(letter)) {
                count++;
            }
        }
        System.out.print("Number of upper case letters: "+ count);

    }

    public void ex3() {
        System.out.println("Student 10: ex3.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String splitSentence[] = sentence.split(" ");
        int count = 0;
        for (String word: splitSentence) {
            count ++;
            if (count % 2 == 0){
                System.out.print(word.toUpperCase(Locale.ROOT));
            }
            else{
                System.out.print(word.toLowerCase(Locale.ROOT));
            }
            System.out.print(" ");
        }
    }

    public void ex4() {
        System.out.println("Student 10: ex4.");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();
        if (word.equals(sb.toString())){
            System.out.println(word + " is a palindrome");
        }
        else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public void ex5() {
        System.out.println("Student 10: ex5.");
        Scanner scanner = new Scanner(System.in);
        String word = "";

        System.out.print("Enter a word: ");
        word = scanner.nextLine();
        while(word.equals("quit") != true) {
            int vowelCount = 0;
            int consonantCount = 0;

            for (int i=0; i<word.length(); i++) {
                char character = word.charAt(i);
                if (Character.isLetter(character)) {
                    if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
            System.out.print("Enter a word: ");
            word = scanner.nextLine();
        }
    }

    public void ex6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student 10: ex6.");
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Result: " + sum);
    }

    public void ex7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student 10: ex7.");
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter an operation(add, sub, mul, div): ");
        String operator = scanner.next();
        if (operator.equals("add")) {
            int result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (operator.equals("sub")) {
            int result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if (operator.equals("mul")) {
            int result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else {
            double result = num1/(double)num2;
            System.out.println("Result: " + result);
        }
    }

    public void ex8() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Student 10: ex8.");
        int width;
        int length;
        double area;
        double areaTotal = 0.0;

        System.out.print("Enter price per square feet: $");
        double price = scanner.nextDouble();
        scanner.nextLine();
        while (true) {
            System.out.print("Enter room dimensions (width x length): ");
            String dimensions = scanner.nextLine();
            if (dimensions.equals("done")){
                break;
            }
            String splitDimensions[] = dimensions.split(" ");
            width = Integer.parseInt(splitDimensions[0]);
            length = Integer.parseInt(splitDimensions[2]);
            area = width * length;
            areaTotal = areaTotal + area;
        }

        double total = areaTotal * price;
        System.out.println("Total cost: " + NumberFormat.getCurrencyInstance().format(total));
    }

    public void ex9() {
        Scanner scanner = new Scanner(System.in);

        int num = getRandomNumber();
        int guess;

        while (true) {
            System.out.println("Guess a number: ");
            guess = scanner.nextInt();
            if (guess != num) {
                System.out.println("Try again....");
                continue;
            }
            else {
                System.out.println("You guessed it!!!");
                break;
            }
        }


    }

    public void ex10() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String wordList [] = input.split(" ");

        for (int i = 0; i < wordList.length; i++) {
            String word = wordList[i];
            StringBuilder sb1 = new StringBuilder("");
            for (int j = 0; j < word.length(); j++) {
                StringBuilder sb2 = sb1.append(" ");
                System.out.println(sb1.toString() + word.charAt(j));

            }


        }


    }
    //
    // Private helper methods
    //
    private int getRandomNumber() {
        int max = 5;
        int min = 1;
        int num = (int)Math.floor(Math.random()*(max-min+1)+min);
        return num;
    }

}
