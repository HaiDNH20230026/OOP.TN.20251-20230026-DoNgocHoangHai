package com.hust.kstn.test;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);

        System.out.println("--- Adding DVD 1 ---");
        cart.addDVD(dvd1);
        cart.print();

        System.out.println("--- Adding DVD 2 and 3 ---");
        cart.addDVD(dvd2, dvd3);
        cart.print();

        System.out.println("--- Removing DVD 2 ---");
        cart.removeDVD(dvd2);
        cart.print();
        
        System.out.println("--- Removing DVD not in cart ---");
        cart.removeDVD(dvd2);
        cart.print();

        System.out.println("--- Removing items until empty ---");
        cart.removeDVD(dvd1);
        cart.removeDVD(dvd3);
        cart.print(); 
        System.out.println("--- Remove from empty cart ---");
        cart.removeDVD(dvd1);
        cart.print();
 
        System.out.println("--- Testing cart limit ---");
        for (int i = 0; i < 5; i++) {
            DigitalVideoDisc[] batch = {
                new DigitalVideoDisc("DVD " + (i*4+1), "Cat", "Dir", 120, 10.0),
                new DigitalVideoDisc("DVD " + (i*4+2), "Cat", "Dir", 120, 10.0),
                new DigitalVideoDisc("DVD " + (i*4+3), "Cat", "Dir", 120, 10.0),
                new DigitalVideoDisc("DVD " + (i*4+4), "Cat", "Dir", 120, 10.0)
            };
            System.out.println("Adding batch " + (i+1));
            cart.addDVD(batch);
        }
        
        cart.print();

        System.out.println("--- Attempting to add one more DVD ---");
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("The 21st DVD", "Test", "Tester", 60, 1.0);
        cart.addDVD(dvd21);
        cart.print();
    }
}