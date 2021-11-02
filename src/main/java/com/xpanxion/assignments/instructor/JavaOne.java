package com.xpanxion.assignments.instructor;

import java.util.*;

public class JavaOne {

    //
    // Constructor
    //

    JavaOne() {}

    //
    // Methods
    //

    public void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String outString = String.format("Your name in upper case is: %s.", name.toUpperCase());
        System.out.println(outString);
    }

    public void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inString = scanner.nextLine();

        int numUpperCaseLetters = 0;
        for (int i = 0; i < inString.length(); i++) {
            if (Character.isUpperCase(inString.charAt(i))) {
                numUpperCaseLetters++;
            }
        }
        System.out.println(String.format("Number of uppercase letters: %s.", numUpperCaseLetters));
    }

    public void ex3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inString = scanner.nextLine();

        var st = new StringTokenizer(inString);
        int wordCount = 0;
        var outString = "";
        while (st.hasMoreTokens()) {
            if (wordCount % 2 == 1) {
                outString += st.nextToken();
            } else {
                outString += st.nextToken().toUpperCase();
            }
            outString += " ";
            wordCount++;
        }
        System.out.println(outString);
    }

    public void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inString = scanner.nextLine();

        int middleIndex = inString.length() / 2;
        String[] parts = { inString.substring(0, middleIndex), inString.substring(middleIndex + 1) };

        if (parts[0].equals(new StringBuilder(parts[1]).reverse().toString())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public void ex5() {
        Scanner scanner = new Scanner(System.in);
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u", "y");
        int vowelCount = 0;
        int consonantCount = 0;

        while (true) {
            System.out.print("Enter a string: ");
            var inString = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (inString.equals("quit")) {
                break;
            }

            for (int i = 0; i < inString.length(); i++) {
                var character = inString.charAt(i);
                var charString = Character.toString(character);
                if (vowelList.contains(charString)) {
                    vowelCount++;
                } else if (Character.isLetter(character)){
                    consonantCount++;
                }
            }
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);
            vowelCount = 0;
            consonantCount = 0;
        }
    }

    public void ex6() {
        int result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int operand1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        int operand2 = scanner.nextInt();
        scanner.nextLine();

        result = operand1 + operand2;
        String outString = String.format("Result: %s", result);
        System.out.println(outString);
    }

    public void ex7() {
        int result = 0;
        var scanner = new Scanner(System.in); // Type inference.

        System.out.print("Enter first number: ");
        var operand1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        var operand2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter operation (add, sub, mul, div): ");
        var operation = scanner.nextLine();

        switch (operation) {
            case "add" -> {
                result = operand1 + operand2;
            }
            case "sub" -> {
                result = operand1 - operand2;
            }
            case "mul" -> {
                result = operand1 * operand2;
            }
            case "div" -> {
                result = operand1 / operand2;
            }
        }

        var outString = String.format("Result: %s", result);
        System.out.println(outString);
    }

    public void ex8() {

    }

    public void ex9() {

    }

    public void ex10() {

    }


    //
    // Private helper methods
    //
}
