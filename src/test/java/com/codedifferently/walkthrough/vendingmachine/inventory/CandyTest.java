package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

    @Test
    public void constructorTest(){

        // Given
        String name = "Sour Patch Kids";
        Double price = 1.50;
        Candy candy = new Candy();

        // When
        String expected = name + " " + price;
        String actual = candy.toString();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void messageTest(){

        // Given
        Candy candy = new Candy();

        // When
        String expected = "Munch Munch, Yum!";
        String actual = candy.message();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
