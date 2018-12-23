package com.tovarnak;

public class Additions {

    private boolean lettuce;
    private double lettucePrice = 0.99;
    private boolean tomato;
    private double tomatoPrice = 0.8;
    private boolean carrot;
    private double carrotPrice = 0.6;
    private boolean frites;
    private double fritesPrice = 1.29;
    private String ad1 = "lettuce";
    private String ad2 = "tomato";
    private String ad3 = "carrot";
    private String ad4 = "frites";

    private double totalPrice = 0;

    public Additions(boolean lettuce, boolean tomato, boolean carrot, boolean frites) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.frites = frites;
    }
    public void getAdditions(){
        System.out.println("Additions in our offer: ");
        System.out.println(ad1 + ": " + lettucePrice + " eur");
        System.out.println(ad2 + ": " + tomatoPrice + " eur");
        System.out.println(ad3 + ": " + carrotPrice + " eur");
        System.out.println(ad4 + ": " + fritesPrice + " eur");

    }
    public double getTotalPrice(){
        if (lettuce){
            this.totalPrice += lettucePrice;
        }
        if (carrot){
            this.totalPrice += carrotPrice;
        }
        if (frites){
            this.totalPrice += fritesPrice;
        }
        if (tomato){
            this.totalPrice += tomatoPrice;
        }
        return totalPrice;
    }

    public void selectedAdditions(){
        if (lettuce){
            System.out.println(ad1);
        }
        if (carrot){
            System.out.println(ad3);
        }
        if (frites){
            System.out.println(ad4);
        }
        if (tomato){
            System.out.println(ad2);
        }
    }

}
