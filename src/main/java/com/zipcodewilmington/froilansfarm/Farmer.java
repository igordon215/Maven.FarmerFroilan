package com.zipcodewilmington.froilansfarm;

public class Farmer implements Rider, Botanist{

    @Override
    public String mount(Rideable rideable) {
        return "Successfully mounted!";
    }

    @Override
    public String dismount(Rideable rideable) {
        return "Successfully dismounted!";
    }

    public String mount(Animal animal) {
        if (animal instanceof Rideable) {
            return mount((Rideable) animal);
        } else {
            return "This animal cannot be ridden.";
        }
    }

    public String dismount(Animal animal) {
        if (animal instanceof Rideable) {
            return dismount((Rideable) animal);
        } else {
            return "This animal cannot be ridden.";
        }
    }

    @Override
    public void plant(Crop crop, CropRow row) {
        row.add(crop);
    }
}
