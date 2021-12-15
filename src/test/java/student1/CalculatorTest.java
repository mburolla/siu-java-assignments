package student1;

import com.xpanxion.assignments.student1.Calculator;
import com.xpanxion.assignments.student1.CalculatorException;
import com.xpanxion.assignments.student1.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @Test
    @DisplayName("Addition - Check if 2 + 2 equals 4")
    public void checkAddition() throws CalculatorException {
        calculator = new Calculator(2,2, "add");
        try {
            calculator.performCalculations();
        } catch(CalculatorException ce) {
            ce.printStackTrace();
        }
        var result = calculator.getResult();
        assertEquals(4, result);

    }

    @Test
    @DisplayName("Subtraction - Check if 95 - 10 equals 85")
    public void checkSubtraction() throws CalculatorException {
        calculator = new Calculator(95,10, "sub");
        try {
            calculator.performCalculations();
        } catch(CalculatorException ce) {
            ce.printStackTrace();
        }
        var result = calculator.getResult();
        assertEquals(85, result);
    }

    @Test
    @DisplayName("Divide - Check if 81 / 9 equals 9")
    public void checkDivision() throws CalculatorException {
        calculator = new Calculator(81,9,"div");
        try {
            calculator.performCalculations();
        } catch(CalculatorException ce) {
            ce.printStackTrace();
        }
        var result = calculator.getResult();
        assertEquals(9, result);
    }

    @Test
    @DisplayName("Multiply - Check if 5 * 5 equals 25")
    public void checkMultiplication() throws CalculatorException {
        calculator = new Calculator(5,5, "mul");
        try {
            calculator.performCalculations();
        } catch(CalculatorException ce) {
            ce.printStackTrace();
        }
        var result = calculator.getResult();
        assertEquals(25, result);
    }
}
