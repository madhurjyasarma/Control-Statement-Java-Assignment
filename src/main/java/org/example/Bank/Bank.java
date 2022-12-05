package org.example.Bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank {

    private static String[] customerNames;

    // Step 1: Hit input from the user
    public static void getInputFromUser() {



        // Declare variables
        Scanner scanner = new Scanner(System.in);



        // Storing data : array -->name and balance
        String[] customerName = new String[5];
        double[] accountBalances = new double[5];
        Date arrDob[]=new Date[5];



        // menu driven
        char choice = 'n';
        int i=0;



        try {
            do {
                System.out.print("Enter customer name : ");
                // String temp=scanner.nextLine();
                
                // set validation
                String temp = setValidCustomerName(scanner.nextLine());

//                System.out.println(temp);

                // check name for duplicate
                if (checkCustomerNameExists(temp,customerName)) {
                    System.out.println("Customer exists in put database. Try a different name.");
                    continue;
                } else {
                    customerNames[i] = temp;
                    i++;
                }
                System.out.println("Enter balance");
                int temp2=setValidCustomerBalance(scanner.nextLine());
                System.out.println(temp2);

            } while (choice == 'y' || choice == 'Y');
        } catch (Exception e) {
            System.out.println("Invalid process...");
        }
    }

    private static boolean checkCustomerNameExists(String temp, String[] customerNames) {

        for (String customerName : customerNames) {
            if (temp.equals(customerName)) {
                return true;
            }
        }

        return false;
    }


    // Step 2: Proper Validation for Name -> Regular Expression Balance



    private static int setValidCustomerBalance(String balance) {
        // TODO Auto-generated method stub
        try{
            BufferedReader brRead=new BufferedReader(new InputStreamReader(System.in));

            Pattern pattern=Pattern.compile("[^0-9]");


            Matcher matcher=pattern.matcher(balance);
            boolean finder=matcher.find();

            if(finder){
                System.out.println("balance should contain only numbers");
            }else if(balance.length()==0){
                System.out.println("Maintain minimum 1000 else you will get penalty");

            }else if(balance.length()>0){
                System.out.println("balance is :");

            }

            return Integer.parseInt(balance);

        }catch(Exception e){
            System.out.println("Enter valid balance");
        }
        return Integer.parseInt(balance);
    }



    private static String setValidCustomerName(String customerName) {

        try{
            // creating object for bufferedReader
//            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader brRead = new BufferedReader(new InputStreamReader(System.in));

            //creating pattern using regular expression
            Pattern pattern= Pattern.compile("[^A-za-z ]");
            do{

                // Match
                Matcher matcher=pattern.matcher(customerName);
//                System.out.println(matcher);
                boolean finder=matcher.find();
                System.out.println(finder);
                if(finder){
                    System.out.println("Name must contain only Aplhabets. Enter again: ");
                }else if(customerName.length()<3){
                    System.out.println("Name should contain 3 characters.Enter again : ");
                }else if(customerName.length()>30){
                    System.out.println("Name contains more than 30 characters"
                            + "Re-enter agin");
                    customerName=brRead.readLine();
                }else{
                    break;
                }
            }while(true);

            return customerName;
        }catch(Exception e){
            System.out.println("Invalid entry in customer name...");
        }

        return customerName;
        // Step 3: Check duplicate customer name
        // Re-Enter customer name if exists
        // Step 4: Display output in tabular format
        // step 5: check name for duplicates
        
    }



    public static void main(String[] args) {
        getInputFromUser();
    }
}
