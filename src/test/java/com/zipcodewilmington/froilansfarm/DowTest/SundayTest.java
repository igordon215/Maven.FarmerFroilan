package com.zipcodewilmington.froilansfarm.DowTest;

import com.zipcodewilmington.froilansfarm.*;
import org.junit.Assert;
import org.junit.Test;

public class SundayTest {


    @Test
    public void testFroilanRidingHorses() {
        Plot plot = new Plot();
        plot.setUp();
//        for (Animal horse : plot.stable) {
//            Assert.assertEquals("Successfully mounted!", plot.froilan.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", plot.froilan.dismount(horse));
//        }
//        for (Animal horse : plot.stable1) {
//            Assert.assertEquals("Successfully mounted!", plot.froilan.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", plot.froilan.dismount(horse));
//        }
//        for (Animal horse : plot.stable2) {
//            Assert.assertEquals("Successfully mounted!", plot.froilan.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", plot.froilan.dismount(horse));
//        }
        String actual = plot.froilanRidingHorses();
        Assert.assertEquals("Froilan rode all the horses in the stables.", actual);

    }

    @Test
    public void testFroilandaRidingHorses() {
        Plot plot = new Plot();
        plot.setUp();
//        for (Animal horse : plot.stable) {
//            Assert.assertEquals("Successfully mounted!", plot.froilanda.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", plot.froilanda.dismount(horse));
//        }
//        for (Animal horse : plot.stable1) {
//            Assert.assertEquals("Successfully mounted!", plot.froilanda.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", plot.froilanda.dismount(horse));
//        }
//        for (Animal horse : plot.stable2) {
//            Assert.assertEquals("Successfully mounted!", plot.froilanda.mount(horse));
//            Assert.assertEquals("Successfully dismounted!", plot.froilanda.dismount(horse));
//        }
        plot.froilandaRidingHorses();
        String actual = plot.froilandaRidingHorses();
        Assert.assertEquals("Froilanda rode all the horses in the stables.", actual);

    }

    @Test
    public void testFeedingHorses() {
        Plot plot = new Plot();
        plot.setUp();
//        for (Animal horse : plot.stable) {
//            horse.eat(new Corn());
//            horse.eat(new Corn());
//            horse.eat(new Corn());
//            Assert.assertEquals(3, horse.getFoods().size());
//        }
//        for (Animal horse : plot.stable1) {
//            horse.eat(new Corn());
//            horse.eat(new Corn());
//            horse.eat(new Corn());
//            Assert.assertEquals(3, horse.getFoods().size());
//        }
//        for (Animal horse : plot.stable2) {
//            horse.eat(new Corn());
//            horse.eat(new Corn());
//            horse.eat(new Corn());
//            Assert.assertEquals(3, horse.getFoods().size());
//        }
        plot.feedingAllHorses();
        String actual = plot.feedingAllHorses();
        Assert.assertEquals("Froilan fed all the horses 3 ears of corn.", actual);
    }

    @Test
    public void testFroilanBreakfast() {
        Plot plot = new Plot();
        plot.setUp();
        plot.froilanEatsBreakfast();
//        plot.froilan.eat(new Corn());
//        plot.froilan.eat(new Tomato());
//        plot.froilan.eat(new Tomato());
//        for (int i = 0; i < 5; i++) {
//            plot.froilan.eat(new EdibleEgg());
//        }
        Assert.assertEquals(8, plot.froilan.getFoods().size());
    }

    @Test
    public void testFroilandaBreakfast() {
        Plot plot = new Plot();
        plot.setUp();
//        plot.froilanda.eat(new Corn());
//        plot.froilanda.eat(new Corn());
//        plot.froilanda.eat(new Tomato());
//        for (int i = 0; i < 2; i++) {
//            plot.froilanda.eat(new EdibleEgg());
//        }
        plot.froilandaEatsBreakfast();
        Assert.assertEquals(5, plot.froilanda.getFoods().size());
    }

    @Test
    public void testPlantingCrops() {
        Plot plot = new Plot();
        plot.setUp();
//        plot.froilan.plant(new CornStalk(), plot.cornRow);
//        plot.froilan.plant(new TomatoPlant(), plot.tomatoRow);
//        plot.froilan.plant(new PotatoPlant(), plot.potatoRow);
        plot.froilandPlantingCrops();

        Assert.assertEquals(1,plot.cornRow.size());
        Assert.assertEquals(1,plot.tomatoRow.size());
        Assert.assertEquals(1,plot.potatoRow.size());
    }

}
