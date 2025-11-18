package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);

        System.out.println("--- Adding DVD 1, 2, 3 ---");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.printStore();

        System.out.println("--- Removing DVD 2 ---");
        store.removeDVD(dvd2);
        store.printStore();

        System.out.println("--- Removing DVD 2 again (not in store) ---");
        store.removeDVD(dvd2);
        store.printStore();
        
        System.out.println("--- Removing remaining DVDs ---");
        store.removeDVD(dvd1);
        store.removeDVD(dvd3);
        store.printStore();

        System.out.println("--- Attempting to remove from empty store ---");
        store.removeDVD(dvd1);
        store.printStore();
    }
}