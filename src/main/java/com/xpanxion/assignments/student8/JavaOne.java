package com.xpanxion.assignments.student8;

import java.util.Scanner;

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

    }
    //
    // Private helper methods
    //
}
