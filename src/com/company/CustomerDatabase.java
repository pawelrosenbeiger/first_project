package com.company;

import java.util.*;

public class CustomerDatabase {
    /* This class defines menu features
    and includes implementing functionality.
    */
    // Class fields
    // ArrayList stores phone customers
    private List<Customer> customers = new ArrayList<>();
    //HashSet stores type of sports activity
    private Set<String> activities = new HashSet<>();
    // HashMap stores phone numbers
    private Map<Integer, Customer> phoneToCustomer = new HashMap<>();
    Scanner scanner = new Scanner(System.in);


    //this method of adding customers

    public void addCustomer() {
        System.out.println("Enter the customer's name");
        String name = scanner.nextLine();

        System.out.println("Enter the phone number");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the age");
        int age = Integer.valueOf(scanner.nextLine());

        System.out.println("Whether the person is an adult (YES/NO)");
        String isAdultString = scanner.nextLine();
        boolean isAdult;

        if (isAdultString.equals("YES")) {
            isAdult = true;
        } else {
            isAdult = false;
        }
        System.out.println("Enter the type of sports activity");
        String sportActivity = scanner.nextLine();

        //customer class object
        Customer customer = new Customer(name, phoneNumber, age, sportActivity, isAdult);

        activities.add(sportActivity);
        phoneToCustomer.put(phoneNumber, customer);
        customers.add(customer);
    }

    //This method of showing customers

    public void showCustomer() {
        for (Customer customer : customers) {
            //  method showing the customer from the class customer
            customer.showCustomerInformation();
            System.out.println();

        }


    }
    // Method of showing activities

    public void showActivities() {
        for (String activity : activities) {
            System.out.println(activity);
        }
    }

    // Method of showing customers by phone

    public void ShowCustomerByPhoneNumber() {
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Customer customer = phoneToCustomer.get(phoneNumber);
        customer.showCustomerInformation();
    }


}