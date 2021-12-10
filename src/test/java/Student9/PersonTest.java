package Student9;

import com.xpanxion.assignments.student9.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void shouldCreatePerson() {
        //Arrange
        var newPerson = new Person();
        // Act
        newPerson.setFirstName("Bill");
        // Assert
        Assertions.assertFalse(newPerson.validateFirstNameEmpty());
    }
}