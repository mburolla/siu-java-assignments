package student1;

import com.xpanxion.assignments.student1.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    @DisplayName("First Name Of Person Object Is Created Correctly")
    public void shouldCreateFirstNameCorrectly() {
        Person person = new Person("1", "Kris", "Norful");
        assertEquals("Kris", person.getFirstName());
    }
}
