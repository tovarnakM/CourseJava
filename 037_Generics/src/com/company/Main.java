package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /*ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);*/

        /*FootballPlayer jou = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(jou);

        //adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle,1,1);
        hawthorn.matchResult(adelaideCrows, 3,8);

        adelaideCrows.matchResult(fremantle, 1,1);
        adelaideCrows.matchResult(null,1,1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));*/

        League<Club<Football>> footballLeague = new League<>("Premier");
        Club<Football> manchester = new Club<>("Manchester");
        Club<Football> arsenal = new Club<>("Arsenal");
        Club<Tennis> djokovic = new Club<>("Garos");

        manchester.match(arsenal,10,2);
        footballLeague.addLeague(manchester);
        footballLeague.showLeagueTable();
    }

    private static void printDoubled(ArrayList<Integer> arrayList){
        for (Integer i : arrayList){
            System.out.println(i * 2);
        }
    }
}
