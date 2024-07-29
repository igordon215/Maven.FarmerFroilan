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
        String expected = "Zoom!...";
        Assert.assertEquals(results, expected);
    }

    @Test
    public void airCraftCanFly(){
        AirCraft airCraft = new CropDuster();
        String results = airCraft.fly();
        String expected = "Currently flying...";
        Assert.assertEquals(results, expected);
    }

    @Test
    public void cropDusterIsaFarmVehicle(){
        AirCraft airCraft = new CropDuster();
        boolean results = airCraft instanceof FarmVehicle;
        Assert.assertTrue(results);
    }


    @Test
    public void cropDusterIsRideableTest(){
        AirCraft airCraft = new CropDuster();
        boolean results = airCraft instanceof Rideable;
        Assert.assertTrue(results);
    }



    @Test
    public void cropDusterIsanAirCraft(){
        AirCraft airCraft = new CropDuster();
        boolean results = airCraft instanceof AirCraft;
        Assert.assertTrue(results);
    }

    @Test
    public void cropOperatesOnFarm(){
        CropDuster duster = new CropDuster();
        Farm myFarm = new Farm();
        String actual = duster.operate(myFarm);
        String expected = "Currently operating CropDuster.";
        Assert.assertEquals(actual,expected);
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
        for(Crop c: results){
            if (c.hasBeenFertilized == false){
                rowIsFertilized = false;
                break;
            }
        }
        Assert.assertTrue(rowIsFertilized);
    }














}
