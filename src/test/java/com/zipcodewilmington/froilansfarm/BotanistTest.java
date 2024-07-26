package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {

    @Test
    public void farmerIsBotanist() {
        Farmer farmer = new Farmer();
        boolean results = farmer instanceof Botanist;
        Assert.assertTrue(results);
    }

    @Test
    public void farmerPlantTest() {
        Farmer farmer = new Farmer();
        Crop crop = new TomatoPlant();
        CropRow croprow = new CropRow();
        CropRow croprow2 = new CropRow();
        farmer.plant(crop, croprow);
        farmer.plant(crop, croprow2);
        farmer.plant(crop, croprow2);

        Assert.assertTrue(croprow2.size() == 2);
    }

}
