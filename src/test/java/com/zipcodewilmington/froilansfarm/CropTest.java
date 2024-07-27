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
    public void cropRowContainsCropTest(){
        CropRow tomatoRow = new CropRow();
        TomatoPlant tomato = new TomatoPlant();
        tomatoRow.add(tomato);
        boolean result = tomatoRow.contains(tomato);
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


}
