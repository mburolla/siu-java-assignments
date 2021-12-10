package Student9;

import com.xpanxion.assignments.student9.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void shouldCreatePerson() {
        var newPerson = new Person(1, "Bill","Smith");
        Assertions.assertFalse(newPerson.validateFirstNameEmpty());
    }
}