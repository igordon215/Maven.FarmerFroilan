package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class AirCraftTest {
    @Test
    public void airCraftInstanceOfVehicle(){
        AirCraft airCraft = new CropDuster();
        boolean results = airCraft instanceof Vehicle;
        Assert.assertTrue(results);
    }

    @Test
    public void airCraftmakesNoise(){
        AirCraft airCraft = new CropDuster();
        String results = airCraft.makeNoise();
        String expected = "Cropduster making noise.";
        Assert.assertEquals(results, expected);
    }

    @Test
    public void airCraftCanFly(){
        AirCraft airCraft = new CropDuster();
        String results = airCraft.fly();
        String expected = "Cropduster is flying.";
        Assert.assertEquals(results, expected);
    }

    @Test
    public void cropDusterIsaVehicle(){
        AirCraft airCraft = new CropDuster();
        boolean results = airCraft instanceof Vehicle;
        Assert.assertTrue(results);
    }

    @Test
    public void cropDusterIsanAirCraft(){
        AirCraft airCraft = new CropDuster();
        boolean results = airCraft instanceof AirCraft;
        Assert.assertTrue(results);
    }
    @Test
    public void cropDusterCanFertilizeACropRow(){
        CropDuster airCraft = new CropDuster();
        CropRow cropRow = new CropRow();
        cropRow.add(new TomatoPlant());
        cropRow.add(new CornStalk());
        System.out.println();
        boolean rowIsFertilized = true;
        CropRow results = airCraft.fertilize(cropRow);
        System.out.println("hellow");
        for(Crop c: results){
            System.out.println("testing: " + c.hasBeenFertilized);
            if (c.hasBeenFertilized == false){

                rowIsFertilized = false;
                break;
            }
        }
        Assert.assertTrue(rowIsFertilized);
    }














}
