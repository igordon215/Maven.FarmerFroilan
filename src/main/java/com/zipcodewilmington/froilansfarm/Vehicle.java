package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle implements Rideable, NoiseMaker {


    public Crop harvest(Crop crop) {
        return crop;
    }
}
