package org.example.Assignment_ControlStruc;

import java.util.Scanner;

public class Qsn6 {
    public static void main(String[] args) {
        // For Exception Handling
        try {
            // for input Scanner object created
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number :::  ");
            int rows = sc.nextInt();
            printStares(rows);
        } catch (Exception e) {
            System.out.println("Invalid Entry!!!!");
            System.out.println(e);
        }
    }


    private static void printStares(int rows) {
        // Outer loop
        for (int i=rows - 1; i>=0; i--) {
            // Inner Loop
            for (int j=0; j<=i; j++) {
                // Printing the pattern
                System.out.print("." + " ");
            }
            // after inner loop new line
            System.out.println();
        }
    }
}
