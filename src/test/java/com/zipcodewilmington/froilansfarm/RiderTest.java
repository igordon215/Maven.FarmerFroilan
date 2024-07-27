package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class RiderTest {


    @Test
    public void instanceOfRiderTest(){
        Farmer froilan = new Farmer();
        boolean actual = froilan instanceof Rider;
        Assert.assertTrue(actual);

    }

    @Test
    public void instanceofRideableTest(){
        Animal horsey = new Horse();
        boolean actual = horsey instanceof Rideable;
        Assert.assertTrue(actual);
    }

    @Test
    public void instanceofRideableTest2(){
        Animal chick = new Chicken();
        boolean actual = chick instanceof Rideable;
        Assert.assertFalse(actual);
    }

    @Test
    public void riderMountTest(){
        Farmer froilan = new Farmer();
        Rideable horsey = new Horse();
//        Animal chick = new Chicken();
        String expected = "Successfully mounted!";
        String actual = froilan.mount(horsey);
//        String actual2 = froilan.mount(chick);
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void riderDismountTest(){
        Farmer froilan = new Farmer();
        Animal horsey = new Horse();
        String expected = "Successfully dismounted!";
        froilan.mount(horsey);
        String actual = froilan.dismount(horsey);
//        String actual2 = froilan.mount(chick);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void notRideableTest(){
        Farmer bob = new Farmer();
        Animal chick = new Chicken();
        String actual = bob.mount(chick);
        String expected = "This animal cannot be ridden.";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void riderMountTractorTest(){
        Farmer bob = new Farmer();
        Tractor tractor = new Tractor();
        String actual = bob.mount(tractor);
        String expected = "Successfully mounted!";
        Assert.assertEquals(actual, expected);

    }

}
