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

    public void ex7() {
        //FULL CALCULATOR
        String operation;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNum = sc.nextInt();
        System.out.println("Enter A Second Number");
        int secondNum = sc.nextInt();
        System.out.println("Enter Operation (add, sub, mul, div): ");
        Scanner op = new Scanner(System.in);
        operation = op.next();

        if (operation.equals("add"))
            System.out.println("Result: " + (firstNum + secondNum));
        if (operation.equals("sub"))
            System.out.println("Result: " + (firstNum - secondNum));
        if (operation.equals("mul"))
            System.out.println("Result: " + (firstNum * secondNum));
        if (operation.equals("div"))
            System.out.println("Result: " + (firstNum / secondNum));
        sc.close();
    }

    public void ex8() {
        //CARPET CALCULATOR
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price per Square Feet: ");
        float sqFoot = sc.nextFloat();
        System.out.println("Enter Room Dimensions (Width x Height): ");
        String roomDimensions = sc.nextLine();

//        String newRoomDimensions = roomDimensions.toLowerCase();
            if (roomDimensions != "done") {
                String nums = roomDimensions.replaceAll("[^0-9]", "");
                int[] numbers = Arrays.stream(nums.split(",")).mapToInt(Integer::parseInt).toArray();

                int result = 0;
                for (int i = 0; i < numbers.length; i++) {
                    int newResult = result *= numbers[i];
                    System.out.println(newResult);
                }

            }

    }

    public void ex9() {
        //Random Number Game
        int max = 5;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < 5; i++) {
          int rand = (int)(Math.random() * range) + min;

            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the Magic Number Between 1 and 5");
            int guess = sc.nextInt();
            int guess2 = 0;
            while(guess != rand && guess2 != rand) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Try Again!");
                guess2 = sc2.nextInt();
            }
            System.out.println("Got it!");
            break;
        }


    }

    public void ex10() {
        //DIAGONALLY
        String spaces = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            System.out.println(spaces + word.charAt(i));
            spaces += "  ";
        }

    }






    //
    // Private helper methods
    //
}
