/*
    Computer Name : String - 30
    Brand : String 20
    Manufacturing data  : Date
    isAvailable : Boolean
    Quantity : int
*/

package org.example.Bank;

import java.sql.Date;
import java.util.Scanner;

public class AssetRegistration {

    public static void main(String[] args) {
        try {
            do {
                assetManagemet();
            } while (true);
        } catch(Exception e) {
            System.out.println(e);
            System.exit(-1);
        }
    }

    private static void assetManagemet() {
        displayUIAndChoice();
        takingInput();

    }

    private static void takingInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Computer Name :::  ");

        String computerName = sc.nextLine();
        System.out.println("Enter brand :::  ");

        String brandName = sc.nextLine();
        System.out.println("Enter Manufacturing date :::  ");

        System.out.println("Enter is Available :::  ");
        boolean isAvailable = sc.nextBoolean();

        System.out.println("Enter quantity :::  ");
        int quality = sc.nextInt();

        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);

        System.out.println(date);

    }

    private static void displayUIAndChoice() {
        System.out.println("%%%%%%%%% Welcome to Asset Management System by MVDZO corp %%%%%%%%");
        System.out.println("Press N for exit");
        System.out.println("press Y to continue");
        System.out.println("Your Choice ::: ");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);

        if (choice == 'N' || choice == 'n') {
            System.exit(0);
        }
    }
}
