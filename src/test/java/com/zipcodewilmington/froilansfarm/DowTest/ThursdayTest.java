package com.zipcodewilmington.froilansfarm.DowTest;

import com.zipcodewilmington.froilansfarm.Chicken;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Plot;
import org.junit.Assert;
import org.junit.Test;

public class ThursdayTest {


    @Test
    public void froilanEatsEggCarton(){
        Plot plot = new Plot();
        plot.setUp();
//        for (Chicken chicken : plot.chickenCoop3) {
//            chicken.setHasBeenFertilized(false);
//            Edible egg = chicken.yield();
//            if (!(egg == null)) {
//                plot.eggCarton.add(egg);
//            }
//        }
//        for (Edible egg : plot.eggCarton){
//            plot.froilan.eat(egg);
//        }
//        plot.eggCarton.clear();
        plot.chickensYieldEggs();
        plot.froilanEatsEggCarton();
        int expected = 6;
        int actual = plot.froilan.foodEaten.size();
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(0,plot.eggCarton.size());
    }
}
