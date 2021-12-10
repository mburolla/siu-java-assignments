package com.xpanxion.assignments.student9;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
     private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){}

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean validateFirstNameEmpty() {
        return this.firstName.isBlank();
    }

    public boolean validateLastNameEmpty() {
        return this.lastName.isBlank();
    }


    @Override
    public String toString() {
        return new StringBuilder().append("Person{").append("id=").append(id).append(", firstName='").append(firstName).append('\'').append(", lastName='").append(lastName).append('\'').append('}').toString();
    }

    @Override
    public int compareTo(Person o) {
        var comparison = this.firstName.compareTo(o.firstName);
        return comparison == 0 ? this.lastName.compareTo(o.lastName) : comparison;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id,this.firstName,this.lastName);
    }
    @Override
    public boolean equals(Object o){
        if(this == o ) return true;
        if(!(o instanceof Person)) return false;
        var that = (Person) o;
        return this.id == that.id && Objects.equals(this.firstName,that.firstName) && Objects.equals(this.lastName,that.lastName);
    }

}

