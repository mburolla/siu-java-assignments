package com.xpanxion.assignments.student5;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {
    private double salesTotal;
    private List<StringBuilder> auditorium;
    private Scanner sc = new Scanner(System.in);
    private NumberFormat formatter = NumberFormat.getCurrencyInstance();
    private String emptySeat = "0";
    private String occupiedSeat = "X";


    public MovieTheater() {
        this.salesTotal = 0.00;
        System.out.print("Enter number rows: ");
        int rows = Integer.valueOf(sc.nextLine());
        System.out.print("Enter number seats: ");
        int seats = Integer.valueOf(sc.nextLine());
        buildTheater(rows, seats);
    }

    public void run() {
        printSeating();
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
        auditorium = new ArrayList<>();
    }
/*  refactor this
    private void buildTheater(int rows, int seats) {
        auditorium = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            auditorium.add(new StringBuilder(emptySeat.repeat(seats)));
        }
    }
*/

    private void sellTicket (String[] seatSold) {
        if (seatSold.length != 2) return;
        int row = Integer.valueOf(seatSold[0]);
        int seat = Integer.valueOf(seatSold[1]);
        if (auditorium.get(row-1).charAt(seat-1)=='0') {
            auditorium.get(row-1).setCharAt(seat-1, occupiedSeat.charAt(0));
            salesTotal += row;
        } else System.out.println("That seat has already been sold.");
        printSeating();
        printSalesTotal();
    }

    private void printSeating() {
        auditorium.forEach(System.out::println);
    }

    private void printSalesTotal() {
        System.out.printf("Total sales: %s\n", formatter.format(salesTotal));
    }
}
