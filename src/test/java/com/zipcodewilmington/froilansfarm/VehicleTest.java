package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void vehicleIsRideableTest(){
        Vehicle tractor = new Tractor();
        boolean actual = tractor instanceof Rideable;
        Assert.assertTrue(actual);
    }

//    @Test
//    public void tractorHarvestCropTest(){
//        Tractor tractor = new Tractor();
//        Crop tomatoPlant = new TomatoPlant();
//        Crop actual = tractor.harvest(tomatoPlant);
//        Assert.assertTrue(actual instanceof Crop);
//    }

    @Test
    public void vehicleIsNoiseMakerTest(){
        Tractor tractor = new Tractor();
        boolean actual = tractor instanceof NoiseMaker;
        Assert.assertTrue(actual);
    }

    @Test
    public void vehicleMakesNoiseTest(){
        Tractor tractor = new Tractor();
        String actual = tractor.makeNoise();
        String expected = "Vroom vroom!";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void tractorInstanceOfVehicle(){
        Tractor tractor = new Tractor();
        boolean actual = tractor instanceof Vehicle;
        Assert.assertTrue(actual);
    }

    @Test
    public void tractorIsFarmVehicleTest(){
        Tractor tractor = new Tractor();
        boolean actual = tractor instanceof FarmVehicle;
        Assert.assertTrue(actual);
    }

    @Test
    public void farmVehicleInstanceVehicleTest(){
        Tractor tractor = new Tractor();
        boolean actual = tractor instanceof Vehicle;
        Assert.assertTrue(actual);
    }

    @Test
    public void farmVehiclecanOperateOnAFarm(){
        Tractor tractor = new Tractor();
        Farm farm = new Farm();
        String results = tractor.operate(farm);

        Assert.assertEquals("currently operating in tractor Farm", results);
    }








}
