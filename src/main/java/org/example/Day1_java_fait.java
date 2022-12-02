/*          FAITH INFO TECH - DAY 1


Java Plateform Edition:
-----------------------
1. Java SE - Standard edition (Core Java)
2. JavaEE - Enterprise Edition (Adv Java)
3. JavaME - Java Micro Edition (Smart pones, Smart card, all handheld devices)


Prerequisites to run java program:
---------------------------------
Step 1: JDk (install)
Step 2: IDE

See the version of java:
------------------------
Java -version
Java --version


* API - Application programming interface. It is a collection of related packages.
* Package - Collection of related classes and interface.
* java is the root package where it has subclasses.

In variable, we use camelCase or Hungarian Notation - (eg. Hungarian Notation - intCalculateSalary)

--package name : Three letters with dot separator
                    com.nissan.app ----- driver class ----- main ---- entrypoint
                    com.nissan.model/bean/entity

 There are Primitive data type and reference data type.
 2. reference data type -
    a. Class
    b. Interface

without static keyword methods are concrete methods.

Accepting value at run-time :
----------------------------
1. Scanner class -
    nextInt()
    nextDouble()
    nextLine()
    * we do not use typecast here

2. InputStreamReader
    - Buffered reader - readLine() - it read values in form of String
    Typecasting is required.
    ------------------------
    Integer.parseInt()
    Double.parseDouble()
    Boolean.parseBoolean()

    * we use typecast here

*/


package org.example;

import java.util.Scanner;

public class Day1_java_fait {
    public static double getArea(double radius) {
        return radius * radius * Math.PI;
    }
    public static double getCircumference(double radius) {
        return radius * 2 * Math.PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = sc.nextDouble();
        double area = getArea(radius);
        double circumference = getCircumference(radius);
        System.out.println(String.format("Area is : %.2f", area));
        System.out.println(String.format("circumference is : %.2f", circumference));
        sc.close();
    }


}
