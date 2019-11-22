package com.company;


import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList  = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in the grocery list.");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ", " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            groceryList.set(position,newItem);
            System.out.println("Grocery item " + (position+1) + " has been modified.");
        }
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            groceryList.remove(position);
        }
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}







