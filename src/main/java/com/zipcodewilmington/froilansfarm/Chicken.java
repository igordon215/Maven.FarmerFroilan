package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Chicken extends Animal {
    private ArrayList<Vegetable>foodsEaten = new ArrayList<>();

//    @Override
//    public void eat(T food) {
//        foodsEaten.add(food);
//    }

    @Override
    public void eat(Vegetable food) {
        foodsEaten.add(food);
    }

    @Override
    public ArrayList<Vegetable> getFoods() {
        return foodsEaten;
    }

}
