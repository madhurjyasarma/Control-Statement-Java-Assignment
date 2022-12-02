package org.example;

import java.util.Scanner;

public class Java_assignment_01 {

    /*
    For 10 oranges we have to pay Rs.45 what will be the price of 1 orange.
    You can set the status of your assignment here.
    * */
    public static void qsn_1() {
        float numberOfOrange = 10;
        float totalPrice = 45;
        float oneOrangePrice = (totalPrice / numberOfOrange);
        System.out.println(String.format("Price of one orange is : %.2f",oneOrangePrice));
    }
    /*
    Ramu visited the bookstore to buy books for his kid. He bought notebooks for Rs.100 and
    magic pot for Rs.50. How much money did Ramu spend in the bookstore?
    */
    public static void qsn_2() {
        short notebook = 100;
        short magicPot = 50;
        System.out.println("Ramu bought : " + (int)(notebook + magicPot));
    }

    /*
    Read two numbers, divide the first number by the second and print the quotient and remainder.
    You can set the status of your assignment here.
    * */

    public static void qsn3_divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number : ");
        int secondNum = sc.nextInt();

        int result = firstNum / secondNum;
        int mod = firstNum % secondNum;
        sc.close();

        System.out.println("First number divided by second number is : " + result);
        System.out.println("Remainder is " + mod);

    }

    /*
    The distance between two cities (KM) is input through the keyboard.
    Write a program to convert and print this distance in meters, feet, inches and centimeters.
    */

    public static void qsn4_DistanceConverter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input distance in Kilometers : ");
        float km = sc.nextFloat();
        sc.close();
        System.out.println("Kilometer to meter : " + (km * 1000) + " meters");
        System.out.println("Kilometer to feet : " + (km * 3280.8399) + " feets");
        System.out.println("Kilometer to inche : " + (km * 39370.1) + " inches");
        System.out.println("Kilometer to inche : " + (km * 100000) + " centimeters");
    }
    /*
    The temperature of a city in Fahrenheit is given. Write a program to convert it into Celsius.
    You can set the status of your assignment here.
    */

    public static void qsn5_tempConverter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in celcious : ");
        float temp = sc.nextFloat();
        System.out.println(temp+" in Fahrenheit is : " + temp * 1.8 + 32);
        sc.close();
    }

    /*
        Two numbers are stored in locations i and j. Write a program to interchange the numbers.
    */
    public static void qsn6_swapValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value : ");
        int firstValue = sc.nextInt();
        System.out.println("Enter second value : ");
        int secondValue = sc.nextInt();

        // Swaping
        int temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;

        System.out.println("Now first value is " + firstValue + " and second value is " + secondValue);
    }

    /*
    Raju’s basic salary is given.
    His dearness allowance is 40% of the basic salary and house rent allowance is 20%.
    Calculate his total salary.
    */

    public static void qsn7_salary() {
        System.out.println("Enter salary below : ");
        Scanner sc = new Scanner(System.in);

        double basicSalary = sc.nextInt();
        double rent = 0.2 * basicSalary;
        double dearness_allowance = 0.4 * basicSalary;
        double totalsalary = basicSalary + rent + dearness_allowance;

        sc.close();
        System.out.println(String.format("Total salary is %.2f per month", totalsalary ));
    }

    /*
    implement a logic to swap two numbers without using a temporary variable.
    (Asked in Nissan interview)
    */
    public static void qsn8_swapValuesWithoutExtraVar() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first and second values below : ");
         int firstVar = sc.nextInt();
         int secondVar = sc.nextInt();
        System.out.println("before swapping first variable : " + firstVar + " and Second variable " + secondVar);

         // Swapping logic
        firstVar = firstVar * secondVar;
        secondVar = firstVar / secondVar;
        firstVar = firstVar / secondVar;

        System.out.println("After swapping first variable : " + firstVar + " and Second variable " + secondVar);
    }

    /*
    If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits.
    */

    public static void qsn9_sumOfDigits() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Digit : ");
        int num = sc.nextInt();
        long sum = 0;

        while(num > 0) {

            sum += (num % 10);
            num = (num / 10);

        }
        System.out.println();
        System.out.println("The sum of digits is :" + sum);
        sc.close();

    }

    /*
     If a five-digit number is given, write a program to reverse the number.
    */
    public static void qsn10_revNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        long num = sc.nextInt();
        long sum = 0;

        while(num > 0) {

            sum = (sum * 10) + (num % 10);
            num = (num / 10);

        }
        System.out.println();
        System.out.println("The reverse of digits is :" + sum);
    }

    // Driver method
    public static void main(String[] args) {
        qsn_1();
        qsn_2();
        qsn3_divide();
        qsn4_DistanceConverter();
        qsn5_tempConverter();
        qsn6_swapValues();
        qsn7_salary();
        qsn8_swapValuesWithoutExtraVar();
        qsn9_sumOfDigits();
        qsn10_revNum();

    }
}


