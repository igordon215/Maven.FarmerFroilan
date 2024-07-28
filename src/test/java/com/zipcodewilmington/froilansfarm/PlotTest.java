package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PlotTest {

    @Test
    public void testFarmHouseSize(){
        Plot plot = new Plot();
        plot.setUp();
        Farmer farmer = new Farmer();
        plot.addToFarmHouse(farmer);
        int size = plot.farmHouse.size();
        Assert.assertEquals(3, size);
    }

    @Test
    public void createNewFarmerTest(){
        Plot plot = new Plot();
        plot.setUp();
        Farmer farmer1 = plot.createNewFarmer("Josh");
        String actual = farmer1.name;
        String expected = "Josh";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void createNewPilotTest(){
        Plot plot = new Plot();
        plot.setUp();
        Pilot pilot1 = plot.createNewPilot("Josh");
        String actual = pilot1.name;
        String expected = "Josh";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void addChickensToCoopTest(){
        Plot plot = new Plot();
        plot.setUp();
        plot.adding15ChickensTo4Coops();
        int expected = 9;
        int actual = plot.chickenCoop3.size() + plot.chickenCoop2.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addHorsesToStableTest(){
        Plot plot = new Plot();
        plot.setUp();
        plot.adding10HorsesTo3Stables();
        int expected = 7;
        int actual = plot.stable.size() + plot.stable2.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addToFarmTest(){
        Plot plot = new Plot();
        plot.setUp();
        int expected = plot.froilansFarm.size();
        int actual = 9;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void fullWeekCompletedTest(){
        Week week = new Week();
        String expected = "Full week completed.";
        String actual = week.runFullWeek();
        Assert.assertEquals(expected,actual);
    }









}
