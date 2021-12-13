package Student10;

import com.xpanxion.assignments.student10.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void firstNameAdded() {
        Person person = new Person(1, "Rachel", "Eckels");
        Assertions.assertFalse(person.getFirstName().isEmpty());
    }
}