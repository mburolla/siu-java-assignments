package com.xpanxion.assignments.student10;


import java.util.List;

public final class Person {
    private String firstName;
    private String lastName;
    private int id;


    public Person (int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public int getId() {
        return this.id;
    }

    @Override
    public String toString(){ return String.format("Person{id=%s, firstname=%s, lastname=%s}", id, firstName, lastName);}
}
