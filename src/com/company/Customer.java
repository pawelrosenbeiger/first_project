package com.company;

public class Customer {

   /* This class defines
      the characteristics of the client
    */

    // Class Fields
    private String name;
    private int phoneNumber;
    private int age;
    private String sportActivity;
    private boolean isAdult;

// constructor
    public Customer(String name, int phoneNumber, int age, String sportActivity,  boolean isAdult) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.isAdult = isAdult;
        this.sportActivity = sportActivity;



    }

    // getters return the given value

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getSportActivity() {
        return sportActivity;
    }


    public boolean isAdult() {
        return isAdult;
    }


    // method of display customers information

    public void showCustomerInformation() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age: " + age);
        String isAdultString = isAdult ? "YES" : "NO";
        System.out.println("Is Adult: " + isAdultString);
        System.out.println("Sports activity: " + sportActivity);




    }
}
