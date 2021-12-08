package com.xpanxion.assignments.student5;

import java.text.NumberFormat;
import java.util.Scanner;

public class MovieTheater {
    private double salesTotal;
    private StringBuilder[] auditorium;
    private Scanner sc = new Scanner(System.in);
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String emptySeat = "0";
    String occupiedSeat = "X";


    public MovieTheater() {
        this.salesTotal = 0.00;
    }

    public void run() {
        int rows;
        int seats;
        System.out.print("Enter number rows: ");
        rows = Integer.valueOf(sc.nextLine());
        System.out.print("Enter number seats: ");
        seats = Integer.valueOf(sc.nextLine());
        buildTheater(rows, seats);
        printSalesTotal();
        ticketBooth();
    }
    private void ticketBooth() {
        while (true) {
            System.out.print("Purchase seat (row,seat): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            String seat[] = (input.split(","));
            sellTicket(seat);
        }
    }

    private void buildTheater(int rows, int seats) {

        auditorium = new StringBuilder[rows];

        for (int i = 0; i < rows; i++) {
            auditorium[i] = new StringBuilder(emptySeat.repeat(seats));
        }
    }
    public void sellTicket (String[] seatSold) {
        if (seatSold.length != 2) return;
        int row = Integer.valueOf(seatSold[0]);
        int seat = Integer.valueOf(seatSold[1]);
        if (auditorium[row-1].charAt(seat-1)=='0') {
            auditorium[row-1].setCharAt(seat-1, occupiedSeat.charAt(0));
            salesTotal += row;
        }
        else System.out.println("That seat has already been sold.");
        printSalesTotal();
    }

    public void printSalesTotal() {
        for (StringBuilder s: auditorium) {
            System.out.println(s.toString());
        }
        System.out.printf("Total sales: %s\n", formatter.format(salesTotal));
    }
}
