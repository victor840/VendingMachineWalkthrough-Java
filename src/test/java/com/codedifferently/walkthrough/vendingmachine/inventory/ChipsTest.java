package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class ChipsTest {

    @Test
    public void constructorTest(){
        // Given
        Chips chips = new Chips();
        String name = "Lays";
        Double price = 0.50;

        // When
        String expected = name + " " + price;
        String actual = chips.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest(){
        // Given
        Chips chips = new Chips();

        // When
        String expected = "Crunch Crunch, Yum!";
        String actual = chips.message();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
