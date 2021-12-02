package com.xpanxion.assignments.student3;

import java.text.NumberFormat;
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

    public void ex8() {

        Scanner pricePerFoot = new Scanner(System.in);
        Scanner dimension = new Scanner(System.in);
        double cost = 0.0;

        System.out.print("Enter price per square foot: ");
        double ppf = pricePerFoot.nextDouble();

        while (true) {
            System.out.print("Enter room dimensions (width x height): ");
            String dim = dimension.nextLine();

            if (dim.equals("done"))
                break;
            else {
                StringTokenizer stringTokenizer = new StringTokenizer(dim);

                int width = Integer.parseInt(stringTokenizer.nextToken());
                stringTokenizer.nextToken();
                int height = Integer.parseInt(stringTokenizer.nextToken());
                cost += ((width * height) * ppf);
            }
        }

        NumberFormat price = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + price.format(cost));
    }

    static void ex9() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        int max = 5;
        int min = 1;

        int num = random.nextInt(max + min) + min;

        while (true){
            System.out.print("Enter an integer between 1 and 5: ");
            n = scanner.nextInt();

            if (n == num) {
                System.out.println("You Guessed It!!!");
                break;
            }else
                System.out.println("Try again.");
        }

    }

    static void ex10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = scanner.nextLine();
        int spaces = 1;

        StringTokenizer stringTokenizer = new StringTokenizer(string);

        while (stringTokenizer.hasMoreTokens()) {
            String word = stringTokenizer.nextToken();
            for (int i =0; i < word.length(); i++) {
                char letter = word.charAt(i);
                System.out.println(String.format("%" + spaces + "s", letter));
                spaces++;
            }
            spaces = 1;
        }
    }

    //
    // Private helper methods
    //
}
