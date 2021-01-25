package com.company;

import java.util.Scanner;

public class Main {
/*
A simple console application that allows you to view customers,
add customers to the application, display sports activities
and search for customers by phone number.
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerDatabase customerDataBase = new CustomerDatabase();
        boolean shouldContinue = true;

        //Below displays Menu Options.
        // While True loop is used to display menu functions.
        while (shouldContinue) {

            System.out.println(" CHOOSE MENU OPTION : ");
            System.out.println(" 1. Show customer");
            System.out.println(" 2. Add customer");
            System.out.println(" 3. Show sports activity");
            System.out.println(" 4. Find customer by phone number");
            System.out.println(" 5. Exit");

            /*
            Depending on what the user chooses,
            we will execute the appropriate command.
            For this we use the switch statement
             */
            int choseOption = scanner.nextInt();
            switch (choseOption) {
                case 1:
                    customerDataBase.showCustomer();
                    break;
                case 2:
                    customerDataBase.addCustomer();
                    break;
                case 3:
                    customerDataBase.showActivities();
                    break;
                case 4:
                    customerDataBase.ShowCustomerByPhoneNumber();
                    break;
                case 5:
                    shouldContinue = false;
                    // break;

            }

        }


    }


}

