package com.xpanxion.assignments.student2;

import java.awt.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.concurrent.TimeUnit;

class Person {

    int id;
    String firstName;
    String lastName;

    //
    // Constructors
    //

    Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Person{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

}

class NameCompare implements Comparator<Person>
{
    public int compare(Person p1, Person p2)
    {
        return p1.firstName.compareTo(p2.firstName);
    }
}

class Invoice extends Base {

    int invoiceId;
    private final List<Product> products = new ArrayList<>();

    Invoice(int invoiceId) {
        super();
        this.invoiceId = invoiceId;
    }

    void addProduct(Product product) {
        products.add(product);
    }

    double getTotalCost() {
        double i = 0;
        for(Product n : products) {
            i = i + n.getProductCost();
        }
        return i;
    }
}

class Product extends Base {

    private final int productId;
    private final String productName;
    private final double productCost;

    Product(int productId, String productName, double productCost) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    double getProductCost() {
        return productCost;
    }
}

abstract class Base {

    String id;

    Base() {

    }
}

interface DataAccess {
    String getPerson();
}

class Repository implements DataAccess {

    public String getPerson() {
        return "{id= 1, firstName='John', lastName='Doe'}";
    }

}

class Calculator {

    List<String> calculations = new ArrayList<>();

    void storeCalc(String calculation) {
        calculations.add(calculation);
    }

    void printCalc() {
        for(String n : calculations) {
            System.out.println(n);
        }
    }

}

class Cat {

    String name;

    Cat(String name) {
        this.name = name;
    }

    public String toString() {
        return "Cat{name=" + name + "'}";
    }

}

class Theater {

    private int rows;
    private int seats;
    private double totalSales = 0.00;

    Theater(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
    }

    char[][] CreateTheater() {
        char[][] theaterArray = new char[rows][seats];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                theaterArray[i][j] = '0';
            }
        }
        return theaterArray;
    }

    void TakeSeat(char[][] theaterArray, int i, int j) {
        theaterArray[i - 1][j - 1] = 'X';
    }

    void ShowTheater(char[][] theaterArray) {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                System.out.print(theaterArray[i][j]);
                if(theaterArray[i][j] == 'X') {
                    totalSales += 1.00;
                }
            }
            System.out.println("");
        }
        System.out.println("Total sales: $" + String.format("%.2f",totalSales));
        totalSales = 0;
    }
}

abstract class Shape {

    abstract String draw();

}

class Square extends Shape {

    String color;

    Square(String color) {
        this.color = color;
    }

    String draw() {
        return "I am a " + color + " square.";
    }
}

class Circle extends Shape {

    String color;

    Circle(String color) {
        this.color = color;
    }

    String draw() {
        return "I am a " + color + " circle.";
    }

}

class MyPoint {

    double x;
    double y;

    MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(MyPoint point2) {
        return Math.sqrt( Math.pow(this.x - point2.x, 2) + Math.pow(this.y - point2.y, 2) );
    }

}

public class JavaTwo {

    JavaTwo() {
    }

    //
    // Public methods
    //

    public static String Encrypt(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while(hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ex1() {
        List<Person> people = new ArrayList<>();

        while(true) {
            System.out.print("Enter Person: ");
            Scanner scannerExample1 = new Scanner(System.in);
            String name = scannerExample1.nextLine();

            if(name.equals("done")) {
                break;
            }

            String[] nameArray = name.split(" ", 3);
            int correctedNum = Integer.parseInt(nameArray[0].replace(",", ""));
            Person newPerson = new Person(correctedNum, nameArray[1], nameArray[2]);
            people.add(newPerson);
        }

        for(Person n : people) {
            System.out.println(n);
        }
    }

    public static void ex2() {
        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Peter Jones");
        people.put(2, "John Smith");
        people.put(3, "Mary Jane");

        while(true) {
            System.out.print("Enter Person ID: ");
            Scanner scannerExample2 = new Scanner(System.in);
            String idNumber = scannerExample2.nextLine();

            if(idNumber.equals("done")) {
                break;
            }

            int correctedId = Integer.parseInt(idNumber);

            String[] nameArray = people.get(correctedId).split(" ", 2);
            System.out.println("{id=" + correctedId + ", firstName='" + nameArray[0] + "', lastName='" + nameArray[1] + "'}");
        }
    }

    public static void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public static void ex4() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public static void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public static void ex6() {

        Calculator calc = new Calculator();
        String operatorSymbol = null;

        while(true) {
            System.out.print("Enter first number: ");
            Scanner scannerExample7_1 = new Scanner(System.in);
            String firstEntry = scannerExample7_1.next();
            if(firstEntry.equals("done")) {
                calc.printCalc();
                break;
            }
            System.out.print("Enter second number: ");
            Scanner scannerExample7_2 = new Scanner(System.in);
            String secondEntry = scannerExample7_2.next();
            System.out.print("Enter operation (add, sub, mul, div): ");
            Scanner scannerExample7_3 = new Scanner(System.in);
            String operator = scannerExample7_3.next();
            

            int firstNum = Integer.parseInt(firstEntry);
            int secondNum = Integer.parseInt(secondEntry);

            float result = 0;
            if (operator.equals("add")) {
                result = firstNum + secondNum;
                operatorSymbol = "+";
            } else if (operator.equals("sub")) {
                result = firstNum - secondNum;
                operatorSymbol = "-";
            } else if (operator.equals("mul")) {
                result = firstNum * secondNum;
                operatorSymbol = "*";
            } else if (operator.equals("div")) {
                result = (float) firstNum / (float) secondNum;
                operatorSymbol = "/";
            }
            System.out.println("Result: " + result);
            calc.storeCalc(firstEntry + " " + operatorSymbol + " " + secondEntry + " = " + result);
        }
    }

    public static void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream().map(p -> {
            Person obj = new Person(p.id, p.firstName, "xxx");
            return obj;
                })
                .collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    public static void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        NameCompare nameCompare = new NameCompare();
        Collections.sort(personList, nameCompare);

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public static void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        List<Person> filteredList = personList.stream()
                .filter(p -> p.lastName.equals("Smith"))
                .collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    public static void ex10() throws InterruptedException {
         List<Cat> catQueue = new LinkedList<> (Arrays.asList(
                new Cat("Alice"),
                new Cat("Bob"),
                new Cat("Charlie"),
                new Cat("Dan")
        ));

         while(true) {
             System.out.println(catQueue);
             catQueue.remove(0);

             if(catQueue.isEmpty()) {
                 break;
             }

             TimeUnit.SECONDS.sleep(3);
         }
    }

    public static void ex11() {
        Map<String, String> loginInfo = new HashMap<>();

        while(true) {
            System.out.print("Action [add|login|done]: ");
            Scanner scannerExample1 = new Scanner(System.in);
            String action = scannerExample1.nextLine();

            if(action.equals("add")) {
                System.out.print("Enter username, password: ");
                Scanner scannerExample2 = new Scanner(System.in);
                String userLogin = scannerExample2.nextLine();
                String[] userArray = userLogin.split(", ", 2);

                String passwordHash = Encrypt(userArray[1]);
                loginInfo.put(userArray[0], passwordHash);
                userArray[1] = null;
            }
            else if(action.equals("login")) {
                System.out.print("Enter username, password: ");
                Scanner scannerExample3 = new Scanner(System.in);
                String userLogin = scannerExample3.nextLine();
                String[] userArray = userLogin.split(", ", 2);

                if(Encrypt(userArray[1]).equals(loginInfo.get(userArray[0]))) {
                    System.out.println("OK");
                }
                else {
                    System.out.println("Incorrect username or password.");
                }
            }
            else if(action.equals("done")) {
                break;
            }
        }
    }

    public static void ex12() {
        System.out.print("Enter number rows: ");
        Scanner scannerRows = new Scanner(System.in);
        int rows = scannerRows.nextInt();
        System.out.print("Enter number seats: ");
        Scanner scannerSeats = new Scanner(System.in);
        int seats = scannerSeats.nextInt();

        Theater theater = new Theater(rows, seats);
        char[][] theaterArray = theater.CreateTheater();
        theater.ShowTheater(theaterArray);

        while(true) {
            System.out.print("Purchase seat (row, seat): ");
            Scanner scannerPurchase = new Scanner(System.in);
            String purchase = scannerPurchase.nextLine();

            if(purchase.equals("done")) {
                break;
            }

            String[] seatNumber = purchase.split(",", 2);
            theater.TakeSeat(theaterArray, Integer.parseInt(seatNumber[0]), Integer.parseInt(seatNumber[1]));
            theater.ShowTheater(theaterArray);
        }
    }

    public static void ex13() {
        var shapeList = new ArrayList<Shape>();
        var s = new Square("red");
        var c = new Circle("green");
        shapeList.add(s);
        shapeList.add(c);

        for (Shape shape : shapeList) {
            System.out.println(shape.draw());
        }
    }

    public static void ex14() {
        var p1 = new Point(12,14);
        var p2 = new Point(10,10);
        System.out.println(p1.distance(p2));

        var p3 = new MyPoint(12,14);
        var p4 = new MyPoint(10,10);
        System.out.println(p3.distance(p4));
    }

    //
    // Private helper methods
    //

}
