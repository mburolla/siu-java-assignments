package com.xpanxion.assignments.student4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

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
            if(!name.equals("quit")){ //found it in Mosh video
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

        public void ex8() {

    }

        public void ex9() {

    }
}





        //
        // Private helper methods
        //

