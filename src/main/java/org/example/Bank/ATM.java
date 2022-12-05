///*
//CRM Bank Application
//--------------------------------
//   -name        - 30, only A-Z a-z
//   -balance     - 8 only numeric
//   -duplicate customer name is not possible
//   -atm process -
//
//Development Steps
//--------------------------------
//Step 1 : Get input from the user
//Step 2 : Proper validation for name -> regular expressions
//Step 3 : Check duplicate customer name
//         Re-enter customer name if exists
//Step 4 : Display output in tabular format
//*/
//
//package org.example.Bank;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class ATM {
//
//    public static void getInputFromUser() {
//        Scanner scanner = new Scanner(System.in);
//
//        // Storing data : array ----> name and balance
//        String[] customers = new String[5];
//        double[] balance = new double[5];
//
//        // menu driven
//        char choice = 'n';
//        try {
//
//            do {
//                System.out.println("Enter customer name :::  ");
//                String temp = setValidCustomerName(scanner.nextLine());
//                System.out.println("Enter balance :::  ");
//                int customerBalance = setBalance(scanner.nextInt());
////                System.out.println(temp);
//            } while (choice == 'y');
//
//        } catch (Exception e) {
//            System.out.println("Invalid input!");
//            System.out.println("Error " + e);
//
//        }
//    }
//
//    private static int setBalance(int customerBalance) {
//        // regular expression for validation
//        try {
//
//            // // creating object for bufferedReader
////            InputStreamReader isr = new InputStreamReader(System.in);
////            BufferedReader bufferedReader = new BufferedReader(isr);
//
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            // creating pattern using regex
//            Pattern pattern = Pattern.compile("[^0-9]");
//            do {
//
//                // if it matches
//                Matcher matcher = pattern.matcher(customerBalance);
//                boolean finder = matcher.find();
//                System.out.println(finder);
//
//                if (finder) {
//                    System.out.println("Name must contains only Alphabets. Enter a valid name.");
//                    customerBalance = Integer.parseInt(bufferedReader.readLine());
//                } else if(customerBalance < 0) {
//                    // name size less than 3. read again
//                    System.out.println("name should contain minimum 3 characters. Enter again ::: ");
//                    customerBalance = Integer.parseInt(bufferedReader.readLine());
//                }
//                else {
//                    break;
//                }
//
//            } while (true);
//            return customerBalance;
//
//        } catch (Exception e) {
//            System.out.println("Invalid entry in customer Balance...!");
//        }
//
//        return customerBalance;
//    }
//
//    private static String setValidCustomerName(String customerName) {
//
//        // regular expression for validation
//        try {
//
//           // // creating object for bufferedReader
////            InputStreamReader isr = new InputStreamReader(System.in);
////            BufferedReader bufferedReader = new BufferedReader(isr);
//
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//            // creating pattern using regex
//            Pattern pattern = Pattern.compile("[^A-Za-z ]");
//            do {
//
//                // if it matches
//                Matcher matcher = pattern.matcher(customerName);
//                boolean finder = matcher.find();
//                System.out.println(finder);
//
//                if (finder) {
//                    System.out.println("Name must contains only Alphabets. Enter a valid name.");
//                    customerName = bufferedReader.readLine();
//                } else if(customerName.length() < 3) {
//                    // name size less than 3. read again
//                    System.out.println("name should contain minimum 3 characters. Enter again ::: ");
//                    customerName = bufferedReader.readLine();
//                } else if(customerName.length() > 30) {
//                    // name size less than 3. read again
//                    System.out.println("name should contain maximum 29 characters. Enter again ::: ");
//                    customerName = bufferedReader.readLine();
//                } else {
//                    break;
//                }
//
//            } while (true);
//            return customerName;
//
//        } catch (Exception e) {
//            System.out.println("Invalid entry in customer name...!");
//        }
//
//        return customerName;
//    }
//
//    // Driver method
//    public static void main(String[] args) {
//        getInputFromUser();
//    }
//}
