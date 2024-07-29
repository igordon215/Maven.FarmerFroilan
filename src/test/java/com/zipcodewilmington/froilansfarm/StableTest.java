package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class StableTest {


    @Test
    public void stableAddsHorses(){
        Stable stable = new Stable();
        stable.add(new Horse());
        stable.add(new Horse());
        stable.add(new Horse());
        int expected = 3;
        int actual = stable.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void stableHoldsHorses(){
        Stable stable = new Stable();
        stable.add(new Horse());
        Horse horsey = stable.get(0);
        boolean actual = horsey instanceof Horse;
        Assert.assertTrue(actual);
    }




}
