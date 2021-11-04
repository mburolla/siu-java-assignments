package Instructor;

import com.xpanxion.assignments.instructor.Person;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class PersonTest {

    @Test
    void testFirstName() {
        // Arrange
        var p = new Person(1, "Joe", "Smith");

        // Act
        String firstName = p.getFirstName();

        // Assert
        assertEquals(firstName, "Joe", "First name should be Joe.");
    }
}
