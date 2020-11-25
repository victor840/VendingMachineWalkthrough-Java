package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Beverage extends Product{

    public Beverage(String nameIn, Double priceIn){
        super(nameIn, priceIn);
        msg = "Glug Glug, Yum!";
    }

    public Beverage(){
        this("Coke",1.20);
    }

    @Override
    public String message() {
        return msg;
    }
}
