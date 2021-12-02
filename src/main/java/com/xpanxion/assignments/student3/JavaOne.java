package com.xpanxion.assignments.student3;

import java.util.*;

public class JavaOne {

    //
    // Constructors
    //

    JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Student 3: ex1.");

        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Name: ");
        name = scanner.nextLine();

        System.out.println("Your Name in Upper Case is: " + name.toUpperCase());
    }

    public void ex2() {
        System.out.println("Student 3: ex2.");

        int upperCase = 0;
        String string;
        Scanner scanner = new Scanner(System.in);

        System.out.print(("Enter a String: "));
        string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char letter = string.charAt(i);
            if (letter >= 'A' && letter <= 'Z')
                upperCase++;
        }

        System.out.println("The number of uppercase letters is  " + upperCase);


    }

    public void ex3() {
        System.out.println("Student 3: ex3.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String string = scanner.nextLine();
        int i = 0;
        var finalPhrase= " ";

        StringTokenizer words = new StringTokenizer(string);

        while (words.hasMoreTokens()){
            if (i % 2 == 1){
                finalPhrase += words.nextToken();
            } else {
                finalPhrase += words.nextToken().toUpperCase();
            }
            finalPhrase += " ";
            i++;
        }
        System.out.println(finalPhrase);
    }

    public void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        StringBuilder pal = new StringBuilder(string);

        pal.reverse();
        String rev = pal.toString();

        if (string.equals(rev)) {
            System.out.println("String is a Palindrome");
        }else
            System.out.println("String is not a Palindrome");
    }

    public void ex5() {
        Scanner scanner = new Scanner(System.in);

        int vowelnum = 0;
        int consnum = 0;

        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "y");

        while (true) {
            System.out.print("Enter a String: ");
            String string = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (string.equals("quit"))
                break;

            for (int i = 0; i < string.length(); i++) {
                char letter = string.charAt(i);
                String character = Character.toString(letter);
                if (vowels.contains(character)) {
                    vowelnum++;
                } else if (Character.isLetter(letter)){
                    consnum++;
                }
            }
            System.out.println("Number of vowels: " + vowelnum);
            System.out.println("Number of consonants: " + consnum);
            vowelnum = 0;
            consnum = 0;
        }

    }

    public void ex6() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter a second integer: ");
        int b = scanner.nextInt();

        System.out.println("Result: " + (a + b));
    }

    public void ex7() {

        Scanner scanner = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        int z = 0;

        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter an integer: ");
        int y = scanner.nextInt();

        while (true){

            System.out.print("Enter an operator: ");
            String operation = op.next();

            if (operation.equals("*")) {
                z = x * y;
                break;
            } else if (operation.equals("/")) {
                z = x / y;
                break;
            }else if (operation.equals("+")) {
                z = x + y;
                break;
            }else if (operation.equals("-")) {
                z = x - y;
                break;
            }else
                System.out.println("Please Enter a valid operator");

        }

        System.out.println("Result: " + z);

    }

    //
    // Private helper methods
    //
}
