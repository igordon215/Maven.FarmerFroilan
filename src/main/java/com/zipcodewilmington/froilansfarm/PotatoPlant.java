package com.zipcodewilmington.froilansfarm;

public class PotatoPlant extends Crop {

    @Override
    boolean hasBeenFertilized() {
        return this.hasBeenFertilized;
    }

    @Override
    boolean hasBeenHarvested() {
        return this.hasBeenHarvested;
    }

    @Override
    public Edible yield() {
        if ((this.hasBeenFertilized) && (this.hasBeenHarvested)) {
            System.out.println("Here's a potato for you!");
            return new Potato();
        } else {
            System.out.println("Not harvested and/or fertilized yet.");
            return null;
        }
    }
}
