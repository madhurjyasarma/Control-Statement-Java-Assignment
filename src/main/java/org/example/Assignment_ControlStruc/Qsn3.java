package org.example.Assignment_ControlStruc;

import java.util.Scanner;

public class Qsn3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter Month Number between 1 and 12 (inclusive) :");

            int month = scan.nextInt();


            if(month < 1 || month > 12) {
                System.out.println("!! Enter valid number !!");
                continue;
            }

            if(month < 3 || month == 12) {
                System.out.println("Winter season");
            } else if (month >= 3 && month <= 5) {
                System.out.println("Spring season");
            } else if (month >= 6 && month <= 8) {
                System.out.println("Summer season");
            } else if (month >= 9 && month <= 11) {
                System.out.println("Autumn season");
            }
        }
    }
}
