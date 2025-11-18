package com.hust.kstn.models;

public class Media {

    private int id;
    private String title;
    private String category;
    private double cost;

    private static int nbMedias = 0;

    public Media(String title, String category, double cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbMedias; 
    }
    
    public Media(String title) {
        this.title = title;
        this.id = ++nbMedias;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Media - " + "[" + this.id + "] - "
             + "[" + this.title + "] - "
             + "[" + this.category + "] - "
             + "[" + this.cost + "$]";
    }
}