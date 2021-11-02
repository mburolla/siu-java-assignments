package com.xpanxion.assignments.instructor;

public class Person {

    //
    // Data Members
    //

    private final int id;
    private final String firstName;
    private final String lastName;

    //
    // Constructors
    //

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
