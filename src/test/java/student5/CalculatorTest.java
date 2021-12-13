package student5;

import com.xpanxion.assignments.student5.Calculator;
import com.xpanxion.assignments.student5.CalculatorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Should find 5 + 5 to equal 10")
    public void shouldEqual10() throws CalculatorException {
        assertTrue(calculator.calculate(5,5,"add") == 10.0);
    }
    @Test
    @DisplayName("Should find 5 * 5 to equal 25")
    public void shouldEqual25() throws CalculatorException {
        assertTrue(calculator.calculate(5,5,"mul") == 25.0);
    }
    @Test
    @DisplayName("Should find 5 - 5 to equal 0")
    public void shouldEqual0() throws CalculatorException {
        assertTrue(calculator.calculate(5,5,"sub") == 0.0);
    }
    @Test
    @DisplayName("Should find the sum of 5 / 5 to equal 1")
    public void shouldEqual1() throws CalculatorException {
        assertTrue(calculator.calculate(5,5,"div") == 1.0);
    }
    @Test
    @DisplayName("Should throw CalculatorException notByZero 5 / 0 ")
    void shouldThrowCalculatorException() {
        Exception exception = assertThrows(CalculatorException.class, () ->
                calculator.calculate(5, 0, "div"));
        assertEquals(null, exception.getMessage());

    }
}
