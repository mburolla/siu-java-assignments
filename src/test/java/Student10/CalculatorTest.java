package Student10;
import com.xpanxion.assignments.student10.Calculator;

import com.xpanxion.assignments.student10.CalculatorException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int answer = 4;
        int calcAnswer = 0;
        try {
            calcAnswer = calc.calculate(2, 2, "add");
        } catch (CalculatorException ce) {
            ce.printStackTrace();
        }
        Assertions.assertEquals(answer, calcAnswer);
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        int answer = 0;
        int calcAnswer = 0;
        try {
            calcAnswer = calc.calculate(2, 2, "sub");
        } catch (CalculatorException ce) {
            ce.printStackTrace();
        }
        Assertions.assertEquals(answer, calcAnswer);
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        int answer = 4;
        int calcAnswer = 0;
        try {
            calcAnswer = calc.calculate(2, 2, "mul");
        } catch (CalculatorException ce) {
            ce.printStackTrace();
        }
        Assertions.assertEquals(answer, calcAnswer);
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        int answer = 1;
        int calcAnswer = 0;
        try {
            calcAnswer = calc.calculate(2, 2, "div");
        } catch (CalculatorException ce) {
            ce.printStackTrace();
        }
        Assertions.assertEquals(answer, calcAnswer);
    }

}