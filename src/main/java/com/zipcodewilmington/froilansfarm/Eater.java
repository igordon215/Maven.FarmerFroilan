package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public interface Eater<T extends Edible> {

    ArrayList<Edible> foodsEaten = new ArrayList<>();

    void eat(Edible edible);

}
