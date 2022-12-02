package org.example.Assignment_ControlStruc;

import java.util.Scanner;

public class qsn11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int trainId = 101;
        int pnr = 9999, inputPnr = 0;
        String trainName = "Rajdhani";
        String passengerName = "MVDZO";

        try {
            System.out.println("Enter PNR no ::: ");
//            inputPnr = scanner.nextInt();
            inputPnr = Integer.parseInt(scanner.nextLine());
            // check condition

            if (inputPnr == pnr) {
                System.out.println("Seat Confirmed!!!");
            } else {
                System.out.println("Seat not confirmed!!!");
            }
            
            scanner.close();

        } catch (Exception e) {
            System.out.println("Invalid entry!!!");
        }

    }
}
