package student7;

import com.xpanxion.assignments.student7.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestPerson {

    @Test
    public void testCreatesPersonFirstName(){
        var testPerson = new Person(1, "Austin", "King");
        String testFirstName = testPerson.getFirstName();
        assertEquals(("Austin"), testFirstName);
    }
}
