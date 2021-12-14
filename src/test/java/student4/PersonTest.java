package student4;


import com.xpanxion.assignments.student4.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testFirstName() {
        var p = new Person(1, "Elsa", "Michael");
        String firstName = p.getFirstName();
        assertEquals(firstName, "Elsa", "First name should be Elsa");
    }
}
