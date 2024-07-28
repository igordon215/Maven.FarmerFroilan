package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Person<T extends Eater> implements Eater<Edible>, NoiseMaker{
    public String name ="";
    public ArrayList<Edible>foodEaten = new ArrayList<>();

    public Person(String name) {
        this.name=name;
    }

    public Person() {
    }

    @Override
    public void eat(Edible food) {
            foodEaten.add(food);
    }

    @Override
    public ArrayList<Edible> getFoods() {
        return foodEaten;
    }

    @Override
    public String makeNoise() {
        return "Hello!";
    }
}
