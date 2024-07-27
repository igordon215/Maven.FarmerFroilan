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
}
