package com.tovarnak;

public class HealthyBurger extends BaseHamburger {

    private boolean onion;
    private double priceOnion = 0.2;
    private boolean dressing;
    private double priceDressing = 0.25;
    private Additions additions;
    private double hamburgerPrice = 0;

    public HealthyBurger(String meat, Additions additions, boolean onion, boolean dressing) {
        super("brown rye", meat, additions);
        this.onion = onion;
        this.dressing = dressing;
    }
    @Override
    public double getHamburgerPrice(){
        if (onion){
            hamburgerPrice += priceOnion;
        }
        if (dressing){
            hamburgerPrice += priceDressing;
        }
        hamburgerPrice += super.getHamburgerPrice();
        return hamburgerPrice;
    }

    @Override
    public void hamburgerComposition(){
        super.hamburgerComposition();
        if (onion){
            System.out.println("onion");
        }
        if (dressing){
            System.out.println("dressing");
        }
    }
}
