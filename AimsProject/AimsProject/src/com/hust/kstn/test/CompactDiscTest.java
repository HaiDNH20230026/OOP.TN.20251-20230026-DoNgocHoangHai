package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;
import java.util.ArrayList;
import java.util.List;

public class CompactDiscTest {
    public static void main(String[] args) {
        
    	List<String> directors = new ArrayList<>();
        directors.add("Quincy Jones");
        directors.add("Steve Barron");

        List<String> artists = new ArrayList<>();
        artists.add("Michael Jackson");

        Track track1 = new Track("Thriller", 6);
        Track track2 = new Track("Beat It", 4);
        Track track3 = new Track("Billie Jean", 5);

        List<Track> initialTracks = new ArrayList<>();
        initialTracks.add(track1);
        initialTracks.add(track2);
        initialTracks.add(track3);

        CompactDisc cd = new CompactDisc(
            1, 
            "Thriller",
            "Pop", 
            15.0, 
            artists, 
            directors, 
            initialTracks 
        );

        System.out.println("--- CD Details ---");
        System.out.println(cd);
        System.out.println("Total Length: " + cd.totalLength());


        System.out.println("\n--- Adding new track ---");
        Track track4 = new Track("Smooth Criminal", 4);
        cd.addTrack(track4);
        System.out.println(cd);


        System.out.println("\n--- Adding existing track ---");
        cd.addTrack(track2);

        System.out.println("\n--- Removing a track ---");
        cd.removeTrack(track2);
        System.out.println(cd);

        System.out.println("\n--- Removing that track again ---");
        cd.removeTrack(track2);
    }
}