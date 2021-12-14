package student8;

import com.xpanxion.assignments.student8.Person;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    // BEFORE

    @BeforeAll
    static void initAll() { }

    @BeforeEach
    void init() { }

    // TESTS

    @Test
    @DisplayName("Person: Test First Name Add")
    void testPersonAddFirstName() {
        // Arrange
        var p = new Person(1, "Betty", "James");

        // Act
        var firstName = p.getFirstName();

        // Assert
        assertEquals(firstName, "Betty", "getFirstName() should return 'James'.");
    }

    // AFTER

    @AfterEach
    void tearDown() { }

    @AfterAll
    static void tearDownAll() { }

}
