package com.xpanxion.assignments.student4;

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
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your name :");
            String name=scanner.nextLine().toUpperCase();
            System.out.println("your name in uppercase is: "+ name);
        }


    public void ex2() {
        // test test
        int upper=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String  ");
        String str=scan.nextLine();
        int len =str.length();
        for(int i=0; i<len; i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }
        }
        System.out.println("number of uppercase letters : "+upper);
    }



    public void ex3() {
        System.out.println("Student 4: ex3.");
    }

    //
    // Private helper methods
    //
}
