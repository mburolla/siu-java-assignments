package com.xpanxion.assignments.instructor;

import jakarta.xml.bind.DatatypeConverter;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.text.NumberFormat;
import java.util.stream.Collectors;
import java.util.concurrent.TimeUnit;

public class JavaTwo {

    /**
     * Person List
     */
    public void ex1() {
        var personList = new ArrayList<Person>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person: ");
            var inString = scanner.nextLine();
            if (inString.equals("done")) {
                break;
            }

            // Parse input.
            var stringTokenizer = new StringTokenizer(inString);
            var id = Integer.parseInt(stringTokenizer.nextToken().replace(",", ""));
            var firstName = stringTokenizer.nextToken();
            var lastName = stringTokenizer.nextToken();

            // Build list.
            personList.add(new Person(id, firstName, lastName));
        }

        for (Person p: personList) { // For each.
            System.out.println(p);
        }
    }

    /**
     * Person HashMap
     */
    public void ex2() {
        var hashMap = new HashMap<Integer, Person>();

        var p1 = new Person(1, "Peter", "Jones");
        var p2 = new Person(2, "John", "Smith");
        var p3 = new Person(3, "Mary", "Jane");

        hashMap.put(1, p1);
        hashMap.put(2, p2);
        hashMap.put(3, p3);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Person ID: ");
            var inString = scanner.nextLine();
            if (inString.equals("done")) {
                break;
            }
            System.out.println(hashMap.get(Integer.parseInt(inString)));
        }
    }

    /**
     * Invoices and Products.
     */
    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    /**
     * Refactor Invoice and Products
     */
    public void ex4() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    /**
     * Repository Interface
     */
    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    /**
     * OOP Calclator
     */
    public void ex6() throws CalculatorException {
        var scanner = new Scanner(System.in); // Type inference.
        var calculator = new Calculator();

        while (true) {
            System.out.print("Enter first number: ");
            var operand1 = scanner.nextLine();
            if (operand1.equals("done")) {
                break;
            }

            System.out.print("Enter second number: ");
            var operand2 = scanner.nextLine();
            if (operand1.equals("done")) {
                break;
            }

            System.out.print("Enter operation (add, sub, mul, div): ");
            var operation = scanner.nextLine();
            var result = calculator.calculate(Integer.parseInt(operand1), Integer.parseInt(operand2), operation);

            var outString = String.format("Result: %s", result);
            System.out.println(outString);
        }

        // Print history.
        for(String s: calculator.getHistory()) {
            System.out.println(s);
        }
    }

    /**
     * Redact Last Name
     */
    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        var newPersonList = personList.stream().map(p -> {
                return new Person(p.getId(), p.getFirstName(), "xxx");
            }).collect(Collectors.toList());

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    /**
     * Sort People
     */
    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        personList.sort(Comparator.comparing((Person p) -> p.getFirstName()));

        for (Person p : personList) {
            System.out.println(p);
        }
    }

    /**
     * Filter People
     */
    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        var filteredList = personList.stream().filter(x -> x.getLastName().equals("Smith")).collect(Collectors.toList());

        for (Person p : filteredList) {
            System.out.println(p);
        }
    }

    /**
     * Cat Queue
     */
    public void ex10() throws InterruptedException {
        Queue<Cat> catQueue = new LinkedList<Cat>();
        catQueue.add(new Cat("Alice"));
        catQueue.add(new Cat("Bob"));
        catQueue.add(new Cat("Charlie"));
        catQueue.add(new Cat("Dan"));

        while (!catQueue.isEmpty()) {
            System.out.println(catQueue);
            catQueue.remove();
            TimeUnit.SECONDS.sleep(3);
        }
    }

    /**
     * Tiny Auth
     */
    public void ex11() {
        var hashMap = new HashMap<String, String>();

        while (true) {
            System.out.print("Action [add|login|done]: ");
            Scanner scanner = new Scanner(System.in);
            var inputString = scanner.nextLine();

            if (inputString.equals("add")) {
                System.out.print("Enter username, password: ");
                inputString = scanner.nextLine();
                addUser(hashMap, inputString);
            }
            if (inputString.equals("login")) {
                System.out.print("Enter username, password: ");
                inputString = scanner.nextLine();
                if (isPasswordCorrect(hashMap, inputString))
                    System.out.println("OK");
                else
                    System.out.println("Incorrect username or password");
            }
            if (inputString.equals("done")) {
                break;
            }
        }
    }

    /**
     * Tiny movie theater
     */
    public void ex12() {
        float totalSales = 0F;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number rows: ");
        var numRows = scanner.nextByte();
        System.out.print("Enter number seats: ");
        var numSeats = scanner.nextByte();
        scanner.nextLine();

        var theaterSeats = new String[numSeats * numRows];
        Arrays.fill(theaterSeats, "0");

        displayMovieTheater(theaterSeats, numSeats, numRows, totalSales);

        while (true) {
            System.out.print("Purchase seat (row, seat): ");
            var inputString = scanner.nextLine();
            if (inputString.equals("done")){
                break;
            }
            var inputArray = inputString.split(",");
            var rowNumber = Integer.parseInt(inputArray[0].replaceAll("\\s+",""));
            var seatNumber = Integer.parseInt(inputArray[1].replaceAll("\\s+",""));
            var index = ((rowNumber - 1) * numSeats) + (seatNumber - 1);
            theaterSeats[index] = "X";
            totalSales += rowNumber;
            displayMovieTheater(theaterSeats, numSeats, numRows, totalSales);
        }
    }

    //
    // Private methods
    //

    private void displayMovieTheater(String[] theaterSeats, Byte numSeats, Byte numRows, float totalSales) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        var display = ""; // TODO: Use StringBuilder
        for (int i=0; i < numRows; i++) {
            for (int k=0; k < numSeats; k++) {
                var index = k + (i * numSeats);
                display += theaterSeats[index];
            }
            display += "\n";
        }
        display += "Total sales: ";
        display += formatter.format(totalSales);
        System.out.println(display);
    }

    private void addUser(HashMap<String, String> hashMap, String inputString) {
        var inputArray = inputString.split(",");
        var userName = inputArray[0].replaceAll("\\s+","");
        var password = inputArray[1].replaceAll("\\s+","");

        var passwordHash = createHash(password);
        hashMap.put(userName, passwordHash);
    }

    private boolean isPasswordCorrect(HashMap<String, String> hashMap, String inputString) {
        var retval = false;

        // Parse input.
        var inputArray = inputString.split(",");
        var userName = inputArray[0].replaceAll("\\s+","");
        var password = inputArray[1].replaceAll("\\s+","");

        // Compare password hashes.
        if (hashMap.containsKey(userName)) {
            var storedPasswordHash = hashMap.get(userName);
            var thisPasswordHash = createHash(password);
            if (storedPasswordHash.equals(thisPasswordHash)) {
                retval = true;
            }
        }
        return retval;
    }

    private String createHash(String inString) {
        var retval = "";
        try {
            var md = MessageDigest.getInstance("SHA1");
            md.update(inString.getBytes(StandardCharsets.UTF_8));
            byte[] digest = md.digest();
            retval = DatatypeConverter.printHexBinary(digest).toUpperCase();
        }
        catch (NoSuchAlgorithmException nsae) {
            nsae.printStackTrace();
        }
        return retval;
    }
}
