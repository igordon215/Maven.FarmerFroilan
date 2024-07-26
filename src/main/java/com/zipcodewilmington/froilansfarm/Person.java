package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Person<T extends Eater> implements Eater<Edible>, NoiseMaker{
    public String name ="";
    public ArrayList<Edible>foodEaten = new ArrayList<>();
    @Override
    public void eat(Edible food) {
            foodEaten.add(food);
    }

    @Override
    public ArrayList<Edible> getFoods() {
        return foodEaten;
    }
}
