package com.hust.kstn.models;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsIncart = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered + 1 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full.");
        } else {
            itemsIncart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added successfully.");
        }
    }
    
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full.");
        } else {
            addDVD(disc1); 
            addDVD(disc2); 
        }
    }
    
    public void addDVD(DigitalVideoDisc[] discs) {
        if (qtyOrdered + discs.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            for (DigitalVideoDisc disc : discs) {
                addDVD(disc); 
            }
        }
    }
    
    public void addDVD(DigitalVideoDisc ...discs) {
        if (qtyOrdered + discs.length > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
        } else {
            for (DigitalVideoDisc disc : discs) {
                addDVD(disc); 
            }
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsIncart[i] == disc) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsIncart[j] = itemsIncart[j + 1];
                }
                itemsIncart[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed successfully.");
                break;
            }
        }
        if (found == false) System.out.println("The disc does not exist.");
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsIncart[i].getCost();
        }
        return totalCost;
    }

    public void print() {
        System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
        System.out.println("=== All items in cart ===");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println("[Title]: " + itemsIncart[i].getTitle() + ", [Cost]: " + itemsIncart[i].getCost());
        }
    }

}
