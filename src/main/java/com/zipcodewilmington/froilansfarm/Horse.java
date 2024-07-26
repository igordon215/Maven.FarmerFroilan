package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Horse extends Animal {
    private ArrayList<Vegetable>foodsEaten = new ArrayList<>();


    @Override
    public void eat(Vegetable food) {
        foodsEaten.add(food);

    }

    @Override
    public ArrayList<Vegetable> getFoods() {
        return this.foodsEaten;
    }

}