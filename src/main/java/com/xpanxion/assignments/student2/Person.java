package com.xpanxion.assignments.student2;

public class Person {
    private final int id;
    private final String firstName;
    private final String lastName;

    Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Person{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void validateFirstName() {
        if (this.firstName.isBlank())
            throw new RuntimeException("First name cannot be null/empty");
    }
}
