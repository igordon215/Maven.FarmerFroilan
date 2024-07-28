package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void tomatoIsACropTest() {
        TomatoPlant tomato = new TomatoPlant();
        boolean results = tomato instanceof Crop;
        Assert.assertTrue(results);
    }

    @Test
    public void potatoPlantIsACropTest() {
        PotatoPlant potato = new PotatoPlant();
        boolean results = potato instanceof Crop;
        Assert.assertTrue(results);
    }



    @Test
    public void cropRowContainsCropTest(){
        CropRow tomatoRow = new CropRow();
        TomatoPlant tomato = new TomatoPlant();
        tomatoRow.add(tomato);
        boolean result = tomatoRow.contains(tomato);
        Assert.assertTrue(result);
    }
    @Test
    public void cropRowContainsPotatoCropTest(){
        CropRow potatoRow= new CropRow();
        PotatoPlant potato = new PotatoPlant();
        potatoRow.add(potato);
        boolean result = potatoRow.contains(potato);
        Assert.assertTrue(result);
    }

    @Test
    public void addCropToCropRowTest(){
        TomatoPlant crop = new TomatoPlant();
        CropRow tomatoRow = new CropRow();
        CropRow cornRow = new CropRow();
        tomatoRow.add(crop);
        tomatoRow.add(crop);
        tomatoRow.add(crop);
        int expected = 3;
        int actual = tomatoRow.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void toggleFertilizeCropTest(){
        TomatoPlant crop = new TomatoPlant();
        crop.setHasBeenFertilized(true);
        boolean results = crop.hasBeenFertilized();
        Assert.assertTrue(results);

    }
    @Test
    public void cornStalkisAninstanceOfCropTest(){
        CornStalk crop = new CornStalk();
        boolean results = crop instanceof Crop;
        Assert.assertTrue(results);
    }

    @Test
    public void testCropIsFertilizedMethod(){
        TomatoPlant crop = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();
        crop.setHasBeenFertilized(true);
        cornStalk.setHasBeenFertilized(true);
        boolean results = cornStalk.hasBeenFertilized();
        Assert.assertTrue(results);
    }


    @Test
    public void testCropIsHarvestedMethod(){
        TomatoPlant crop = new TomatoPlant();
        CornStalk cornStalk = new CornStalk();
        crop.setHasBeenHarvested(true);
        cornStalk.setHasBeenHarvested(true);
        crop.setHasBeenHarvested(false);
        boolean results = cornStalk.hasBeenHarvested();
        Assert.assertTrue(results);
    }

    @Test
    public void testTomatoPlantHarvestedMethod(){
        TomatoPlant crop = new TomatoPlant();
        crop.setHasBeenHarvested(true);
        boolean results = crop.hasBeenHarvested();
        Assert.assertTrue(results);
    }

    @Test
    public void testGeneralCropIsHarvestedMethod(){
        Crop crop = new TomatoPlant();
        Crop cornStalk = new CornStalk();
        crop.setHasBeenHarvested(true);
        cornStalk.setHasBeenHarvested(true);
        crop.setHasBeenHarvested(false);
        boolean results = cornStalk.hasBeenHarvested();
        Assert.assertTrue(results);
    }

    @Test
    public void testCropIsFertilizedDefaultsToFalse(){
        Crop crop = new TomatoPlant();
        Crop cornStalk = new CornStalk();
       boolean results = crop.hasBeenFertilized;
        Assert.assertFalse(results);
    }

    @Test
    public void setCropFertilizationTest(){
        Crop stalk = new CornStalk();
        stalk.setHasBeenFertilized(true);
        Boolean actual = stalk.hasBeenFertilized;
        Assert.assertTrue(actual);
    }


    @Test
    public void potatoPlantHasBeenFertilizedTest(){
        Crop crop = new PotatoPlant();
        crop.setHasBeenFertilized(true);
        boolean results = crop.hasBeenFertilized;
        Assert.assertTrue(results);
    }

    @Test
    public void potatoPlantHasBeenHarvestedTest(){
        Crop crop = new PotatoPlant();
        crop.setHasBeenHarvested(true);
        boolean results = crop.hasBeenHarvested;
        Assert.assertTrue(results);
    }

    @Test
    public void potatoPlantDefaultFalseHarvestedTest(){
        Crop crop = new PotatoPlant();
        boolean results = crop.hasBeenHarvested;
        Assert.assertFalse(results);
    }

    @Test
    public void potatoPlantDefaultFalseFertilizedTest(){
        Crop crop = new PotatoPlant();
        boolean results = crop.hasBeenFertilized;
        Assert.assertFalse(results);
    }








}
