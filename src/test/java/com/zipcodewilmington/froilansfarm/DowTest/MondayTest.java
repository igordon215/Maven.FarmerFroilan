package com.zipcodewilmington.froilansfarm.DowTest;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Assert;
import org.junit.Test;

public class MondayTest {

    @Test
    public void testFroilandaFlying() {
        Plot plot = new Plot();
        plot.setUp();
//        plot.froilan.plant(new CornStalk(), plot.cornRow);
//        plot.froilan.plant(new TomatoPlant(), plot.tomatoRow);
//        plot.froilan.plant(new PotatoPlant(), plot.potatoRow);
//        plot.froilanda.fly(new CropDuster());
//
        plot.froilandaFlysCropDuster();


        for (CropRow cropRow : plot.froilansFarmField) {
            for (Crop crop : cropRow) {
                crop.setHasBeenFertilized(true);
                Assert.assertTrue(crop.hasBeenFertilized);
            }
        }
    }


}
