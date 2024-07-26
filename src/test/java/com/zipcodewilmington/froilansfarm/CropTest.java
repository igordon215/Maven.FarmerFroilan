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
}
