package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class ProduceTest {


    @Test
    public void cropIsProduceTest(){
        Crop crop = new TomatoPlant();
        boolean actual = crop instanceof Produce;
        Assert.assertTrue(actual);
    }

    @Test
    public void tomatoCanYieldTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenHarvested(true);
        tomatoPlant.setHasBeenFertilized(true);
        Edible yieledVegetable = tomatoPlant.yield();
        boolean results = yieledVegetable instanceof Tomato;
        Assert.assertTrue(results);
    }

    @Test
    public void tomatoCannotYieldTest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        Edible yieledVegetable = tomatoPlant.yield();
        boolean results = yieledVegetable instanceof Tomato;
        Assert.assertFalse(results);
    }

    @Test
    public void cornCanYieldTest(){
        Crop stalk = new CornStalk();
        stalk.setHasBeenFertilized(true);
        stalk.setHasBeenHarvested(true);
        Edible edible = stalk.yield();
        boolean results = edible instanceof Corn;
        Assert.assertTrue(results);
    }

    @Test
    public void cornCannotYieldTest(){
        Crop stalk = new CornStalk();
        Edible edible = stalk.yield();
        boolean results = edible instanceof Corn;
        Assert.assertFalse(results);
    }

    @Test
    public void chickenCanYieldTest(){
        Chicken chick = new Chicken();
        chick.setHasBeenFertilized(false);
        Edible actual = chick.yield();
        boolean result = actual instanceof EdibleEgg;
        Assert.assertTrue(result);
    }

    @Test
    public void chickenCannotYieldTest(){
        Chicken chick = new Chicken();
        Edible actual = chick.yield();
        boolean result = actual instanceof EdibleEgg;
        Assert.assertFalse(result);
    }

}
