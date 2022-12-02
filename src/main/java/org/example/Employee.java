package org.example;

import java.util.Random;
import java.util.Scanner;

public class Employee {

    private static void inputFromUser() {
        String name = "";
        char gender = 'm';
        boolean isMarried = false;
        byte noOfChildren = 0;
        short yearOfBirth =  1997;
        int salary = 0;
        long netAsset = 0L;
        double weight = 69D;
        float gpa = 9.9F;
        final String COMPANY_ID = "Nissan";

        // To get input for numeric and String, we have to use two separate scanner to do so.
        // because in scanner it recognized enter key as a character.

        // Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.nextLine();

        System.out.println("Enter Gender : ");
        gender = sc.nextLine().charAt(0);       // male ---> takes first letter i.r 'm'

        System.out.println("Enter marital status : ");
        isMarried = sc.nextBoolean();

        System.out.println("Enter Number of kids : ");
        noOfChildren = sc.nextByte();

        System.out.println("Enter year of birth : ");
        yearOfBirth = sc.nextShort();

        System.out.println("Enter salary : ");
        salary = sc.nextInt();

        System.out.println("Enter net asset : ");
        netAsset = sc.nextLong();

        System.out.println("Enter weight : ");
        weight = sc.nextDouble();

        System.out.println("Enter GPA : ");
        gpa = sc.nextFloat();

        sc.close();


        System.out.println("------------------------------------");
        System.out.println("    +++Employee Details+++    ");
        System.out.println("------------------------------------");

        System.out.println("Id no. is : " + generateIdNumber());
        System.out.println("Name is : " + name);
        System.out.println("Gender is : " + gender);
        System.out.println("Marital status is (true/false): " + isMarried);
        System.out.println("Number of children is : " + noOfChildren);
        System.out.println("birth year is : " + yearOfBirth);
        System.out.println("Salary is : " + salary);
        System.out.println("Net asset is : " + netAsset);
        System.out.println("Weight is : " + weight);

    }

    public static void main(String[] args) throws Exception {
        try{
            inputFromUser();
        } catch (Error err) {
            throw new Exception(err);
        }

    }
    // 1. get input from the user
    // 2. autogenerate id number
    // 3. run the app
    // 4. Automatic random number

    private static int generateIdNumber() {
        Random random = new Random();
        int idNumber = 100000 + random.nextInt(900000); // int random number generated from 100000 to 900000
        return idNumber;
    }
}
