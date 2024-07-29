package com.zipcodewilmington.froilansfarm.DowTest;

import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Plot;
import com.zipcodewilmington.froilansfarm.PotatoPlant;
import com.zipcodewilmington.froilansfarm.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class SaturdayTest {

    @Test
    public void sallyPlantsPotatoesTest(){
        Plot plot = new Plot();
        plot.setUp();
//        Farmer sally = new Farmer("Sally");
//        plot.farmHouse.add(sally);
//
//        //Sally plants five potatoes
//        for (int i = 0; i < 5; i++) {
//            sally.plant(new PotatoPlant(), plot.potatoRow2);
//        }
        plot.sallyPlantsPotatoes();

        Assert.assertEquals(5, plot.potatoRow2.size());
    }
}
