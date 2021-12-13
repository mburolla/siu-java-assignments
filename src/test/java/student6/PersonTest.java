package student6;

import com.xpanxion.assignments.student6.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void testFirstName() {
        //ARRANGE
        Person p = new Person(1, "Joe", "Smith");
        //ACT
        String firstName = p.getFirstName();
        //ASSERT
        assertEquals(firstName, "Joe", "First name should be Joe");
    }
}
