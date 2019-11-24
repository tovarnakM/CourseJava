package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Album {

    private Song song;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Song> songs = new ArrayList<>();
    private String name;

    public Album(String name) {
        this.name = name;
    }

    public void addSongToAlbum(){
        System.out.print("Enter song you can add to album: ");
        String name = scanner.nextLine();
        System.out.print("Enter duration of song: ");
        String duration = scanner.nextLine();
        songs.add(new Song(name, duration));
        System.out.println("Item added to albums");
    }

    public void showAlbum(){
        for (int i = 0; i < songs.size(); i++){
            System.out.println((i+1) + ". " + songs.get(i).getTitle() + "---> " + songs.get(i).getDuration());
        }
    }

    public String getName() {
        return name;
    }

    public Song getSong() {
        return song;
    }
}
