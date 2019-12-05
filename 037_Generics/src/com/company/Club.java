package com.company;

import java.util.ArrayList;

public class Club<T extends Sport> implements Comparable<Club<T>> {

    private String name;
    private int won;
    private int draw;

    public Club(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void match(Club<T> club, int homeScore, int awayScore){
        if (homeScore > awayScore){
            this.won++;
        }else if (awayScore > homeScore){
            this.draw++;
        }
        if (club != null){
            club.match(null, awayScore, homeScore);
        }
    }

    public int ranking(){
        return this.won * 3 + this.draw;
    }

    @Override
    public int compareTo(Club<T> club) {
        if (this.ranking() > club.ranking()){
            return -1;
        }else if (this.ranking() < club.ranking()){
            return 1;
        }else {
            return 0;
        }
    }
}
