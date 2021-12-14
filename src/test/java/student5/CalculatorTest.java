package student5;

import com.xpanxion.assignments.student5.Calculator;
import com.xpanxion.assignments.student5.CalculatorException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    @DisplayName("Should find 5 + 5 to equal 10")
    public void shouldEqual10() throws CalculatorException {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        var result = calculator.calculate(5,5,"add");
        // Assert
        assertEquals(result,10.0, "add should return 10.0");

    }
    @Test
    @DisplayName("Should find 5 * 5 to equal 25")
    public void shouldEqual25() throws CalculatorException {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        var result = calculator.calculate(5,5,"mul");
        // Assert
        assertEquals(result,25.0,"mul should return 25.0");
    }
    @Test
    @DisplayName("Should find 5 - 5 to equal 0")
    public void shouldEqual0() throws CalculatorException {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        var result = calculator.calculate(5,5,"sub");
        // Assert
        assertEquals(result,0.0,"sub should return 0.0");
    }
    @Test
    @DisplayName("Should find 5 / 5 to equal 1")
    public void shouldEqual1() throws CalculatorException {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        var result = calculator.calculate(5,5,"div");
        // Assert
        assertEquals(result,1.0, "div should return 1.0");
    }
    @Test
    @DisplayName("Should throw CalculatorException notByZero 5 / 0 ")
    void shouldThrowCalculatorException() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        Exception exception = assertThrows(CalculatorException.class, () ->
                calculator.calculate(5, 0, "div"));
        // Assert
        assertNotNull(exception);
    }
}
