package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plot {
   public Farm froilansFarm;
   public FarmHouse farmHouse;
   public Field froilansFarmField;

    public Farmer createNewFarmer(String farmersName){
        return new Farmer(farmersName);
    }
    public Pilot createNewPilot(String pilotName){
        return new Pilot(pilotName);
    }
    public FarmHouse addToFarmHouse(Farmer farmer){
        farmHouse.add(farmer);
    }
    public Field addCropRowToFroilandsFarmField(CropRow cropRow){
        froilansFarmField.add(cropRow);
    }

    public void adding5CropRowsToField(){
        CropRow cornRow = new CropRow();
        CropRow tomatoRow = new CropRow();
        CropRow potatoRow = new CropRow();
        CropRow potatoRow2 = new CropRow();
        CropRow cornRow2 = new CropRow();
        List<CropRow> anotherList = Arrays.asList(cornRow, tomatoRow, potatoRow, potatoRow2, cornRow2);
        froilansFarmField.add(cornRow);
        froilansFarmField.add(cornRow2);
        froilansFarmField.add(potatoRow2);
        froilansFarmField.add(potatoRow);
        froilansFarmField.add(tomatoRow);
       // System.out.println(froilansFarmField.size());
    }

   public void setUp() {
         Farmer froilan = createNewFarmer("Froilan");
         Pilot froilanda = createNewPilot("Froilanda");

        froilansFarm = new Farm();
        farmHouse = new FarmHouse();
        addToFarmHouse(froilan);
        addToFarmHouse(froilanda);
        // Froilans Farm :
        froilansFarmField = new Field();
        adding5CropRowsToField();



        ChickenCoop chickenCoop = new ChickenCoop();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        for(int i =0; i< 3; i++){
            chickenCoop.add(new Chicken());
            chickenCoop1.add(new Chicken());
            chickenCoop2.add(new Chicken());
        }
        for(int i =0 ; i <6; i++){
            chickenCoop3.add(new Chicken());
        }

        Stable stable = new Stable();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        for(int i=0; i< 3; i++){
            stable.add(new Horse());
            stable1.add(new Horse());
            stable2.add(new Horse());
        }
        stable2.add(new Horse());


        FarmVehicle tractor = new Tractor();
        FarmVehicle tractor2 = new Tractor();

        AirCraft cropDuster = new CropDuster();

        froilansFarm.add(froilansFarmField);
        froilansFarm.add(chickenCoop);
        froilansFarm.add(chickenCoop1);
        froilansFarm.add(chickenCoop2);
        froilansFarm.add(chickenCoop3);
        froilansFarm.add(stable);
        froilansFarm.add(stable1);
        froilansFarm.add(stable2);
        froilansFarm.add(farmHouse);
}
    public void run(){

    }




}


//
//public void setUp() {
//    Farmer froilan = new Farmer("Froilan");
//    Pilot froilanda = new Pilot("Froilanda");
//
//    Farm froilansFarm = new Farm();
//    FarmHouse farmHouse = new FarmHouse();
//    farmHouse.add(froilan);
//    farmHouse.add(froilanda);
//    // Froilans Farm :
//    Field froilansFarmField = new Field();
//    CropRow cornRow = new CropRow();
//    CropRow tomatoRow = new CropRow();
//    CropRow potatoRow = new CropRow();
//    CropRow potatoRow2 = new CropRow();
//    CropRow cornRow2 = new CropRow();
//    List<CropRow> anotherList = Arrays.asList(cornRow, tomatoRow, potatoRow, potatoRow2, cornRow2);
//    froilansFarmField.add(cornRow);
//    froilansFarmField.add(cornRow2);
//    froilansFarmField.add(potatoRow2);
//    froilansFarmField.add(potatoRow);
//    froilansFarmField.add(tomatoRow);
//    System.out.println(froilansFarmField.size());
//
//
//    ChickenCoop chickenCoop = new ChickenCoop();
//    ChickenCoop chickenCoop1 = new ChickenCoop();
//    ChickenCoop chickenCoop2 = new ChickenCoop();
//    ChickenCoop chickenCoop3 = new ChickenCoop();
//    for(int i =0; i< 3; i++){
//        chickenCoop.add(new Chicken());
//        chickenCoop1.add(new Chicken());
//        chickenCoop2.add(new Chicken());
//    }
//    for(int i =0 ; i <6; i++){
//        chickenCoop3.add(new Chicken());
//    }
//
//    Stable stable = new Stable();
//    Stable stable1 = new Stable();
//    Stable stable2 = new Stable();
//    for(int i=0; i< 3; i++){
//        stable.add(new Horse());
//        stable1.add(new Horse());
//        stable2.add(new Horse());
//    }
//    stable2.add(new Horse());
//
//
//    FarmVehicle tractor = new Tractor();
//    FarmVehicle tractor2 = new Tractor();
//
//    AirCraft cropDuster = new CropDuster();
//
//    froilansFarm.add(froilansFarmField);
//    froilansFarm.add(chickenCoop);
//    froilansFarm.add(chickenCoop1);
//    froilansFarm.add(chickenCoop2);
//    froilansFarm.add(chickenCoop3);
//    froilansFarm.add(stable);
//    froilansFarm.add(stable1);
//    froilansFarm.add(stable2);
//    froilansFarm.add(farmHouse);
//}
