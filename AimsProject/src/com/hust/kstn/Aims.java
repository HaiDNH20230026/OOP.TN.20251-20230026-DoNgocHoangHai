package com.hust.kstn;
import java.util.*;

import com.hust.kstn.models.*;


public class Aims {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        
        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.print();
        System.out.printf("Total cost of current cart: %.2f $%n", cart.calculateTotalCost());

        cart.removeDVD(dvd2);
        cart.print();
        System.out.printf("Total cost of current cart: %.2f $%n", cart.calculateTotalCost());

    }
}