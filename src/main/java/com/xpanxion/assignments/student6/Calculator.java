package com.xpanxion.assignments.student6;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //MEM VARS
    private final List<String> history;

    //CONSTRUCTOR

    public Calculator() {
        this.history = new ArrayList<String>();
    }

    //GETTER AND SETTER
    public List<String> getHistory() {
        return history;
    }

    //METHOD
    public int calculate(int firstNum, int secondNum, String operation) {
        int retval = 0;
        String strOperation = "";
        if (operation.equals("add")) {
            retval = firstNum + secondNum;
            strOperation = "+";
        }
        if (operation.equals("sub")) {
            retval = firstNum - secondNum;
            strOperation = "-";
        }
        if (operation.equals("mul")) {
            retval = firstNum * secondNum;
            strOperation = "*";
        }
        if (operation.equals("div")) {
            retval = firstNum / secondNum;
            strOperation = "/";
        }

        String strHistory = (firstNum + " " + strOperation + " " + secondNum + " = " + retval);
        history.add(strHistory);
        return retval;
    }
}
