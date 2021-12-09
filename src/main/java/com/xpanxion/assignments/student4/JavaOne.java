package com.xpanxion.assignments.student4;

import java.sql.SQLOutput;
import java.util.*;

public class JavaOne {

    //
    // Constructors
    //

    JavaOne() {
    }

    //
    // Public methods
    //

    public void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanner.nextLine().toUpperCase();
        System.out.println("your name in uppercase is: " + name);
    }


    public void ex2() {
        // test test
        int upper = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String  ");
        String str = scan.nextLine();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }
        System.out.println("number of uppercase letters : " + upper);
    }


    public void ex3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String  ");
        String sample = scan.nextLine();
        StringBuffer updatedString = new StringBuffer();
        String[] characters = sample.split(" ");
        for (int i=0; i< characters.length; i++) {
             String  c = characters[i];
            if (i % 2 != 0) {
                c = c.toUpperCase();
            }
            updatedString.append(c);
            updatedString.append(' ');
        }
        System.out.println(updatedString);
    }



    public void ex4() {
        String reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter word");
        String text = scanner.nextLine();
        int x = text.length();
        for (int i = x - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
        if (text == reverse)
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }

    public void ex5() {
        String name="";
        while (!name.equals("quit")) {
            int vo = 0;
            int co = 0;
            System.out.println("enter a string");
            Scanner scanner = new Scanner(System.in);
            name = scanner.nextLine().toLowerCase();
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u')
                    vo++;
                 else if (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')
                    co++;
            }
            if(!name.equals("quit")){
            System.out.println("Number of vowels: " + vo);
            System.out.println("Number of Constants: " + co);}
        }

    }


    public void ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int no1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int no2 = sc.nextInt();
        int sum = no1 + no2;
        System.out.print("Sum of these numbers: " + sum);
    }
//test test
    public void ex7() {
        String operator;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int no1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int no2 = sc.nextInt();
        System.out.print("Enter operation (add, sub, mul, div): ");
        operator = sc.next().toLowerCase(Locale.ROOT);
        System.out.print("Result is: ");
        if (operator.equals("add")) {
            System.out.println(no1 + no2);
        } else if (operator.equals("sub")) {
            System.out.println(no1 - no2);
        } else if (operator.equals("mul")) {
            System.out.println(no1 * no2);
        } else if (operator.equals("div")) {
            System.out.println(no1 / no2);
        }
    }
//test
        public void ex8() {
            String dim = "";
            double cost, area;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter price per sq feet: ");
            double price = sc.nextDouble();
                while (!dim.equals("quit")) {
                System.out.print("Enter room dimensions width x height: ");
                dim = sc.next();
                String[] characters = dim.split("x");
                int[] ints = Arrays.stream(characters).mapToInt(Integer::parseInt).toArray();
                area = ints[0] * ints[1];
                cost = area * price;
                if(!dim.equals("quit")){
                    System.out.println("total cost:$" + cost);
                }
            }

       }

        public void ex9() {
            int answer, guess;
            int MAX = 5;
            Scanner in = new Scanner(System.in);
            Random rand = new Random();
            boolean correct = false;
            answer = rand.nextInt(MAX) ;
            System.out.println("Guess a number between 1 and 5: ");
            while (!correct) {
                guess = in.nextInt();
                if (guess > answer) {
                    System.out.println("try again");
                }
                else if (guess < answer) {
                    System.out.println("try again");
                }
                else {
                    System.out.println("you guessed it!!");
                    correct = true;
                }
            }

    }
        public void ex10() {
            int i;
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your word");
            String word = scan.nextLine();
            String gap = "";
            for ( i = 0; i < word.length(); i++) {
               if (String.valueOf(word.charAt(i)).equals(" ")) {
                    gap = "";
                } else {
                    gap = gap + " ";
                }
                System.out.println(gap + word.charAt(i));
            }
    }
    }








        //
        // Private helper methods
        //

