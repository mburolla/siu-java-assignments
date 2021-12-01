package com.xpanxion.assignments.student3;


import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args){
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Name: ");
        name = scanner.nextLine();

        System.out.println("Your Name in Upper Case is: " + name.toUpperCase());

    }
}
