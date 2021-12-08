package com.xpanxion.assignments.student5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MovieTheater {
    private int salesTotal;
    private StringBuilder[] auditorium;
    private Scanner sc = new Scanner(System.in);


    public MovieTheater() {

    }

    public void run() {
        int rows;
        int seats;
        System.out.print("Enter number rows: ");
        rows = Integer.valueOf(sc.nextLine());
        System.out.print("Enter number seats: ");
        seats = Integer.valueOf(sc.nextLine());
        buildTheater(rows, seats);

    }

    private void buildTheater(int rows, int seats) {
        var emptySeat = "0";
        var occupiedSeat = "X";

        auditorium = new StringBuilder[rows];

        for (StringBuilder s: auditorium) {
            s = new StringBuilder(emptySeat.repeat(seats));
        }

        System.out.println(auditorium.toString());

    }
}
