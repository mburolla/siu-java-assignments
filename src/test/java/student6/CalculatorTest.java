package student6;

import com.xpanxion.assignments.student6.Calculator;
import com.xpanxion.assignments.student6.DivByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testCalculatorAddition() {
        //ARRANGE
        int result = 0;
        Calculator calculator = new Calculator();
        //ACT
        try {
           result = calculator.calculate(1,4,"add");
        } catch (DivByZeroException e) {
            e.printStackTrace();
        }

        //ASSERT
        assertEquals(5, result, "1 + 4 should be equal to 5");
    }

    @Test
    void testCalculatorSubtraction() {
        //ARRANGE
        int result = 0;
        Calculator calculator = new Calculator();
        //ACT
        try {
            result = calculator.calculate(5,2, "sub");
        } catch (DivByZeroException e) {
            e.printStackTrace();
        }

        assertEquals(3, result, "5 - 2 should be 3");

    }

    @Test
    void testCalculatorMultiplication() {
        //ARRANGE
        int result = 0;
        Calculator calculator = new Calculator();
        //ACT
        try {
            result = calculator.calculate(2,3, "mul");
        } catch (DivByZeroException e) {
            e.printStackTrace();
        }
        //ASSERT
        assertEquals(6, result, "2 * 3 should be 6");
    }

    @Test
    void testCalculatorDivision() {
        //ARRANGE
        int result = 0;
        Calculator calculator = new Calculator();
        //ACT
        try {
            result = calculator.calculate(15, 5, "div");
        } catch (DivByZeroException e) {
            e.printStackTrace();
        }
        //ASSERT
        assertEquals(3, result, "15 / 3 should be 5");
    }


}
