package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal {
    @Override
    public void eat(Edible edible) {
        foodsEaten.add(edible);
    }
}
