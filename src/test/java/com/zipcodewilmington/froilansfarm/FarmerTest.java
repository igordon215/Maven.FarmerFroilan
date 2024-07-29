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

    @Test
    public void pilotCanFlyAircraftTest(){
        Pilot sally = new Pilot();
        CropDuster duster = new CropDuster();
        String expected = "Im flying a cropDuster!";
        String actual = sally.fly(duster);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void farmerIsPilotTest(){
        Pilot sally = new Pilot();
        Boolean actual = sally instanceof Farmer;
        Assert.assertTrue(actual);
    }

    @Test
    public void getPilotName(){
        Pilot sally = new Pilot("sally");
        String name = "sally";
        String actual = sally.name;
        Assert.assertEquals(name, actual);
    }

    @Test
    public void getFarmerName(){
        Farmer sally = new Farmer("sally");
        String name = "sally";
        String actual = sally.name;
        Assert.assertEquals(name, actual);
    }






}
