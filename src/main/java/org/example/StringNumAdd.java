package org.example;

import java.util.Scanner;

public class StringNumAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        final int toGetFromAscii = 48;
        int totalSum = 0;

        System.out.println((int) inputStr.charAt(0) - toGetFromAscii);


        for (int i=0; i< inputStr.length(); i++)  {
            if ((int) inputStr.charAt(i) - toGetFromAscii >= 0) {
                totalSum += (int) inputStr.charAt(i) - toGetFromAscii;
            }
        }
        System.out.println(totalSum);

    }
}
