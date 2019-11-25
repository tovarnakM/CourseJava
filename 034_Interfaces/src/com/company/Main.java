package com.company;


import com.sun.jdi.VMOutOfMemoryException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*ITelephone markusPhone;
        markusPhone = new DeskPhone(123456);
        markusPhone.powerOn();
        markusPhone.callPhone(123456);
        markusPhone.answer();

        markusPhone = new MobilePhone(24567);
        markusPhone.powerOn();
        markusPhone.callPhone(24567);
        markusPhone.answer();*/

        Player markus = new Player("Markus",10,15);
        System.out.println(markus.toString());
        saveObject(markus);

        markus.setHitsPoint(8);
        System.out.println(markus);
        markus.setWeapon("StormBringer");
        saveObject(markus);
        //loadObject(markus);
        System.out.println(markus);

        ISaveable monster = new Monster("Monster",20,40);
        System.out.println(((Monster) monster).getStrength());
        System.out.println(monster);
        saveObject(monster);
    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
