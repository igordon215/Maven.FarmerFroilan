package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void farmHouseAddsPerson(){
        FarmHouse farmHouse = new FarmHouse();
        Farmer bob = new Farmer();
        farmHouse.add(bob);
        farmHouse.add(new Person());
        int expected = 2;
        int actual = farmHouse.size();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void farmHouseHoldsPersons(){
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(new Farmer());
        Person sally = farmHouse.get(0);
        boolean actual = sally instanceof Farmer;
        Assert.assertTrue(actual);
    }



}
