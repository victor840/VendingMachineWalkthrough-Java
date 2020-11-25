package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Chips extends Product{

    public Chips(String nameIn, Double priceIn) {
        super(nameIn, priceIn);
        msg = "Crunch Crunch, Yum!";
    }

    public Chips(){
        this("Lays",0.50);
    }

    @Override
    public String message() {
        return msg;
    }
}
