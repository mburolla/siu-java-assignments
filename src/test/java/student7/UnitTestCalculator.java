package student7;

import com.xpanxion.assignments.student7.Calculator;
import com.xpanxion.assignments.student7.CalculatorException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestCalculator {

    @Test
    void testAddition() throws CalculatorException {
        var calculator = new Calculator();
        String calculateTest = calculator.calculate(2,3,"ADD");
        assertEquals("Result: " + 5,calculateTest);
    }

    @Test
    void testSubtraction() throws CalculatorException {
        var calculator = new Calculator();
        String calculateTest = calculator.calculate(3,2,"SUB");
        assertEquals("Result: " + 1, calculateTest);
    }

    @Test
    void testMultiplication() throws CalculatorException {
        var calculator = new Calculator();
        String calculateTest = calculator.calculate(3,2,"MUL");
        assertEquals("Result: " + 6, calculateTest);
    }

    @Test
    void testDivision() throws CalculatorException {
        var calculator = new Calculator();
        String calculateTest = calculator.calculate(4,2,"DIV");
        assertEquals("Result: " + 2, calculateTest);
    }

}
