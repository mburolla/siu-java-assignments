package Student9;

import com.xpanxion.assignments.student9.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void shouldPerformAdd(){
        // Arrange
        var addCalculator = new Calculator();
        // Act
        addCalculator.setOperation("add");
        //Assert
        Assertions.assertTrue(addCalculator.isOperationAdd());
    }

    @Test
    public void shouldPerformSub(){
        // Arrange
        var subCalculator = new Calculator();
        // Act
        subCalculator.setOperation("sub");
        //Assert
        Assertions.assertTrue(subCalculator.isOperationSub());
    }

    @Test
    public void shouldPerformMul(){
        // Arrange
        var mulCalculator = new Calculator();
        // Act
        mulCalculator.setOperation("mul");
        //Assert
        Assertions.assertTrue(mulCalculator.isOperationMul());
    }

    @Test
    public void shouldPerformDiv(){
        // Arrange
        var divCalculator = new Calculator();
        // Act
        divCalculator.setOperation("div");
        //Assert
        Assertions.assertTrue(divCalculator.isOperationDiv());
    }



}