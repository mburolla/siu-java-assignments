package student4;


import com.xpanxion.assignments.student4.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testCalculatorAddition() {
        int ans = 0;
        var calculator = new Calculator();
        try {
            ans = calculator.calculate(4,2,"add");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        assertEquals(6, ans, "4 + 2 should be equal to 6.");
    }

    @Test
    void testCalculatorSubtract() {
        int result = 0;
        var calculator = new Calculator();
        try {
            result = calculator.calculate(4,2,"sub");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        assertEquals(2, result, "4 - 2 should be equal to 2.");
    }

    @Test
    void testCalculatorMultiply() {
        int ans = 0;
        var calculator = new Calculator();
        try {
            ans = calculator.calculate(2,2,"mul");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        assertEquals(4, ans, "2 * 2 should be equal to 4.");
    }

    @Test
    void testCalculatorDivision() {
        int ans = 0;
        var calculator = new Calculator();
        try {
            ans = calculator.calculate(4,2,"div");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        assertEquals(2, ans, "4 / 2 should be equal to 2.");
    }

}