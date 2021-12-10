package com.xpanxion.assignments.student6;

public class JavaThree {

    public void ex1() throws DivByZeroException {
        int numer = 10;
        int denom = 0;
        int result = 0;
        try {
            result = numer / denom;
        } catch (ArithmeticException e) {
            String message = "Cannot divide by zero!";
            throw new DivByZeroException(message);
        }
    }
}
