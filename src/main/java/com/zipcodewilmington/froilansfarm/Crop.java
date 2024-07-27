package com.zipcodewilmington.froilansfarm;

public abstract class Crop {
    public boolean hasBeenFertilized = false;
    public boolean hasBeenHarvested = false;

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    abstract boolean hasBeenFertilized();
    abstract boolean hasBeenHarvested();



}
