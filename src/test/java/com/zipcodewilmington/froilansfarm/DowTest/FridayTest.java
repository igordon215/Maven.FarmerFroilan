package com.zipcodewilmington.froilansfarm.DowTest;

import com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Plot;
import org.junit.Assert;
import org.junit.Test;

public class FridayTest {


    @Test
    public void bringSallyOver(){
        Plot plot = new Plot();
        plot.setUp();
//        Farmer sally = new Farmer("Sally");
//        plot.farmHouse.add(sally);
        plot.sallyArrivesAndRidesHorses();
        int expected = 3;
        int actual = plot.farmHouse.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sallyRidesAllHorses(){
        Plot plot = new Plot();
        plot.setUp();
//        Farmer sally = new Farmer("Sally");
//        plot.farmHouse.add(sally);
//
//        for (Animal horse : plot.stable) {
//            Assert.assertEquals("Successfully mounted!", sally.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", sally.dismount(horse));
//        }
//        for (Animal horse : plot.stable1) {
//            Assert.assertEquals("Successfully mounted!", sally.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", sally.dismount(horse));
//        }
//        for (Animal horse : plot.stable2) {
//            Assert.assertEquals("Successfully mounted!", sally.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", sally.dismount(horse));
//        }
        plot.sallyArrivesAndRidesHorses();
        String actual = plot.sallyArrivesAndRidesHorses();
        Assert.assertEquals("Sally rode all the horses.\n",actual);
    }


}
