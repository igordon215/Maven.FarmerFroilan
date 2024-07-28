package com.zipcodewilmington.froilansfarm.DowTest;

import com.zipcodewilmington.froilansfarm.Chicken;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Plot;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

public class WednesdayTest {

    @Test
    public void chickenMakesEggs(){
        Plot plot = new Plot();
        plot.setUp();
//        for (Chicken chicken : plot.chickenCoop2){
//            chicken.setHasBeenFertilized(false);
//            Edible egg = chicken.yield();
//            if (!(egg == null)) {
//                plot.eggCarton.add(egg);
//            }
//        }
//        int expected = 3;
//        int actual = plot.eggCarton.size();
        plot.chickensYieldEggs();
        int expected = 3;
        int actual = plot.eggCarton.size();
        Assert.assertEquals(expected, actual);

    }



    //sun planted 3 crops
    //mon froilanda flew cropduster
    //tue froilan used tractor
    //wed chicken made eggs?
    //thu froilan and froilanda eat the eggs
    //fri sally comes over the farmhouse and sally rides the horses

    //sat sally plants tomatos



}
