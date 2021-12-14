package com.xpanxion.assignments.student1;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaThree {

    //
    // Constructors
    //

    JavaThree() {}

    //
    // Public methods
    //

    public void ex1() {
        try {
            var result = 10/ 0;
        } catch (Exception e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public void ex2() {
        var calculator = new Calculator(10, 0, "div");
        calculator.performCalculations(); // Catch this error.
    }

    public void ex3() {
        //write to file
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("C:\\Users\\k0n03h5\\Desktop\\Test\\input-1.txt"));
            bw.write("This is line 1 from input-1.txt.\n");
            bw.write("This is line 2 from input-1.txt.\n");
            bw.write("This is line 3 from input-1.txt.\n");
            bw.write("This is line 4 from input-1.txt.\n");
            bw.write("This is line 5 from input-1.txt.\n");
            bw.close();
        } catch (Exception ex) {
            return;
        }

        //read from file
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\k0n03h5\\Desktop\\Test\\input-1.txt"));
            String s;
            while((s = br.readLine()) != null) {
                System.out.println(s); // write to console
            }
            br.close();
        } catch(Exception ex) {
            return;
        }
    }

    //
    // Private helper methods
    //

}
