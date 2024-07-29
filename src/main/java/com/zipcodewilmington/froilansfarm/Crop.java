package com.zipcodewilmington.froilansfarm;

public abstract class Crop implements Produce {
    public boolean hasBeenFertilized = false;
    public boolean hasBeenHarvested = false;

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    abstract boolean hasBeenFertilized();
    abstract boolean hasBeenHarvested();



}
