package student5;

import com.xpanxion.assignments.student5.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    @DisplayName("Should create a person with the first name Aaron")
    public void shouldCreatePersonNamedAaron() {
        Person person = new Person(1, "Aaron", "Weegens");
        assertTrue(person.getFirstName().equals("Aaron"));
    }
}
