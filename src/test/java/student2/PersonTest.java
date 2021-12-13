package student2;

import com.xpanxion.assignments.student2.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void checkFirstName() {
        Person person = new Person(1, "Barrett", "Johnson");
        String firstName = person.getFirstName();
        assertEquals("Barrett", firstName, "Incorrect first name.");
    }
}