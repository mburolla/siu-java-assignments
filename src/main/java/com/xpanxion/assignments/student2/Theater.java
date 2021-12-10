package com.xpanxion.assignments.student2;

public class Theater {

    private int rows;
    private int seats;
    private double totalSales = 0.00;

    Theater(int rows, int seats) {
        this.rows = rows;
        this.seats = seats;
    }

    char[][] createTheater() {
        char[][] theaterArray = new char[rows][seats];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                theaterArray[i][j] = '0';
            }
        }
        return theaterArray;
    }

    void takeSeat(char[][] theaterArray, int i, int j) {
        theaterArray[i - 1][j - 1] = 'X';
    }

    void showTheater(char[][] theaterArray) {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                System.out.print(theaterArray[i][j]);
                if(theaterArray[i][j] == 'X') {
                    totalSales += 1.00;
                }
            }
            System.out.println("");
        }
        System.out.println("Total sales: $" + String.format("%.2f",totalSales));
        totalSales = 0;
    }
}
