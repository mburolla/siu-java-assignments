package com.xpanxion.assignments.student1;

public class Person {
    private int userID;
    private String firstName;
    private String lastName;
    private static int id;

    public Person(String userid, String firstName, String lastName) {
        id++;
        this.userID = Integer.parseInt(userid);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserId(int id) {
        this.userID = id;
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


}
