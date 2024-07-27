package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void fieldContainsCropRowTest(){
        Field field = new Field();
        CropRow tomatoRow = new CropRow();
        field.add(tomatoRow);
        boolean results = field.contains(tomatoRow);
        Assert.assertTrue(results);
    }




}
