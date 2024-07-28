package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PlotTest {
    @BeforeEach
    public void setUpTest(){
        Plot plot = new Plot();
        plot.setUp();
    }
    @Test
    public void testFarmHouseSize(){
        Plot plot = new Plot();
        plot.setUp();
        int size = plot.farmHouse.size();
        Assert.assertEquals(2, size);

    }
}
