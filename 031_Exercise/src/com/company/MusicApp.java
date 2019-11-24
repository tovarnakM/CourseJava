package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MusicApp {

    private Album album;
    private ArrayList<Album> albums = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private LinkedList<String> linkedList = new LinkedList<>();

    public void runApp(){
        System.out.println("\nWelcome to Music App");
        System.out.println("\t1 - show Albums");
        System.out.println("\t2 - add Album");
        System.out.println("\t3 - add new Song to Album");
        System.out.println("\t4 - show Songs");
        System.out.println("\t5 - add Song to Playlist");
        System.out.println("\t6 - Playlist");
        System.out.println("\t7 - close app");

        boolean enterQuit = false;
        int choice;
        while (true){
            System.out.print("\nSelect choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    showAlbums();
                    break;
                case 2:
                    addAlbum();
                    break;
                case 3:
                    addNewSongToAlbum();
                    break;
                case 4:
                    showSongs();
                    break;
                case 5:
                    addSongToPlaylist();
                    break;
                case 6:
                    playlist();
                    break;
                case 7:
                    enterQuit = true;
                    break;
            }

            if (enterQuit){
                break;
            }
        }
    }

    public void addAlbum(){
        System.out.print("Enter album name: ");
        String name = scanner.nextLine();
        albums.add(new Album(name));
    }

    public void showAlbums(){
        for (int i = 0; i < albums.size(); i++){
            System.out.println((i+1) + ". " + albums.get(i).getName());
        }
    }

    public void addNewSongToAlbum(){
        boolean foundAlbum = false;
        System.out.print("Enter Album where to add song: ");
        String name = scanner.nextLine();
        int size = albums.size();
        for (int i = 0; i < size; i++){
            if (name.equals(albums.get(i).getName())){
                foundAlbum = true;
                album = albums.get(i);
                album.addSongToAlbum();
            }
        }
        if (!foundAlbum){
            System.out.println("Album not found.");
        }
    }

    public void showSongs(){
        boolean foundAlbum = false;
        System.out.print("Enter Album to show songs: ");
        String name = scanner.nextLine();
        int size = albums.size();
        for (int i = 0; i < size; i++){
            if (name.equals(albums.get(i).getName())){
                foundAlbum = true;
                album = albums.get(i);
                album.showAlbum();
            }
        }
        if (!foundAlbum){
            System.out.println("Album not found.");
        }
    }

    public void addSongToPlaylist(){
        showSongs();
        System.out.print("Enter song for add to playlist");
        String song = scanner.nextLine();
        linkedList.add(song);
    }

    public void playlist(){
        ListIterator<String> listIterator = linkedList.listIterator();
        if (linkedList.isEmpty()){
            System.out.println("Empty playlist");
        }else {
            for (int i = 0; i < linkedList.size(); i++){
                System.out.println((i+1) + ". " + linkedList.get(i));
            }
            System.out.println("Now playing " + linkedList.getFirst());
        }
        control();
        boolean quit = false;
        boolean controlForward = true;
        while (!quit){
            System.out.print("Enter control action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    if (controlForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        controlForward = false;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now playing: " + listIterator.next());
                    }else {
                        System.out.println("Now playing: " + linkedList.getLast());
                    }
                    break;
                case 2:
                    controlForward = true;
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing: " + listIterator.previous());
                    }else {
                        System.out.println("Now playing: " + linkedList.getFirst());
                    }
                    break;
            }
            if (quit){
                break;
            }
        }
    }

    private void control(){
        System.out.println();
        System.out.println("0 - quit");
        System.out.println("1 - next song");
        System.out.println("2 - previous song/ repeat song");
    }
}
