package com.xpanxion.assignments.student4;




import com.xpanxion.assignments.student4.CalculatorException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> hist;

    public Calculator() {
        this.hist = new ArrayList<String>();
    }

    public  int calculate(int no1, int no2, String op) throws CalculatorException {
        int ans = 0;
        String operation = "";
            if (op.equals("add")) {
                ans = no1 + no2;
                operation = "+";
            }if (op.equals("sub")) {
                ans = no1 - no2;
                operation = "-";
            }if (op.equals("mul")) {
                ans = no1 * no2;
                operation = "*";
            }if (op.equals("div")){
                ans = no1 / no2;
                operation = "/";
            }
        String history = String.format("%s %s %s = %s ",String.valueOf(no1) ,operation, String.valueOf(no2) ,ans );
        hist.add(history);
        return ans;
    }
    public List<String> getHistory() {
        return hist;
    }
}

