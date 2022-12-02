package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    int reg_num;
    String name;
    String dob;
    String gender;
    String add;

    public Patient(int reg_num, String name, String dob, String gender, String add) {
        this.reg_num = reg_num;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "reg_num=" + reg_num +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> list = new ArrayList<>();
        System.out.println("********** Patient Management System *****************");
        while (true) {

            System.out.println("Press below options (1), (2) or (3)::: ");
            System.out.println("1. add a new patient");
            System.out.println("2. Listing of all the available patient");
            System.out.println("3. Exit");

            int input = sc.nextInt();
            if (input == 3) {
                System.out.println("Exited");
                System.exit(1);
            }

            if (input == 1) {
                System.out.println("Please type reg_num, name, dob, gender, address of the patient");
                System.out.print("Enter registration number::: ");
                int reg_num = sc.nextInt();
                System.out.print("Enter name::: ");
                String name = sc.next();
                System.out.print("Enter date of birth::: ");
                String dob = sc.next();
                System.out.print("Enter Gender::: ");
                String gender = sc.next();
                System.out.print("Enter Address::: ");
                String add = sc.next();

                Patient p = new Patient(reg_num,name,dob,gender,add);
                list.add(p);
                System.out.println("Patient added successfully!!!");
                System.out.println();
                System.out.println();
                System.out.println();

            }

            if (input == 2) {
                System.out.println(list.toString());
            }
        }




    }
}