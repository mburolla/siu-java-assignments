package com.xpanxion.assignments.student10;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private int result;

    private List<String> calcList = new ArrayList<>();

    public Calculator () {
    }

    public void setNum1(int num1) {this.num1 = num1;}
    public void setNum2(int num2) {this.num2 = num2;}
    public void setOperator(String operator) {this.operator = operator;}
    public int getNum1(){return this.num1;}
    public int getNum2(){return this.num2;}
    public String getOperator(){return this.operator;}
    public List<String> getList () {return this.calcList;}

    public int calculate() {

        if (this.operator.equals("add")) {
            int result = this.num1 + this.num2;
            setOperator("+");
            calcList.add(String.format("%s %s %s = %s", num1, operator, num2, result));
            return result;
        }
        else if (this.operator.equals("sub")) {
            int result = this.num1 - this.num2;
            setOperator("-");
            calcList.add(String.format("%s %s %s = %s", num1, operator, num2, result));
            return result;
        }
        else if (this.operator.equals("mul")) {
            int result = this.num1 * this.num2;
            setOperator("*");
            calcList.add(String.format("%s %s %s = %s", num1, operator, num2, result));
            return result;
        }
        else {
            double result = this.num1 /(double) this.num2;
            setOperator("/");
            calcList.add(String.format("%s %s %s = %s", num1, operator, num2, result));
            return (int)result;
        }

    }

}
