package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {
//    private boolean isFertilized = false;
//    private boolean isHarvested = false;
//
//    public boolean isFertilized() {
//        return isFertilized;
//    }
//
//    public void setFertilized(boolean fertilized) {
//        isFertilized = fertilized;
//    }
//
//    public boolean isHarvested() {
//        return isHarvested;
//    }
//
//    public void setHarvested(boolean harvested) {
//        isHarvested = harvested;
//    }

    @Override
    boolean hasBeenFertilized() {
        return this.hasBeenFertilized;
        //return true;
    }

    @Override
    boolean hasBeenHarvested() {
        return this.hasBeenHarvested;
    }
}
