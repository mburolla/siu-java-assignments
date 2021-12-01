package com.xpanxion.assignments.student6;

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
        //UPPERCASE NAME:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println(name.toUpperCase());
        sc.close();
    }

    public void ex2() {
        //UPPERCASE COUNTER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if(Character.isUpperCase(sentence.charAt(i))) {
                count++;
            }
        }

        System.out.println("Number of UpperCase Letters: " + count);
        sc.close();
    }

    public void ex3() {
        //CAPITALIZE WORDS
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence2  = sc.nextLine();
        String[] capitalizedWords = sentence2.split(" ");

        for (int i = 0; i < capitalizedWords.length; i += 2) {
            capitalizedWords[i] = capitalizedWords[i].toUpperCase();
        }

        System.out.println(Arrays.toString(capitalizedWords));
        sc.close();

    }

    public void ex4() {
        //PALINDROME
        Scanner sc = new Scanner(System.in);
        String strOrig = null;
        StringBuilder sbRvsrd = null;

        boolean running = true;
        while(running) {
            System.out.println("Enter a string: ");
            strOrig = sc.nextLine().toLowerCase();

            sbRvsrd = new StringBuilder(strOrig).reverse();
            System.out.println(strOrig + " " + sbRvsrd);
            if (strOrig.equals(sbRvsrd.toString())) {
                System.out.println("Palindrome!");
                running = false;
            } else {
                System.out.println("Not a Palindrome!");
                running = false;
            }
        }
        sc.close();
    }

    public void ex5() {
        //CONSONANT AND VOWEL COUNTER
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String sentence3 = sc.nextLine();
        String toBeCounted = sentence3.toLowerCase().replaceAll("[^a-z]", "");

        int vowels = 0;
        int consonants = 0;

        for (char ch: toBeCounted.toCharArray()) {
            if(ch == 'a' || ch=='e' || ch == 'i' || ch=='o' || ch == 'u')
                vowels++;
            else
                consonants++;
        }

        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants : " + consonants);
        sc.close();
    }

    public void ex6() {
        //ADD ONLY CALCULATOR
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = sc.nextInt();

        int sum = 0;
        ArrayList<Integer> numHolder = new ArrayList<Integer>();
        numHolder.add(firstNum);
        numHolder.add(secondNum);

        for (int i = 0; i < numHolder.size(); i++) {
            sum += numHolder.get(i);
        }
        System.out.println("Result: " + sum);
        sc.close();
    }

    //
    // Private helper methods
    //
}
