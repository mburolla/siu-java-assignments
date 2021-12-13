package com.xpanxion.assignments.student3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void shouldGetFirstname() {
        Person person = new Person(1, "Keith", "Inscore");

       var firstName = person.getFirstname();

       assertEquals(firstName, "Keith", "first name should be Keith");

    }
}