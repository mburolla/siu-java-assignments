package com.xpanxion.assignments.student5;

public class Person {

    private int id;
    private String firstName;
    private String lastName;

    public Person() {
    }


    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String infoToFile() {
        return id + ", "  + firstName + " " + lastName + "\n";
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
    public int getId() {return id;}

    public void setId(int id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
}