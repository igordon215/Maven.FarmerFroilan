package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements AirCraft  {
    @Override
    public String makeNoise() {
        return "Zoom!...";
    }

    @Override
    public String fly() {
        return "Currently flying...";
    }

    @Override
    public String operate(Farm farm) {
        return "Currently operating CropDuster.";
    }


    public CropRow fertilize(CropRow cropRow){
        for(Crop c: cropRow){
            c.setHasBeenFertilized(true);
        }
        return cropRow;
    }
}
