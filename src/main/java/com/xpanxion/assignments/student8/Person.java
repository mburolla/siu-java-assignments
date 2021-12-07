package com.xpanxion.assignments.student8;

public class Person {

    // Data
    private int id;
    private String firstName;
    private String lastName;

    // Constructor
    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Override
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    // Accessors
    public int getId() {
        return id;
    }
}
