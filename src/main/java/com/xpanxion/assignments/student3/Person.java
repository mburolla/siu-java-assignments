package com.xpanxion.assignments.student3;

public class Person {

    private int id;
    private String firstname;
    private String lastname;

    public Person(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public int getId(){
        return id;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname (){
        return lastname;
    }
}
