package com.xpanxion.assignments.student1;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaTwo {

    //
    // Constructors
    //

    JavaTwo() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        //while user has not entered 'done'
        while (true) {
            //prompt used to enter a list of people
            System.out.print("Enter Person (id first last): ");
            //store each token in variables (first, last)
            String id = scanner.next();
            String firstName;
            String lastName;

            if (id.equals("done")) {
                break;
            }
            firstName = scanner.next();
            lastName = scanner.next();
            people.add(new Person(id,firstName, lastName));
        }

        people.forEach(System.out::println);
    }

    public void ex2() {
        Scanner scanner = new Scanner(System.in);
        //create HashMap whose key is an Integer and value is a Person
        HashMap<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(1, new Person("1", "Peter", "Jones"));
        map.put(2, new Person("2", "John", "Smith"));
        map.put(3, new Person("3", "Mary", "Jane"));

        map.forEach((k,v) -> System.out.println(k + " " + v.getFirstName() + " " + v.getLastName()));

        //while user is not "done"
        while(true) {
            //prompt user to enter a person id and store in variable
            System.out.print("Enter Person ID: ");
            String userID = scanner.next();

            if (userID.equals("done")) break;

            if (isInt(userID)) {
                // use id to look up the Person object of that id
                var getPerson = map.get(Integer.parseInt(userID));
                //print user info, if found
                System.out.println(formatString(getPerson));
            }

        }

    }

    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));

        invoice.getTotalCost();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));

        invoice.getTotalCost();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5() {
        var repository = new Repository();
        HashMap<Integer, Person> personHashMap = new HashMap<Integer, Person>();
        personHashMap.put(1, new Person("1", "John", "Doe"));
        var p = repository.getPerson(personHashMap);
        System.out.println(formatString(p));
    }

    public void ex6() {
        Calculator calculator = null;
        Scanner scanner = new Scanner(System.in);

        //while user is not "done"
        while (true) {
            //prompt user for first operand
            System.out.print("Enter first number: ");

            //variables
            var firstNumber = scanner.next();
            int secondNumber;
            String operation;

            //if user enters "done" for first operand break loop
            if (firstNumber.equals("done")) break;

            if (isInt(firstNumber)) {

                var firstNumberInt = Integer.parseInt(firstNumber);

                //prompt user for second operand
                System.out.print("Enter second number: ");
                secondNumber = scanner.nextInt();

                //prompt user to choose operation
                System.out.print("Enter operation (add, sub, mul, div): ");
                operation = scanner.next().toLowerCase();
                calculator = new Calculator(firstNumberInt, secondNumber, operation);
                calculator.performCalculations();

                var getResult = calculator.getResult();
                System.out.print("Result: " + getResult + "\n");
            }
        }
        //show history of all calculations
        calculator.printHistory();

    }

    public void ex7() {
        var personList = Arrays.asList(
                new Person("1", "Peter", "Jones"),
                new Person("2", "John", "Smith"),
                new Person("3", "Sue", "Anderson")
        );

        var newPersonList = personList
                .stream()
                .map(p -> {
                    p.setLastName("xxx");
                    return p;
                })
                .collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(formatString(p));
        }
    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person("1", "Charlie", "Jones"),
                new Person("2", "Zoey", "Smith"),
                new Person("3", "Adam", "Anderson")
        );

        Comparator<Person> firstnameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        personList.sort(firstnameComparator);

        for (Person p : personList) {
            System.out.println(formatString(p));
        }
    }

    public void ex9() {
        var personList = Arrays.asList(
                new Person("1", "Charlie", "Jones"),
                new Person("2", "Zoey", "Smith"),
                new Person("3", "Adam", "Anderson")
        );

        var filteredList = personList
                .stream()
                .filter(p -> {
                    var getLastName = p.getLastName();
                    if (getLastName == "Smith") {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(formatString(p));
        }
    }

    public void ex10() {
        Queue<Cat> catQueue = new LinkedList<Cat>();
        catQueue.add(new Cat("Alice"));
        catQueue.add(new Cat("Bob"));
        catQueue.add(new Cat("Charlie"));
        catQueue.add(new Cat("Dan"));

        while(!catQueue.isEmpty()) {
            catQueue
                    .forEach(cat -> System.out.print("name=" + cat.getName() + " "));
            catQueue.remove();

            //set 3 second delay
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }

            System.out.println();
        }
    }

    public void ex11() {
        Scanner scanner = new Scanner(System.in);
        EncryptedPerson person = null;
        HashMap<String, EncryptedPerson > credentials = new HashMap<String, EncryptedPerson>();
        //while user is not done
        while (true) {
            //prompt user for username and password
            System.out.print("Action [add|login|done]: ");
            var action = scanner.next();
            //HashMap for storing username and password
            String username;
            String hashedPassword = "";

            if (action.equals("done")) {
                break;
            } else {
                System.out.print("Enter username password: ");
                username = scanner.next();
                hashedPassword = add(scanner.next());

                switch (action) {
                    case "add" -> {
                        //hash password using SHA1 algorithm

                        person = new EncryptedPerson(username, hashedPassword);
                        //store username and Person in HashMap as K,V respectively
                        credentials.put(username, person);
                    }
                    case "login" -> {
                        var retrievePerson = credentials.get(username);
                        if (retrievePerson.getPassword().equals(hashedPassword) && retrievePerson.getUsername().equals(username)) {
                            System.out.println("OK");
                        } else {
                            System.out.println("Incorrect username or password.");
                        }
                    }
                    default -> System.out.println("Invalid Command!");
                }
            }
        }
    }

    public void ex12() {
        Scanner scanner = new Scanner(System.in);

        //prompt user for rows and seats
        int rows;
        int seats;
        String purchaseRow = "0";
        int purchasedSeatTotal = 0;
        int purchaseSeat = 0;
        int rowCount = 1;
        var totalSales = "";
        HashMap<Integer, ArrayList<String>> seatDisplay = new HashMap<Integer, ArrayList<String>>();

        //create purchaseRow, purchaseSeat, totalSales variables, uninitialized
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        System.out.print("Enter number rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter number seats: ");
        seats = scanner.nextInt();

        //create 2d array for rows, seats
        var rowsAndSeats = new ArrayList[rows][seats];


        //while user is not "done"
        while(rowCount != rows ) {
            //for loop to iterate thru rows
            for (var i = 1; i <= rows; i++) {
//                ArrayList<String> row = seatDisplay.get(Integer.parseInt(purchaseRow)) != null ? seatDisplay.get(Integer.parseInt(purchaseRow)) : new ArrayList<String>(seats);
                rowCount++;
                //for loop to iterate thru seats
                for (var j = 1; j <= seats; j++) {
                    if (isInt(purchaseRow)) {
                        //if purchase seat row and seat is equal to current iterator
                        if (Integer.parseInt(purchaseRow) == i && purchaseSeat == j) {
                            //paint spot with 'X'
                            rowsAndSeats[i-1][j-1] = new ArrayList();
                            rowsAndSeats[i-1][j-1].add("X");
                        } else {
                            //else
                            //paint rows,seats display
                            if (rowsAndSeats[i - 1][j - 1] == null) {
                                rowsAndSeats[i-1][j-1] = new ArrayList();
                                rowsAndSeats[i - 1][j - 1].add("0");
                            }
                        }
                    } else break;
                }
            }

            //call to method to print seat arrangement
            flatten2dArray(rowsAndSeats);

            //print totalSales = row number converted to currency + totalSales
            purchasedSeatTotal += Integer.parseInt(purchaseRow);
            totalSales = numberFormat.format(purchasedSeatTotal);
            System.out.println("Total sales: " + totalSales);

            //prompt user for purchase row,seat
            System.out.print("Purchase seat (row seat): ");
            purchaseRow = scanner.next();
            purchaseSeat = scanner.nextInt();
        }
    }

    public void ex13() {
        var shapeList = new ArrayList<Shape>();
        var s = new Square("red");
        var c = new Circle("green");
        shapeList.add(s);
        shapeList.add(c);

        for (Shape shape : shapeList) {
            System.out.println(shape.draw());
        }
    }

    public void ex14() {
        var p1 = new MyPoint(12,14);
        var p2 = new MyPoint(10,10);
        System.out.println(p1.distance(p2));
    }

    //
    // Private helper methods
    //

    public static boolean isInt(String str) {

        try {
            int x = Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    private static String formatString(Person p) {
        return "id=" + p.getUserID() + ", firstName=" + p.getFirstName() + ", lastName=" + p.getLastName();
    }

    private static String encryptThisString(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private static String add(String password) {
        return encryptThisString(password);
    }

    public void flatten2dArray(ArrayList[][] seatArr) {
//        System.out.println("from flatten2dArray: " + Arrays.deepToString(seatArr));
        var seatDisplay = Arrays.stream(seatArr).map(p -> Arrays.stream(p).flatMap(Collection::stream).collect(Collectors.toList()));
        seatDisplay.forEach(System.out::println);
    }
}
