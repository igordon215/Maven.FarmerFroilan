package com.zipcodewilmington.froilansfarm.DowTest;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Assert;
import org.junit.Test;

public class TuesdayTest {

    @Test
    public void testFroilanHarvest() {
        Plot plot = new Plot();
        Tractor tractor = new Tractor();
        plot.setUp();
        plot.froilan.plant(new CornStalk(), plot.cornRow);
        plot.froilan.plant(new TomatoPlant(), plot.tomatoRow);
        plot.froilan.plant(new PotatoPlant(), plot.potatoRow);
        tractor.operate(plot.froilansFarm);
        for (CropRow cropRow : plot.froilansFarmField) {
            for (Crop crop : cropRow) {
                tractor.harvest(crop);
                Assert.assertTrue(crop.hasBeenHarvested);
            }
        }
    }


}
