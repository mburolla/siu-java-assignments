package com.xpanxion.assignments.instructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator2 {

    private List<String> history;

    public Calculator2 (){
    }

    public void calculate(){
        int x = 0, y = 0, z = 0;
        String op, input;

        var history = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            op = "";
            System.out.print("Enter First Number: ");
            input = scanner.nextLine();

            if (input.equals("done"))
                break;
            x = Integer.parseInt(input);

            System.out.print("Enter Second Number: ");
            y = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Operator( +, -, *, /): ");
            op = scanner.nextLine();

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
            System.out.println("Result: " + z);
            history.add(String.format("%s %s %s = %s", x, op, y, z));
        }

        for (String s: history) {
            System.out.println(s);
        }
    }
}
