package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {

    @Test
    public void chickenCoopAddChickenTest(){
        ChickenCoop coop = new ChickenCoop();
        coop.add(new Chicken());
        coop.add(new Chicken());
        int expected = 2;
        int actual = coop.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void chickenCoopHoldsChickens(){
        ChickenCoop coop = new ChickenCoop();
        coop.add(new Chicken());
        Animal chicky = coop.get(0);
        boolean results = chicky instanceof Chicken;
        Assert.assertTrue(results);
    }





}
