package com.xpanxion.assignments.student3;

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

    //
    // Private helper methods
    //
}
