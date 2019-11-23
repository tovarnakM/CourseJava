package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contacts> contactList = new ArrayList<>();

    public void menu(){
        System.out.println("\nWelcome to contact menu");
        System.out.println("\t1 - show contacts");
        System.out.println("\t2 - create new contact");
        System.out.println("\t3 - modify existing contact");
        System.out.println("\t4 - remove contact ");
        System.out.println("\t5 - find contact by name");
        System.out.println("\t6 - close menu");

        boolean enterQuit = false;
        int choice;
        while (true){
            System.out.print("\nSelect choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    showContact();
                    break;
                case 2:
                    createNewContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    enterQuit = true;
                    break;
            }

            if (enterQuit){
                break;
            }
        }
    }

    public void showContact(){
        for (int i = 0; i < contactList.size(); i++){
            System.out.println((i+1) + ", " + contactList.get(i).getName() + " - " + contactList.get(i).getPhoneNumber());
        }
        if (contactList.size() == 0){
            System.out.println("Empty list");
        }
    }

    public void createNewContact(){
        boolean isCreated = false;
        System.out.print("Enter contact NAME: ");
        String name = scanner.nextLine();

        System.out.print("Enter contact phone: ");
        String phone = scanner.nextLine();

        validateNumber(phone);

        int size = contactList.size();
        for (int i = 0; i < size; i++) {
            if (contactList.get(i).getName().equals(name)) {
                System.out.println("Contact already exist");
                isCreated = true;
            }
        }

        if (!isCreated){
            Contacts contacts = new Contacts(name, phone);
            contactList.add(contacts);
            System.out.println("Contact with name " + contacts.getName() + " and number " + contacts.getPhoneNumber() + " created");
        }

        if (contactList.size() == 0){
            Contacts contacts = new Contacts(name, phone);
            contactList.add(contacts);
            System.out.println("Contact with name " + contacts.getName() + " and number " + contacts.getPhoneNumber() + " created");
        }
    }

    public void modifyContact(){
        boolean exist = false;
        System.out.println("Enter what can you modify: ");
        System.out.println("If name, enter 1");
        System.out.println("If number, enter 2");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            System.out.print("Enter name to modify: ");
            String name = scanner.nextLine();
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            for (int i = 0; i < contactList.size(); i++){
                if (contactList.get(i).getName().equals(name)){
                    for (int j = 0; j < contactList.size(); j++){
                        if(contactList.get(j).getName().equals(newName)) {
                            exist = true;
                        }
                    }
                    if (!exist) {
                        contactList.get(i).setName(newName);
                    }
                }
            }
            if (!exist){
                System.out.println("Contact modified.");
            }else {
                System.out.println("Name already exist");
            }
        }

        if (choice == 2){
            System.out.print("Enter number to modify: ");
            String number = scanner.nextLine();
            System.out.print("Enter new number: ");
            String newNumber = scanner.nextLine();
            validateNumber(newNumber);
            for (int i = 0; i < contactList.size(); i++){
                if (contactList.get(i).getPhoneNumber().equals(number)){
                    contactList.get(i).setPhoneNumber(newNumber);
                }
            }
            System.out.println("Contact modified.");
        }
    }

    public void findContact(){
        System.out.print("Enter the name for searching: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getName().equals(name)){
                System.out.print("Contact founded: " + name + " " + contactList.get(i).getPhoneNumber());
                System.out.println();
                found = true;
            }
        }
        if (!found){
            System.out.println("Can not find contact.");
        }
    }

    public void removeContact(){
        System.out.print("Enter contact for remove: ");
        String name = scanner.nextLine();
        boolean isContact = false;
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getName().equals(name)){
                isContact = true;
                contactList.remove(i);
                System.out.println("Contact " + name + " deleted.");
            }
        }
        if (!isContact){
            System.out.println("Can not find contact to delete");
        }
    }

    private void validateNumber(String phone){
        while (true) {
            try {
                int phoneToNumber = Integer.parseInt(phone);
                if (phone.length() == 10 && phone.charAt(0) == '0'){
                    break;
                }
            }catch (NumberFormatException exception){

            }
            System.out.println("Invalid contact phone number");
            System.out.print("Enter correct contact phone: ");
            phone = scanner.nextLine();
        }
    }
}
