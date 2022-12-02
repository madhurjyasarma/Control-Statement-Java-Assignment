package org.example.Assignment_ControlStruc;

import java.util.Scanner;

public class Qsn2 {
    public static void main(String[] args) {

        // Scanner object created
        Scanner scn = new Scanner(System.in);


        while(true){
            System.out.println("Enter your ATM Pin :");
            long gn = scn.nextLong();

            if(gn > 9999) {
                System.out.println("Type only 4 digit pin");
                continue;
            }

            Secret_number(gn);
        }

    }
    public static void Secret_number(long gn) {


        long sno = 7587;

        if(gn == sno) {
            System.out.println("Correct pin");
        }else {
            System.out.println("Incorrect pin");
        }



    }
}
