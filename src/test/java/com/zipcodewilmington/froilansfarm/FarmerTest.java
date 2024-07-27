package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void farmerIsEaterTest(){
        Farmer sally = new Farmer();
        Boolean actual = sally instanceof Eater;
        Assert.assertTrue(actual);
    }

    @Test
    public void farmerIsRiderTest(){
        Farmer sally = new Farmer();
        Boolean actual = sally instanceof Rider;
        Assert.assertTrue(actual);
    }

    @Test
    public void farmerIsBotanistTest(){
        Farmer sally = new Farmer();
        Boolean actual = sally instanceof Botanist;
        Assert.assertTrue(actual);
    }

    @Test
    public void farmerIsPersonTest(){
        Farmer sally = new Farmer();
        Boolean actual = sally instanceof Person;
        Assert.assertTrue(actual);
    }




}
