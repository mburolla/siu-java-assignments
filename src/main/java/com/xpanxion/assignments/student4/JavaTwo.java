package com.xpanxion.assignments.student4;


import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;

public class JavaTwo {

    public void ex1() {
           var person = new Person();
           ArrayList<Person> prodList = new ArrayList<>();
           Scanner scanner = new Scanner(System.in);
           while (true) {
               System.out.println("enter Person: ");
               String text = scanner.next();
                if (text.equals("done")) {
                   break;
                }
                String[] prodStr = text.split(",");
                //person.id = prodStr[0];
                person.firstName = prodStr[1];
               person.lastName = prodStr[2];
                prodList.add(person);
           }
            for(Person p : prodList){
                System.out.println(p);
            }
    }


    public void ex2() {
        Person person=new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter PersonID: ");
        String text = scanner.next();
        HashMap<String, String> personInfo = new HashMap<String, String>();
        personInfo.put("1", "Peter Jones");
        personInfo.put("2", "John Smith");
        personInfo.put("3", "Mary Jane");
        String[] str = personInfo.get(text).split(" ");
        {
            System.out.println("Person{id=" + text + " firstName= " + str[0] + " lastName= " + str[1] + "}");
        }
    }

    public void ex3(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));

    }

    public void ex4(){
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }

    public void ex5(){
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);
    }


    public void ex6() throws CalculatorException {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.print("Enter first number: ");
            String no1 = scanner.nextLine();
            if (no1.equals("done")) {
                break;
            }
            System.out.print("Enter second number: ");
            String no2 = scanner.nextLine();
            System.out.print("Enter operation (add, sub, mul, div): ");
            String op = scanner.nextLine();
            int result = calculator.calculate(Integer.parseInt(no1), Integer.parseInt(no2), op);
            String outString = String.format("Result: %s", result);
            System.out.println(outString);
        }
        System.out.println(calculator.getHistory());


    }
   public void ex7() {
       Person person=new Person();
        var personList = Arrays.asList(
                new Person(1, "Peter", "Jones"),
                new Person(2, "John", "Smith"),
                new Person(3, "Sue", "Anderson")
       );
        List<Person> updatedList = personList.stream().map(x-> new Person(x.getId(), x.getFirstName(), "xxx")).toList();
        for (Person p : updatedList) {
            System.out.println(p);
        }
    }



    public void ex8() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson"));
         personList.sort(Comparator.comparing(x -> x.getFirstName()));
        for(Person p : personList){
          System.out.println(p);
        }
    }



    public void ex9() {
        var personList = Arrays.asList(
                new Person(1, "Charlie", "Jones"),
                new Person(2, "Zoey", "Smith"),
                new Person(3, "Adam", "Anderson"));
        var list =personList.stream().filter(x -> x.getLastName().equals("Smith")).collect(Collectors.toList());
        for (Person p : list) {
            System.out.println(p);
        }
    }

}






