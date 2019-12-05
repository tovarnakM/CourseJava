package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Club> {

    private String name;
    private ArrayList<T> leagues = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void addLeague(T club){
        if (leagues.contains(club)){
            System.out.println("uz je");
        }else {
            leagues.add(club);
        }
    }

    public void showLeagueTable(){
        Collections.sort(leagues);
        for (T t : leagues){
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
