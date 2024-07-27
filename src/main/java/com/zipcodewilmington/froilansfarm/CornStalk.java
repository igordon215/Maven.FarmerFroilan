package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop{

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
            System.out.println("Here's a corn for you!");
            return new Corn();
        } else {
            System.out.println("Not harvested and/or fertilized yet.");
            return null;
        }
    }
}
