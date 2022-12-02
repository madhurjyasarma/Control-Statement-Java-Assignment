// Assignment - 01
package org.example.Assignment_ControlStruc;

import java.util.Scanner;

public class Qsn1_ElectricSoftwere {
    /*
    Consider an electricity billing calculation. There are two types of customers.
    Domestic and Industry. If it is domestic, the slabs are like this,
    The reading in the range,0-100 then amt=
        units* Rs.1
        100-200amt=units*1.5
        200-500amt=units*2
        >500amt = units*5
    If it is industrial, the amt =units*10.
    */

    public static void electricMeter() {


        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("%%%%%%%%%% Assam Power Distribution Ltd. %%%%%%%%%%%");
        boolean flag = false;

        while (!flag) {
            System.out.println("Enter (1) For domestic, (2) for Industry, (3) For Exit : ");
            System.out.print("Enter Your choice ::: ");
            int choice = sc.nextInt();

            if (choice != 1 || choice !=2 || choice != 3) {
                System.out.println("Please enter a valid choice");
            }

            if (choice == 3) {
                System.out.println("Thanks for using our services. :)");
                flag = true;
            }

            // Domestic
            if ( choice == 1) {
                System.out.print("Enter Unit ::: ");
                int unit = sc.nextInt();
                if (unit != 1 || unit !=2 || unit != 3) {
                    System.out.println("Please enter a valid choice");
                }
                if (unit < 0) {
                    System.out.println("Unit can't be less then zero.");
                }

                if (unit >=0 && unit <100) {
                    System.out.println("Price ::: " + unit * 1 + " Rupees");
                }
                else if (unit >= 100 && unit < 200) {
                    System.out.println("Price ::: " + unit * 1.5 + " Rupees");
                }
                else if (unit >= 200 && unit < 500) {
                    System.out.println("Price ::: " + unit * 2 + " Rupees");
                }
                else {
                    System.out.println("Price ::: " + unit * 5 + " Rupees");
                }
            }

            if (choice == 2) {
                System.out.print("Enter unit ::: ");
                int unit = sc.nextInt();

                if (unit <0 ) {
                    System.out.println("Unit can't be less then zero");
                }
                if (unit >= 0) {
                    System.out.println("Price ::: " + unit * 10 + " Rupees");
                }
            }

        }

    }

    public static void main(String[] args) {
        try {
            electricMeter();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
