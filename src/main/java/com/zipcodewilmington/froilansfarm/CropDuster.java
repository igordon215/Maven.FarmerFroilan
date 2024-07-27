package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements AirCraft  {
    @Override
    public String makeNoise() {
        return "Cropduster making noise.";
    }

    @Override
    public String fly() {
        return "Cropduster is flying.";
    }

    @Override
    public String operate(Farm farm) {
        return "CropDuster operating in a farm.";
    }
    public CropRow fertilize(CropRow cropRow){
        for(Crop c: cropRow){
            c.setHasBeenFertilized(true);
        }
        return cropRow;
    }
}
