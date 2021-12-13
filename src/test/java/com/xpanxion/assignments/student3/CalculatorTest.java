package com.xpanxion.assignments.student3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator= new Calculator();

    @Test
    public void shouldAdd(){
        int result = 0;

        try {
            result = calculator.calculate(1, 2, "+");
        } catch (Exception exception) {
            return;
        }
        assertEquals(3, result, "should give 2");
    }

    @Test
    public void shouldSub(){
        int result = 0;

        try {
            result = calculator.calculate(1, 1, "-");
        }catch (Exception exception){
            return;
        }
        assertEquals(0, result, "should give 0");
    }

    @Test
    public void shouldMulti(){
        int result = 0;

        try{
            result = calculator.calculate(2, 3, "*");
        }catch (Exception exception){
            return;
        }
        assertEquals(6, result, "should give 6");
    }

    @Test
    public void  shouldDiv(){
        int result = 0;

        try{
            result = calculator.calculate(6, 3, "/");
        }catch (CalculatorException calculatorException){
            System.out.println(calculatorException.getMessage());
        }
        assertEquals(2, result, "should give 2");
    }
}