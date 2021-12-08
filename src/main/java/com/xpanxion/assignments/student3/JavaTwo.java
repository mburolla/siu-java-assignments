package com.xpanxion.assignments.student3;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.*;

public class JavaTwo {

    JavaTwo() {}

    public void ex1(){
        //enter people based on id, firstname, and lastname and put into array

        var peopleArray = new ArrayList<Person>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person: ");
            String string = scanner.nextLine();
            if (string.equals("done"))
                break;


            StringTokenizer stringTokenizer = new StringTokenizer(string);
            int id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            String firstName = stringTokenizer.nextToken();
            String lastName = stringTokenizer.nextToken();

            peopleArray.add(new Person(id, firstName, lastName));
        }

        for (Person p: peopleArray){
            System.out.println(p);
        }
    }

    public void ex2(){
        //hashMap to find person by id

        Map hashMap = new HashMap<Integer, Person>();

        Person p1 = new Person(1, "Peter", "Jones");
        Person p2 = new Person(2, "John", "Smith");
        Person p3 = new Person(3, "Mary", "Jane");

        hashMap.put(1, p1);
        hashMap.put(2, p2);
        hashMap.put(3, p3);

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person ID: ");
            String string = scanner.nextLine();
            if (string.equals("done"))
                break;

            System.out.println(hashMap.get(Integer.parseInt(string)));
        }
    }

    public void ex3_4(){
        //product cost and base class extension

       var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        //invoice.addProduct(new Product(444, "bbq", 3.75));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5(){
        //repository

        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);

    }

    public void ex6() {
        //oop calculator
        int x, y, z = 0;
        String op, input;
        var history = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        do {
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
                z = Calculator.plus(x, y);
            else if (op.equals("-"))
                z = Calculator.sub(x, y);
            else if (op.equals("*"))
                z = Calculator.multi(x, y);
            else if (op.equals("/"))
                z = Calculator.div(x, y);
            else
                System.out.println("Invalid Operator");

            System.out.println("Result: " + z);
            history.add(String.format("%s %s %s = %s", x, op, y, z));

        } while (true);

        for (String s: history)
            System.out.println(s);
        //Calculator calculator = new Calculator();

    }
}
