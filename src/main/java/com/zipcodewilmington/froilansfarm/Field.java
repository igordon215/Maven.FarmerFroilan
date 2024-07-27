package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field extends ArrayList<CropRow> {

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }

    private int fieldSize = 0;

}
