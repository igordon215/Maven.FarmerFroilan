package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class EaterTest {

    @Test
    public void eaterCanEatEdibleTest (){
        Animal horse = new Horse();
        Edible edible = new Edible();
        horse.eat(edible);

        Integer expected = 1;
        Integer actual = horse.foodsEaten.size();

        Assert.assertEquals(expected,actual);




    }




}
