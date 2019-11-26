package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Album {

    private Song song;
    private Scanner scanner = new Scanner(System.in);
    private SongList songs;
    private String name;

    public Album(String name) {
        this.name = name;
        this.songs = new SongList();
    }

    public void addSongToAlbum(){
        System.out.print("Enter song you can add to album: ");
        String name = scanner.nextLine();
        System.out.print("Enter duration of song: ");
        String duration = scanner.nextLine();
        songs.addSong(new Song(name, duration));
    }

    public void showAlbum(){
        songs.showAlbumList();
    }


    public String getName() {
        return name;
    }

    public Song getSong() {
        return song;
    }

    class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public void addSong(Song song){
            this.songs.add(song);
        }

        public void showAlbumList(){
            for (int i = 0; i < songs.size(); i++){
                System.out.println((i+1) + ". " + songs.get(i).getTitle() + "---> " + songs.get(i).getDuration());
            }
        }
    }
}
