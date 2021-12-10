package com.xpanxion.assignments.student2;

public class Person {
    int id;
    String firstName;
    String lastName;

    Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Person{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}
