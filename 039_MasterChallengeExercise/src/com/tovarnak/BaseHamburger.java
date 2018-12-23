package com.tovarnak;

public class BaseHamburger {

    private String breadRoll;
    private String meat;
    private double priceBreadroll = 1;
    private double priceMeat = 2;
    private Additions additions;

    private double hamburgerPrice = 0;

    public BaseHamburger(String breadRoll, String meat, Additions additions){
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.additions = additions;
    }
    public double getHamburgerPrice(){
        hamburgerPrice = priceMeat + priceBreadroll + additions.getTotalPrice();
        return hamburgerPrice;
    }
    public void hamburgerComposition(){
        System.out.println("Hamburger is created with: ");
        System.out.println(this.breadRoll + " bread roll");
        System.out.println(this.meat + " meat");
        additions.selectedAdditions();
    }
    public void getAdditions(){
        additions.getAdditions();
    }

}

