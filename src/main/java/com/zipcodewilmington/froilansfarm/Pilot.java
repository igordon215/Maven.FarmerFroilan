package com.zipcodewilmington.froilansfarm;

public class Pilot<T extends AirCraft> extends Farmer {

    public String fly(T airCraft){
        return "Im flying a cropDuster!";
    }

}
