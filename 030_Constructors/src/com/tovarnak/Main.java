package com.tovarnak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //
        //      EXERCISE
        //
        // Create a new class for the bank account
        // Create fields for the account number, balance, customer name, email and phone number
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment a balance field)
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field, but not allow
        //    withdraw to complete if their are insufficient funds
        // You will want to create various code in the Main class (the one created by IntelliJ ) to confirm your code is working
        // Add some System.out.println´s in the two methods above as well

        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Martin Tovarnak");
        bankAccount.setAcBalance(1000);
        bankAccount.setEmail("tovarnakM@gmail.com");
        bankAccount.setPhoneNumber("0918 857 890");
        bankAccount.setAcNumber("SK0254518481988");

        System.out.println("Name: " + bankAccount.getCustomerName());
        System.out.println("Email: " + bankAccount.getEmail());
        System.out.println("Account number: " + bankAccount.getAcNumber());
        System.out.println("Phone: " + bankAccount.getPhoneNumber());
        System.out.println("Balance: " + bankAccount.getAcBalance() + "eur");

        breaking:
        while (true) {

            System.out.println("Choose for deposit (1) or withdraw (2)");
            Scanner in = new Scanner(System.in);
            int choose = in.nextInt();
            in.nextLine();

            switch (choose) {
                case 1:
                    System.out.println("Enter deposit: ");
                    double deposit = in.nextDouble();
                    bankAccount.depositFunds(deposit);
                    break breaking;
                case 2:
                    System.out.println("Enter withdraw: ");
                    double withdraw = in.nextDouble();
                    bankAccount.withdrawFunds(withdraw);
                    break breaking;
                default:
                    System.out.println("Try again");
                    break;
            }
        }
    }
}
