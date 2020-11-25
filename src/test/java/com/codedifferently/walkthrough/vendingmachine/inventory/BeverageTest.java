package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class BeverageTest {
    @Test
    public void constructorTest(){
        // Given
        String name = "Coke";
        Double price = 1.20;
        Beverage beverage = new Beverage();

        // When
        String expected = name + " " + price;
        String actual = beverage.toString();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest(){
        // Given
        Beverage beverage = new Beverage();

        // When
        String expected = "Glug Glug, Yum!";
        String actual = beverage.message();

        // Then

        Assert.assertEquals(expected, actual);
    }
}
