package com.xpanxion.assignments.instructor;

import java.text.NumberFormat;
import java.util.*;

public class JavaOne {

    //
    // Constructor
    //

    JavaOne() {}

    //
    // Methods
    //

    /**
     * Uppercase Name
     */
    public void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String outString = String.format("Your name in upper case is: %s.", name.toUpperCase());
        System.out.println(outString);
    }

    /**
     * Count Uppers
     */
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

    /**
     * Capitalize Words
     */
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

    /**
     * Classic Palidrome
     */
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

    /**
     * Consonant and Vowel Count
     */
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

    /**
     * Add Only Calculator
     */
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

    /**
     * Full Calculator
     */
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

    /**
     * Carpet Calculator
     */
    public void ex8() {
        Scanner scanner = new Scanner(System.in);
        float retval = 0.0F;
        System.out.print("Enter price per square feet: ");
        var pricePerSqrFeet = scanner.nextFloat();
        scanner.nextLine();

        // Get all the rooms.
        while (true) {
            System.out.print("Enter room dimensions (width x height): ");
            String inString = scanner.nextLine();

            if (inString.equals("done")) {
                break;
            } else  {
                var stringTokenizer = new StringTokenizer(inString);
                var width =  Float.parseFloat(stringTokenizer.nextToken());
                stringTokenizer.nextToken(); // skip the x
                var height = Float.parseFloat(stringTokenizer.nextToken());
                retval += ((width * height) * pricePerSqrFeet);
            }
        }

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(retval));
    }

    /**
     * Number guessing game
     */
    public void ex9() {
        final int UPPER_LIMIT = 5;
        Scanner scanner = new Scanner(System.in);

        var r = new Random();
        var computedNumber = r.nextInt(UPPER_LIMIT) + 1;

        while (true) {
            System.out.print("Enter a number: ");
            var userNumber= scanner.nextInt();
            scanner.nextLine();

            if (computedNumber == userNumber){
                System.out.println("You guessed it!!!");
                break;
            } else {
                System.out.println("Try again...");
            }
        }
    }

    /**
     *
     */
    public void ex10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inString = scanner.nextLine();

        System.out.println(inString);
    }


    //
    // Private helper methods
    //
}
