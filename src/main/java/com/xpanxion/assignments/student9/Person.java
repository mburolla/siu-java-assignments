package com.xpanxion.assignments.student9;

public class Person {
    int id;
    String firstName;
    String lastName;

    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Person{").append("id=").append(id).append(", firstName='").append(firstName).append('\'').append(", lastName='").append(lastName).append('\'').append('}').toString();
    }
}
