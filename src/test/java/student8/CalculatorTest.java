package student8;

import com.xpanxion.assignments.student8.Calculator;
import com.xpanxion.assignments.student8.CalculatorException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    // BEFORE

    @BeforeAll
    static void initAll() { }

    @BeforeEach
    void init() { }

    // TESTS

    @Test
    @DisplayName("Calculator: Tests Addition")
    void testCalculatorAdd() throws CalculatorException {
        // Arrange
        var c = new Calculator();

        // Act
        int sum = c.calculate(2, 3, "add");

        // Assert
        assertEquals(sum, 5, "2 + 3 should return 5.");
    }

    @Test
    @DisplayName("Calculator: Tests Subtraction")
    void testCalculatorSub() throws CalculatorException {
        // Arrange
        var c = new Calculator();

        // Act
        int sub = c.calculate(10, 6, "sub");

        // Assert
        assertEquals(sub, 4, "10 - 6 should return 4.");
    }

    @Test
    @DisplayName("Calculator: Tests Multiplication")
    void testCalculatorMul() throws CalculatorException {
        // Arrange
        var c = new Calculator();

        // Act
        int mul = c.calculate(8, 8, "mul");

        // Assert
        assertEquals(mul, 64, "8 * 8 should return 64.");
    }

    @Test
    @DisplayName("Calculator: Tests Division")
    void testCalculatorDiv() throws CalculatorException {
        // Arrange
        var c = new Calculator();

        // Act
        int div = c.calculate(21, 7, "div");

        // Assert
        assertEquals(div, 3, "21 / 7 should return 3.");
    }

    // AFTER

    @AfterEach
    void tearDown() { }

    @AfterAll
    static void tearDownAll() { }
}
