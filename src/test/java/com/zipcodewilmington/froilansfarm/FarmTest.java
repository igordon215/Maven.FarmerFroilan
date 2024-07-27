package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmTest {



    @Test
    public void farmHoldsStables(){
        Farm myFarm = new Farm();
        myFarm.add(new Stable());
        myFarm.add(new Stable());
        int expected = 2;
        int actual = myFarm.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void farmHoldsChickenCoop(){
        Farm myFarm = new Farm();
        myFarm.add(new ChickenCoop());
        int expected = 1;
        int actual = myFarm.size();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void farmHoldsFarmHouse(){
        Farm myFarm = new Farm();
        myFarm.add(new FarmHouse());
        myFarm.add(new FarmHouse());
        FarmHouse house = new FarmHouse();
        myFarm.add(house);
        int expected = 3;
        int actual = myFarm.size();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void farmHoldsEverything(){
        Farm myFarm = new Farm();
        myFarm.add(new Stable());
        myFarm.add(new ChickenCoop());
        myFarm.add(new FarmHouse());
        myFarm.add(new Stable());
        int expected = 4;
        int actual = myFarm.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void stableIsStorage(){
        Stable myStable = new Stable();
        boolean actual = myStable instanceof Storage;
        Assert.assertTrue(actual);
    }




}
