package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class AnimalTest {

    @Test
    public void horseTest(){
        Animal horsey = new Horse();
        boolean actual = horsey instanceof NoiseMaker;
        Assert.assertTrue(actual);
    }

    @Test
    public void horseTest2(){
        Animal horsey = new Horse();
        boolean actual = horsey instanceof Rideable;
        Assert.assertTrue(actual);
    }

    @Test
    public void chickenTest(){
        Animal chick = new Chicken();
        boolean actual = chick instanceof NoiseMaker;
        Assert.assertTrue(actual);
    }


    @Test
    public void chickenIsAnimalTest(){
        Animal chick = new Chicken();
        boolean actual = chick instanceof Animal;
        Assert.assertTrue(actual);
    }

    @Test
    public void chickenIsProduce(){
        Animal chick = new Chicken();
        boolean actual = chick instanceof Produce;
        Assert.assertTrue(actual);
    }

    @Test
    public void chickenDoesNotYieldsEggTest(){
        Chicken chick = new Chicken();
        Edible actual = chick.yield();
        Object expected = null;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void chickenYieldsEggTest(){
        Chicken chick = new Chicken();
        chick.setHasBeenFertilized(false);
        Edible actual = chick.yield();
        boolean results = actual instanceof EdibleEgg;
        Assert.assertTrue(results);
    }




}
