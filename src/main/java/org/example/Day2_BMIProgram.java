package org.example;

import java.util.Scanner;

public class Day2_BMIProgram {

    private static double bodyMassIndex(double pounds, double inches) {
        final double KILOGRAMS_PER_POUND = 0.45359273;
        final double METERS_PER_INCH = 0.0254;

        // convert to KG
        double kilograms = pounds * KILOGRAMS_PER_POUND;
        double meters = inches * METERS_PER_INCH;

        return kilograms / (meters * meters);
    }

    private static void feedback(double bmi) {
        System.out.println("Feedback : ");

        if (bmi < 18.5) {
            System.out.println("You are thin like air. air will blow you, watch out.");
        }
        else if (bmi > 18.5 && bmi >=24.9) {
            System.out.println("Waw!!! you are normal. Are you a running for a beauty pageant?");
        }
        else if (bmi > 25 && bmi <29.9) {
            System.out.println("You are fat.");
        }
        else {
            System.out.println("No way. Fattest person ever...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        double weight = sc.nextDouble();
        System.out.println("Enter height in inches : ");
        double height = sc.nextDouble();
        double bmi = bodyMassIndex(weight,height);
//        System.out.println("Your BMI is : " + bmi);
        System.out.printf("BMI is : %.3f%n", bmi);
        feedback(bmi);

    }
}
/*
* bmi < 18.5            --------> underweight
* > 18.5 AND <= 24.9      --------> Normal
* >25 AND <29.9         ---------> overweight
* > 29.9                -----------> obese
* */