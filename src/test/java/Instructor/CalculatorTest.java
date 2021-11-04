package Instructor;

import org.junit.jupiter.api.*;
import com.xpanxion.assignments.instructor.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.xpanxion.assignments.instructor.CalculatorException;

public class CalculatorTest {

    @Test
    void testCalculatorAddition() {
        // Arrange
        int result = 0;
        var calculator = new Calculator();

        // Act
        try {
            result = calculator.calculate(1,2,"add");
        }
        catch (CalculatorException ce) {
            ce.printStackTrace();
        }

        // Assert
        assertEquals(3, result, "1 + 2 should be equal to 3.");
    }

    @Test
    void testCalculatorSubtract() {
        // Arrange
        int result = 0;
        var calculator = new Calculator();

        // Act
        try {
            result = calculator.calculate(1,2,"sub");
        }
        catch (CalculatorException ce) {
            ce.printStackTrace();
        }

        // Assert
        assertEquals(-1, result, "1 - 2 should be equal to -1.");
    }

    @Test
    void testCalculatorMultiply() {
        // Arrange
        int result = 0;
        var calculator = new Calculator();

        // Act
        try {
            result = calculator.calculate(1,2,"mul");
        }
        catch (CalculatorException ce) {
            ce.printStackTrace();
        }

        // Assert
        assertEquals(2, result, "1 * 2 should be equal to 2.");
    }

    @Test
    void testCalculatorDivision() {
        // Arrange
        int result = 0;
        var calculator = new Calculator();

        // Act
        try {
            result = calculator.calculate(10,5,"div");
        }
        catch (CalculatorException ce) {
            ce.printStackTrace();
        }

        // Assert
        assertEquals(2, result, "10 / 5 should be equal to 2.");
    }
}
