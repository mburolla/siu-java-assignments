package com.xpanxion.assignments.student4;


import org.apache.log4j.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Calculator {
    {
        this.hist = new ArrayList<String>();
    }

        public int calculate(int no1, int no2, String op) throws IOException, CalculatorException {
            final Logger logger = LogManager.getLogger(Calculator.class);
            Appender fh;
            fh = new FileAppender(new SimpleLayout(), "C:\\Users\\e0m0bk0\\Desktop\\Test\\Output-2.txt");
            logger.addAppender(fh);
            fh.setLayout(new SimpleLayout());
        int ans = 0;
        String operation = "";
        switch (op) {
            case "add":
                ans = no1 + no2;
                operation = "+";
               logger.info("Add operation performed");
                break;
            case "sub":
                ans = no1 - no2;
                operation = "-";
               logger.info("Sub operation performed");
                break;
            case "mul":
                ans = no1 * no2;
                operation = "*";
                logger.info("Mul operation performed");
                break;
            case "div":
                try {
                    ans = no1 / no2;
                    operation = "/";
                } catch (ArithmeticException e) {
                    logger.warn("cannot divide by zero");
                    throw new CalculatorException("cannot divide by Zero " + no1 + "/ " + no2);

                }
        }
            String history = String.format("%s %s %s = %s ", String.valueOf(no1), operation, String.valueOf(no2), ans);
            hist.add(history);
            return ans;
        }
        public List<String> getHistory () {
            return hist;}

    private final List<String> hist;
}


