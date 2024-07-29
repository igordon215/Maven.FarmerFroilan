package com.zipcodewilmington.froilansfarm;

public class Pilot extends Farmer {

    public Pilot(String name) {
        super(name);
    }

    public Pilot() {
    }

    public String fly(AirCraft airCraft){
        return "Im flying a cropDuster!";
    }

}
