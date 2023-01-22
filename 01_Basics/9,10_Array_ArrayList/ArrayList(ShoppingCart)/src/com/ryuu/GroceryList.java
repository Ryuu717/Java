package com.ryuu;

import java.util.ArrayList;


public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //1. Add
    public void addGroceryItem(String item) {

        groceryList.add(item);
    }

    //2. Get
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //3. Show
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //4. Update
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    //Overloading(Index)
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    //5. Remove
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }
    //Overloading(Index)
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    //6. Find
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }
}

//arrayList.get(0)
//arrayList.add("test")
//arrayList.set(0, "test")
//arrayList.remove(0)
//arrayList.clear()
//arrayList.indexOf()