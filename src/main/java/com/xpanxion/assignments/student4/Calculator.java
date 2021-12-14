package com.xpanxion.assignments.student4;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> hist;

    public Calculator() {
        this.hist = new ArrayList<String>();
    }

    public int calculate(int no1, int no2, String op) throws CalculatorException {
        int ans = 0;
        String operation = "";
        switch (op) {
            case "add":
                ans = no1 + no2;
                operation = "+";
               // log.info("Add operation performed");
                break;
            case "sub":
                ans = no1 - no2;
                operation = "-";
               // log.info("Sub operation performed");
                break;
            case "mul":
                ans = no1 * no2;
                operation = "*";
                break;
            case "div":
                try {
                    ans = no1 / no2;
                    operation = "/";
                } catch (Exception e) {
                    System.out.println("cannot divide by Zero " + no1 + "/ " + no2);
                }
        }
            String history = String.format("%s %s %s = %s ", String.valueOf(no1), operation, String.valueOf(no2), ans);
            hist.add(history);
            return ans;
        }
        public List<String> getHistory () {
            return hist;}
    }


