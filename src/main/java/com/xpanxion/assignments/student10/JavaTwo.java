package com.xpanxion.assignments.student10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JavaTwo {



    JavaTwo() {
    }

    public void ex1 () {
        List<Person> personList = new ArrayList(0);
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Enter person: ");
            String input = scanner.nextLine();
            if(input.equals("done")){
                break;
            }
            String inputArray [] = input.split(" ");
            Person person = new Person(Integer.parseInt(inputArray[0]), inputArray[1], inputArray[2]);
            personList.add(person);

        }
        for (Person person : personList){
            //System.out.println("Person{id="+person.getId()+", firstname="+person.getFirstName() +", lastname=" +person.getLastName()+"}");
            System.out.println(person);
        }

    }

    public void ex2 () {
        HashMap<Integer, Person> personMap = new HashMap<>();
        Person person1 = new Person(1, "Peter", "Jones");
        Person person2 = new Person(2, "John", "Smith");
        Person person3 = new Person(3, "Mary","Jane");
        personMap.put(1,person1);
        personMap.put(2,person2);
        personMap.put(3,person3);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter person ID: ");
            String input = scanner.next();
            if (input.equals("done")) {
                break;
            }
            int inputNum = Integer.parseInt(input);
            System.out.println(personMap.get(inputNum));
        }
    }
}
