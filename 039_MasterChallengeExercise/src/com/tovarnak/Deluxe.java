package com.tovarnak;

public class Deluxe extends BaseHamburger {

    private boolean chips;
    private boolean drink;
    private double chipsPrice = 1;
    private double drinkPrice = 0.7;
    private double hamburgerPrice = 0;

    public Deluxe(String breadRoll, String meat, boolean chips, boolean drink) {
        super(breadRoll, meat, new Additions(false,false,false,false));
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public double getHamburgerPrice(){
        if (chips){
            hamburgerPrice += chipsPrice;
        }
        if (drink){
            hamburgerPrice += drinkPrice;
        }
        hamburgerPrice += super.getHamburgerPrice();
        return hamburgerPrice;
    }

    @Override
    public void hamburgerComposition(){
        super.hamburgerComposition();
        if (chips){
            System.out.println("chips");
        }
        if (drink){
            System.out.println("drink");
        }
    }
    @Override
    public void getAdditions(){
        System.out.println("chips: " + chipsPrice + " eur");
        System.out.println("drink: " + drinkPrice + " eur");
    }
}
