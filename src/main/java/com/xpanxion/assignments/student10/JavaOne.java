package com.xpanxion.assignments.student10;


import java.util.Locale;
import java.util.Scanner;
import java.lang.StringBuilder;

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
    /*
    public void ex5() {
        System.out.println("Student 10: ex5.");
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (){
        }
        else {
        }

     */
    }
    //
    // Private helper methods
    //
}
