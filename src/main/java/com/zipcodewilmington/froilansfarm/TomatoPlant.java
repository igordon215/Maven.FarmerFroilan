package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {

    @Override
    boolean hasBeenFertilized() {
        return this.hasBeenFertilized;
        //return true;
    }

    @Override
    boolean hasBeenHarvested() {
        return this.hasBeenHarvested;
    }

    @Override
    public Edible yield() {
        if ((this.hasBeenFertilized) && (this.hasBeenHarvested)) {
            System.out.println("Here's a tomato for you!");
            return new Tomato();
        } else {
            System.out.println("Not harvested and/or fertilized yet.");
            return null;
        }
    }
}
