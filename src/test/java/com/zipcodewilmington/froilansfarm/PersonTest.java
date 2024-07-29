package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testPersonName(){
        String name = "dan";
        Person person = new Person("dan");
        String actual = person.name;
        Assert.assertEquals(name, actual);
    }

    @Test
    public void testPersonMakesNoise(){
        String noise = "Hello!";
        Person person = new Person("dan");
        String actual = person.makeNoise();
        Assert.assertEquals(noise, actual);
    }




}
