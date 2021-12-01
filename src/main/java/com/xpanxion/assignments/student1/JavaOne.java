package com.xpanxion.assignments.student1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class JavaOne {

    //
    // Constructors
    //

    JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        //prompt user to enter name
        System.out.print("Enter you name: ");

        //gather user input
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        //return name in upper case
        System.out.println("Your name in upper case is: " + userName.toUpperCase());

    }

    public void ex2() {
        //prompt user to enter a string
        System.out.print("Enter a string: ");

        //read string input from user
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();

        //create count variable
        int capitalLetters = 0;

        //loop string and count amount of capital letters
        for (int i = 0; i < userString.length(); i++) {
            char currentChar = userString.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                capitalLetters++;
            }
        }
        //return count of capital letters
        System.out.println("Number of uppercase letters: " + capitalLetters);

    }

    public void ex3() {
        //prompt user for string
        System.out.print("Enter a string: ");

        //read user input
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();

        //split string
        String[] splitUserString = userString.split(" ");

        //loop thru string and replace every other word with its uppercase equivalent
        for (int i = 0; i < splitUserString.length; i++) {
            if (i == 0 || i % 2 == 0) {
                String upperCaseEquiv = splitUserString[i].toUpperCase();
                splitUserString[i] = upperCaseEquiv;
            }
        }

        //return string
        String joinedString = String.join(" ", splitUserString);
        System.out.print(joinedString);
    }

    public void ex4() {
        //prompt for string
        System.out.print("Enter a string: ");

        //read string from user
        Scanner scanner = new Scanner(System.in);
        String userInputString = scanner.nextLine();
        int j = 0;

        //split string into array of chars and save to variable
        String[] charArray = userInputString.split("");
        String[] reverseCharArray = new String[charArray.length];

        //loop through user string and compare each letter (in order) to each letter in reverse string array
        for (int i = charArray.length - 1; i >= 0; i--) {
            reverseCharArray[j] = charArray[i];
            j++;
        }

        String reverseCharArrayJoin = String.join("", reverseCharArray);
        String charArrayJoin = String.join("", charArray);

        if (reverseCharArrayJoin.equals(charArrayJoin)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }

    public void ex5() {
        //make array of vowels
        String[] vowels = {"a","e","i","o","u"};

        //create variable for vowelCount
        //create variable for consonantCount
        int vowelCount = 0;
        int consonantCount = 0;

        //prompt user for string
        String userString = "";

        //while input is not equal to 'quit'
        while(userString != "quit") {
            System.out.print("Enter a string: ");
            //read input from user and lower case
            Scanner scanner = new Scanner(System.in);
            userString = scanner.nextLine().toLowerCase();

            if (userString.equals("quit"))
                break;

            String[] userStringSplit = userString.split("");

            //loop through input
            for (int i = 0; i < userStringSplit.length; i++) {
                String currentChar = userStringSplit[i];
                //check if current char is found in vowels array
                if (Arrays.asList(vowels).indexOf(currentChar) > -1) {
                    //if so, increment vowelCount
                    vowelCount++;
                } else if (!currentChar.equals("") && (currentChar != null) && currentChar.matches("[a-zA-Z]")) {
                    //if no, increment consonantCount
                    consonantCount++;
                }
            }
            //return number of vowels and constants
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of consonants: " + consonantCount);

            //reset count values
            vowelCount = 0;
            consonantCount = 0;
        }
    }

    public void ex6() {
        //prompt user for first number
        System.out.print("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        //prompt user for second number
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        //add numbers together and return result
        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }

    //
    // Private helper methods
    //
}
