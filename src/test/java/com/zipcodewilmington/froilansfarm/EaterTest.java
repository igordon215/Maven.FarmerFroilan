package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class EaterTest {

    @Test
    public void horseEatEdibleTest (){
        Animal horse = new Horse();
        Animal horse2 = new Horse();
        EarCorn earCorn = new EarCorn();
        horse.eat(earCorn);
        horse2.eat(earCorn);
        horse2.eat(earCorn);
        horse2.eat(earCorn);

        Integer expected = 3;
        Integer actual = horse2.getFoods().size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void chickenEatTest(){
        Animal chicken = new Chicken();
        EarCorn earCorn = new EarCorn();
      //  Edible edibleEgg = new EdibleEgg();
        chicken.eat(earCorn);
        chicken.eat(earCorn);
        chicken.eat(earCorn);
      //  chicken.eat(edibleEgg);

        Integer expected = 3;
        Integer actual = chicken.getFoods().size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void personEatsPotato(){
      Person person = new Person();
      Vegetable potato = new Potato();
      Vegetable earCorn= new EarCorn();
      Edible egg = new EdibleEgg();
      person.eat(potato);
      person.eat(potato);
      person.eat(potato);
      person.eat(earCorn);
      person.eat(egg);

        Integer expected = 5;
        Integer actual = person.getFoods().size();

        Assert.assertEquals(expected,actual);
    }












}
