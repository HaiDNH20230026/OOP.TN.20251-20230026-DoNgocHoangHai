package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.*;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Joshua Bloch", 1961, "American software engineer");
        BookAuthor author2 = new BookAuthor("Neal Gafter", 1960, "Software architect");

        List<BookAuthor> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);

        Book effectiveJava = new Book(
            "Effective Java",
            "Programming",
            45.0,
            50000,
            authors
        );

        System.out.println("--- Testing Book.toString() ---");
        System.out.println(effectiveJava);
        
        System.out.println("\n--- Testing getters ---");
        System.out.println("Book Title: " + effectiveJava.getTitle());
        System.out.println("First Author: " + effectiveJava.getAuthors().get(0).getFullName());
    }
}