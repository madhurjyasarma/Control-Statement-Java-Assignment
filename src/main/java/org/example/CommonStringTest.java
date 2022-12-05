package org.example;

import java.util.Scanner;

public class CommonStringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string :::  ");
        String inputString = scanner.nextLine();


        // instantiation
        Day3_Java_CommonString commonUtil = null;

        //call method and show the result
        System.out.println("The given string is : " + inputString);
        System.out.println("The longest substring in the string is : " + commonUtil.atBothEnd(inputString));
    }
}
