package com.xpanxion.assignments.student5;

public class Person {

    private String id;
    private String firstName;
    private String lastName;

    public Person() {
    }


    public Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getId() {return id;}

    public void setId(String id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
}
