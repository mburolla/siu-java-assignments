package com.xpanxion.assignments.instructor;

import java.io.*;
import java.util.Scanner;

public class JavaThree {

    public void ex1() {
        try {
            var result = 10 / 0;
        }
        catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public void ex2() {
        try {
            String inputLine;
            var file = new File("input-1.txt");
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    inputLine = scanner.nextLine();
                    System.out.println(inputLine);
                }
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void ex3() {

    }

    public void ex4() {

    }

    public void ex5() {

    }

    public void ex6() {

    }

    public void ex7() {

    }

    public void ex8() {

    }

    public void ex9() {

    }

    public void ex10() {

    }
}
