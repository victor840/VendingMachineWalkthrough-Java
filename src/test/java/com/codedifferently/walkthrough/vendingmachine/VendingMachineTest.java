package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.Beverage;
import com.codedifferently.walkthrough.vendingmachine.inventory.Candy;
import com.codedifferently.walkthrough.vendingmachine.inventory.Product;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class VendingMachineTest {
    private final static Logger logger = Logger.getLogger(VendingMachineTest.class);

    @Test
    public void stockVendingMachineTest(){
        String[] sample = {"A1|Sour Patch Kids|1.25|Candy"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        Product expectedCandy = new Candy("Sour Patch Kids", 1.25);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualCandy = inventory.get("A1");

        Assert.assertEquals(expectedCandy.getName(), actualCandy.getName());
    }

    @Test
    public void stockVendingMachineTest2(){
        String[] sample = {"A2|Coke|1.00|Beverage"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        Product expectedBeverage = new Beverage("Coke", 1.00);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualBeverage = inventory.get("A2");

        Assert.assertEquals(expectedBeverage.getName(), actualBeverage.getName());
    }
}

