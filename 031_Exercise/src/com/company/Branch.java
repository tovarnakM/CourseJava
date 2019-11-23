package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {

    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Customer> customers = new ArrayList<>();
    private String name;

    public void showCustomer(){
        for (int i = 0; i < customers.size(); i++){
            System.out.println((i+1)+ ". " + customers.get(i).getName());
            for (int j = 0; j < customers.get(i).getTransaction().size(); j++){
                System.out.println("\t" + (j+1) + "--> " + customers.get(i).getTransaction().get(j));
            }
        }
    }

    public void addCustomer(){
        System.out.print("Enter name of customer: ");
        String name = scanner.nextLine();
        System.out.print("Enter count of transactions: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Double> transactions = new ArrayList<>();
        for (int i = 0; i < count; i++){
            System.out.print("Enter " + (i + 1) + " . transactions: ");
            transactions.add(scanner.nextDouble());
            scanner.nextLine();
        }
        customers.add(new Customer(transactions,name));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
    }
}