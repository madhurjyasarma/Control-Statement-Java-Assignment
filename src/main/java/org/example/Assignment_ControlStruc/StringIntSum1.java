package org.example.Assignment_ControlStruc;

import java.util.Scanner;

public class StringIntSum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(Integer.parseInt(str));
        int totalSum = 0;

        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                // to be looked at
//                totalSum += Integer.parseInt(str.charAt(i));
            }
        }
    }
}
