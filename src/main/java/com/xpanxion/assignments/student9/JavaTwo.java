package com.xpanxion.assignments.student9;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {

    JavaTwo() {};

    public void ex1() {
        var list = new ArrayList<Person>();
        while(true) {
            System.out.print("Enter Person > ");
            var scanner = new Scanner(System.in);
            var tempString = scanner.nextLine();
            if(tempString.equals("done")){
                break;
            } else {
                String[] splits = tempString.split(",");
                var tempId = Integer.parseInt(splits[0]);
                var fullName = splits[1];

                String[] splitName = fullName.trim().split(" ");
                var firstName = splitName[0];
                var lastName = splitName[1];
                list.add(new Person(tempId,firstName,lastName));
            }
        }
        list.forEach(System.out::println);
    }

    public void ex2() {
        HashMap<Integer,Person>map = new HashMap<>();
        map.put(1,new Person(1,"Peter","Jones"));
        map.put(2,new Person(2,"John","Smith"));
        map.put(3,new Person(3,"Mary","Jane"));
        while(true) {
            System.out.print("Enter Person ID > ");
            var scanner = new Scanner(System.in);
            var userId = scanner.next();
            if (userId.equals("done")) {
                break;
            } else {
                try{
                    var tempId = Integer.parseInt(userId);
                    if(map.containsKey(tempId)){
                        System.out.println(map.get(tempId));
                    } else {
                        System.out.println("Invalid id. Try again");
                    }
                } catch (NumberFormatException ex){
                    System.out.println("Must be an integer value");
                }
            }
        }
    }

    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex4(){
        // Base Class created and extended to Invoice and Product
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }

    public void ex6() {
        var calculationList = new ArrayList<Calculator>();
        while(true) {
            System.out.print("Enter first number > ");
            var scanner = new Scanner(System.in);
            var firstNumber = scanner.next();
            if(firstNumber.equals("done")){
                break;
            } else {
                System.out.print("Enter the second number > ");
                var secondNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter operation > ");
                var operationString = scanner.nextLine();

                if (operationString.equals("add") || operationString.equals("sub") || operationString.equals("mul") || operationString.equals("div")) {
                    var calculation = new Calculator(Integer.parseInt(firstNumber), secondNumber, operationString);
                    calculationList.add(calculation);
                    System.out.printf("Result > %d%n",calculation.getResult());
                } else {
                    System.out.println("Invalid operation");
                }
            }
            }

        calculationList.forEach(System.out::println);
    }

    public void ex7() {
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
        );

        List<Person> newPersonList = personList.stream().map(p -> new Person(p.getId(),p.getFirstName(),"xxx")).toList();

        for (Person p : newPersonList) {
            System.out.println(p);
        }
    }

    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson")
        );

        Collections.sort(personList);
        for (Person p : personList) {
            System.out.println(p);
        }
    }

}
