package student2;

import com.xpanxion.assignments.student2.Calculator;
import com.xpanxion.assignments.student2.CalculatorException;
import com.xpanxion.assignments.student2.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAddition() throws CalculatorException {
        Calculator calculate = new Calculator();
        float sum = calculate.calculate(2, 3, "add");
        assertEquals(2+3, sum, "Addition is incorrect.");
    }

    @Test
    public void testSubtraction() throws CalculatorException {
        Calculator calculate = new Calculator();
        float difference = calculate.calculate(3, 4, "sub");
        assertEquals(3-4, difference, "Difference is incorrect.");
    }

    @Test
    public void testMultiplication() throws CalculatorException {
        Calculator calculate = new Calculator();
        float product = calculate.calculate(5, 7, "mul");
        assertEquals(5*7, product, "Product is incorrect.");
    }

    @Test
    public void testDivision() throws CalculatorException {
        Calculator calculate = new Calculator();
        float quotient = calculate.calculate(8, 4, "div");
        assertEquals(8/4, quotient, "Quotient is incorrect.");
    }

}