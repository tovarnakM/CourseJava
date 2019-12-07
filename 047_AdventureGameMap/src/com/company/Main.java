package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locations = new HashMap<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W",2);
        tempExit.put("E",3);
        tempExit.put("S",4);
        tempExit.put("N",5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("N",5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("W",1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("N",1);
        tempExit.put("W",2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));


        tempExit = new HashMap<>();
        tempExit.put("S",1);
        tempExit.put("W",2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));


        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
            if (loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are");
            for (String exit : exits.keySet()){
                System.out.print(exit + ", ");
            }
            System.out.println();

            String input = scanner.nextLine().toUpperCase();
            String direction = input;
            if (input.length() > 1) {
                direction = getDirection(input);
            }

            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            } else {
                System.out.println("You can not go to that direction");
            }
        }
    }

    public static String getDirection(String input){
        String direction = "X";
        input = input.toUpperCase();
        String[] array = input.split(" ");
        if (array.length == 1){
            return String.valueOf(array[0].charAt(0)).toUpperCase();
        }
        for (int i = 0; i < array.length; i++){
            if (array[i].equals("SOUTH")){
                direction = "S";
            }else if (array[i].equals("WEST")){
                direction = "W";
            }else if (array[i].equals("EAST")){
                direction = "E";
            }else if (array[i].equals("NORTH")){
                direction = "N";
            }
        }
        System.out.println(direction);

        return direction;
    }
}
