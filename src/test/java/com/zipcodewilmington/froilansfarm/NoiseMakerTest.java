package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class NoiseMakerTest {

    @Test
    public void animalNoiseTest(){
        Animal horse = new Horse();
        String expected = "Neigh!";
        String actual = horse.makeNoise();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void animalNoiseTest2(){
        Animal chick = new Chicken();
        String expected = "Cluck!";
        String actual = chick.makeNoise();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void personNoiseTest(){
        Person bob = new Person();
        String expected = "Hello!";
        String actual = bob.makeNoise();
        Assert.assertEquals(expected,actual);
    }



}
