package org.example.Assignment_ControlStruc;

import java.util.Scanner;

public class Qsn4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Month Number between 1 and 12 (inclusive) :");

            int month = scan.nextInt();

            if(month < 1 || month > 12) {
                System.out.println("!! Enter valid number !!");
                continue;
            }

            switch (month) {
                case 1:
                    System.out.println("Winter season");
                    break;
                case 2:
                    System.out.println("Winter season");
                    break;
                case 3:
                    System.out.println("Spring season");
                    break;
                case 4:
                    System.out.println("Spring season");
                    break;
                case 5:
                    System.out.println("Spring season");
                    break;
                case 6:
                    System.out.println("Summer season");
                    break;
                case 7:
                    System.out.println("Summer season");
                    break;
                case 8:
                    System.out.println("Summer season");
                    break;
                case 9:
                    System.out.println("Autumn season");
                    break;
                case 10:
                    System.out.println("Autumn season");
                    break;
                case 11:
                    System.out.println("Autumn season");
                    break;
                case 12:
                    System.out.println("Winter season");
                    break;
                default:
                    System.out.println("End of year");
            }

        }

    }
}
