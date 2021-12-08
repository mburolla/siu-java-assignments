package com.xpanxion.assignments.student3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private List<String> history;
    public Calculator (){
    }

    public void calculate(){
        int x = 0, y = 0, z = 0;
        String op, input;

        var history = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        Scanner operation = new Scanner(System.in);

        do {
            op = "";
            System.out.print("Enter First Number: ");
            input = scanner.nextLine();
            if (input.equals("done"))
                break;
            x = Integer.parseInt(input);

            System.out.print("Enter Second Number: ");
            y = scanner.nextInt();

            System.out.print("Enter Operator( +, -, *, /): ");
            op = operation.nextLine();

            if (op.equals("+"))
                z = x + y;
            else if (op.equals("-"))
                z = x - y;
            else if (op.equals("*"))
                z = x * y;
            else if (op.equals("/"))
                z = x / y;
            else
                System.out.println("Invalid Operator");

        } while (true);
        System.out.println("Result: " + z);
        history.add(String.format("%s %s %s = %s", x, op, y, z));
    }
}
