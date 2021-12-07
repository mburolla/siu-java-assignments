package com.xpanxion.assignments.student10;

import java.util.ArrayList;
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
            System.out.println("Person{id="+person.getId()+", firstname="+person.getFirstName() +", lastname=" +person.getLastName()+"}");
        }

    }
}
