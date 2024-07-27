package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {

    @Override
    public String makeNoise() {
        return "Vroom vroom!";
    }

    @Override
    public String operate(Farm farm) {
        return "currently operating in tractor Farm";
    }
}
