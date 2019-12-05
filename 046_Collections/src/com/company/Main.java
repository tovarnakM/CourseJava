package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian",8,12);
        //List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        //printList(seatCopy);

        //seatCopy.get(1).reserve();
        if (theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else {
            System.out.println("Already reserved");
        }

        if (theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else {
            System.out.println("Already reserved");
        }

        if (theatre.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        }else {
            System.out.println("Already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00",13.00));
        priceSeats.add(theatre.new Seat("A00",13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);


        /*
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seats");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted list: ");
        printList(seatCopy);*/

        /*theatre.getSeats();
        if (theatre.reserveSeat("A01")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry seat is taken");
        }

        if (theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry seat is taken");
        }*/
/*
        LinkedList<String> list = new LinkedList<>();
        list.add("Ahoj");
        list.add("Cau");
        list.add("Ok");
        list.add("Ahaj");

        System.out.println(Collections.binarySearch(list, "Ahoj", null));
        Collections.sort(list);
        for (String linkedList : list){
            System.out.println(linkedList);
        }
        */

        /*Student s1 = new Student("1");
        Student s2 = new Student("2");
        Student s3 = new Student("3");

        List<Student> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(Collections.binarySearch(list,s3,null));*/
    }

    /*static class Student implements Comparable<Student> {
        String id;

        Student(String id){
            this.id = id;
        }

        String getId(){
            return this.id;
        }

        @Override
        public int compareTo(Student student) {
            return this.id.compareTo(student.getId());
        }
    }*/

    /*public static int binarySearch(int number){
        int min = 0;
        int max = 100;

        while (true){
            System.out.println(".");
            int mid = (max + min) / 2;
            if (mid == number){
                return number;
            }else if (number < mid){
                max = mid;
            }else {
                min = mid;
            }
        }
    }*/

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("================================================================================================================================================");
    }

    /*public static void sortList(List<? extends Theatre.Seat> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }*/


}
