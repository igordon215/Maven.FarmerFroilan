package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce<Edible> {
    private ArrayList<Vegetable>foodsEaten = new ArrayList<>();

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    private boolean hasBeenFertilized = true;

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

    @Override
    public String makeNoise() {
        return "Cluck!";
    }


    @Override
    public Edible yield() {
        if(!this.hasBeenFertilized) {
            System.out.println("You get an edible egg!");
            return new EdibleEgg();
        }
        System.out.println("No edible egg for you.");
        return null;
    }
}
