package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public interface Eater<T> {

   //ArrayList<Edible> foodsEaten = new ArrayList<>();

    void eat(T food);
    ArrayList<T> getFoods();
   //void storeFood();

}
