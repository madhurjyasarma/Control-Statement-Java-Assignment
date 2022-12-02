package org.example.Assignment_ControlStruc;

import java.util.Scanner;

public class Qsn9_TypeCast {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the real constant");
        float constant=scn.nextFloat();
        int integer=(int)constant;
        System.out.println(integer);
    }
}
