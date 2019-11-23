package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private Branch branch;
    private static Scanner scanner = new Scanner(System.in);
    ArrayList<Branch> branches = new ArrayList<>();

    public void operation(){
        System.out.println("\nWelcome bank system");
        System.out.println("\t1 - show branches");
        System.out.println("\t2 - add new branches");
        System.out.println("\t3 - add customer");
        System.out.println("\t4 - show customer");
        System.out.println("\t5 - close system");

        boolean enterQuit = false;
        int choice;
        while (true){
            System.out.print("\nSelect choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    showBranches();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    showCustomer();
                    break;
                case 5:
                    enterQuit = true;
                    break;
            }

            if (enterQuit){
                break;
            }
        }
    }

    public void addBranch(){
        System.out.print("Enter branch to add: ");
        String branchName = scanner.nextLine();
        branches.add(new Branch(branchName));
        System.out.println("Branch " + branchName + " created.");
    }

    public void showBranches(){
        for (int i = 0; i < branches.size(); i++){
            System.out.println((i+1)+ ". " + branches.get(i).getName());
        }
    }

    public void addCustomer(){
        boolean founded = false;
        System.out.print("Select branch where you can add Customer: ");
        String branchName = scanner.nextLine();
        int size = branches.size();
        for (int i = 0; i < size; i++){
            if (branchName.equals(branches.get(i).getName())){
                branch = branches.get(i);
                branch.addCustomer();
                founded = true;
            }
        }
        if (!founded){
            System.out.println("Branch not found.");
        }
    }

    public void showCustomer(){
        boolean founded = false;
        System.out.print("Select branch where you can show Customers: ");
        String branchName = scanner.nextLine();
        for (int i = 0; i < branches.size(); i++){
            if (branchName.equals(branches.get(i).getName())){
                branch = branches.get(i);
                branch.showCustomer();
                founded = true;
            }
        }

        if (!founded){
            System.out.println("Branch not found.");
        }
    }
}
