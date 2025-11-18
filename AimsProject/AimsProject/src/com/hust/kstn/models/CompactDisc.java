package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    
    private int id;
    private String title;
    private String category;
    private double cost;
    private List<String> artists = new ArrayList<>();
    private List<String> directors = new ArrayList<>();
    
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, double cost, List<String> artists, List<String> directors, List<Track> tracks) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artists = artists;
        this.directors = directors;
        this.tracks = tracks; 
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }
    
    public String getCategory(){
    	return category;
    }

    public List<String> getArtists() {
        return artists;
    }
    
    public List<String> getDirectors() {
        return directors;
    }
    
    public List<Track> getTracks(){
    	return tracks;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Error: Track '" + track.getTitle() + "' already exists in this CD.");
        } else {
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' added successfully.");
        }
    }

    public void removeTrack(Track track) {
        if (!tracks.contains(track)) {
            System.out.println("Error: Track '" + track.getTitle() + "' does not exist in this CD.");
        } else {
            tracks.remove(track);
            System.out.println("Track '" + track.getTitle() + "' removed successfully.");
        }
    }

    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

    @Override
    public String toString() {
        return "CD [" + this.id + "][" 
             + this.title + "][" 
             + this.category + "]["
             + this.cost + "]"
             + "\nDirectors: " + this.directors
             + "\nArtists: " + this.artists
             + "\nTotal Length: " + totalLength()
             + "\nTracks: " + this.tracks;
    }
}
