package com.hust.kstn.models;

public class Store {
    public static final int MAX_ITEMS_IN_STORE = 100; 
    
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int itemCount = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (itemCount + 1 > MAX_ITEMS_IN_STORE) {
            System.out.println("The store is almost full. Cannot add the disc.");
        } else {
            itemsInStore[itemCount] = disc;
            itemCount++;
            System.out.println("The disc has been added to the store.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (itemCount == 0) {
            System.out.println("The store is empty. Cannot remove the disc.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (itemsInStore[i] == disc) {
                found = true;
                
                for (int j = i; j < itemCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemCount - 1] = null;
                itemCount--;
                System.out.println("The disc has been removed from the store.");
                break;
            }
        }

        if (found == false) {
            System.out.println("The disc does not exist in the store.");
        }
    }

    public void printStore() {
        System.out.println("======================= ITEMS IN STORE =======================");
        if (itemCount == 0) {
            System.out.println("The store is empty.");
            System.out.println("================================================================");
            return;
        } else {
            System.out.println("Total items: " + itemCount);
            for (int i = 0; i < itemCount; i++) {
                System.out.println(itemsInStore[i].toString());
            }
        }
        System.out.println("================================================================");
    }
}