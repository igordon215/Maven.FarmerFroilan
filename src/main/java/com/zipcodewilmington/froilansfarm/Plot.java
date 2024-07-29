package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plot {
    public Farm froilansFarm;
    public FarmHouse farmHouse;
    public Field froilansFarmField;
    public ChickenCoop chickenCoop;
    public ChickenCoop chickenCoop1;
    public ChickenCoop chickenCoop2;
    public ChickenCoop chickenCoop3;
    public Stable stable;
    public Stable stable1;
    public Stable stable2;
    public Farmer froilan;
    public Pilot froilanda;
    public CropRow cornRow;
    public CropRow tomatoRow;
    public CropRow potatoRow;
    public CropRow potatoRow2;
    public CropRow cornRow2;
    public ArrayList<Edible> eggCarton = new ArrayList<>();

    public Farmer createNewFarmer(String farmersName) {
        return new Farmer(farmersName);
    }

    public Pilot createNewPilot(String pilotName) {
        return new Pilot(pilotName);
    }

    public void addToFarmHouse(Farmer farmer) {
        farmHouse.add(farmer);
    }
//    public void addCropRowToFroilandsFarmField(CropRow cropRow){
//        froilansFarmField.add(cropRow);
//    }

    public void adding5CropRowsToField() {
        cornRow = new CropRow();
        tomatoRow = new CropRow();
        potatoRow = new CropRow();
        potatoRow2 = new CropRow();
        cornRow2 = new CropRow();
        List<CropRow> anotherList = Arrays.asList(cornRow, tomatoRow, potatoRow, potatoRow2, cornRow2);
        froilansFarmField.add(cornRow);
        froilansFarmField.add(cornRow2);
        froilansFarmField.add(potatoRow2);
        froilansFarmField.add(potatoRow);
        froilansFarmField.add(tomatoRow);
        // System.out.println(froilansFarmField.size());
    }

    public void adding15ChickensTo4Coops() {
        chickenCoop = new ChickenCoop();
        chickenCoop1 = new ChickenCoop();
        chickenCoop2 = new ChickenCoop();
        chickenCoop3 = new ChickenCoop();
        for (int i = 0; i < 3; i++) {
            chickenCoop.add(new Chicken());
            chickenCoop1.add(new Chicken());
            chickenCoop2.add(new Chicken());
        }
        for (int i = 0; i < 6; i++) {
            chickenCoop3.add(new Chicken());
        }
    }

    public void adding10HorsesTo3Stables() {
        stable = new Stable();
        stable1 = new Stable();
        stable2 = new Stable();
        for (int i = 0; i < 3; i++) {
            stable.add(new Horse());
            stable1.add(new Horse());
            stable2.add(new Horse());
        }
        stable2.add(new Horse());
    }

    public void addToFroilanFarm() {
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

    public void setUp() {
        //Initializing People
        froilan = createNewFarmer("Froilan");
        froilanda = createNewPilot("Froilanda");
        froilansFarm = new Farm();
        farmHouse = new FarmHouse();
        addToFarmHouse(froilan);
        addToFarmHouse(froilanda);
        // Froilan's Farm :
        froilansFarmField = new Field();
        adding5CropRowsToField();
        adding15ChickensTo4Coops();
        adding10HorsesTo3Stables();
        addToFroilanFarm();
        //Initializing Vehicles
        FarmVehicle tractor = new Tractor();
        FarmVehicle tractor2 = new Tractor();
        AirCraft cropDuster = new CropDuster();
    }

     /*
    Make methods For:
    -morning routine
    -froilan riding horses
    -froilanda riding horses
    -feeding all horses
    -froilan breakfast
    -froilanda breakfast
    -froilan planting crops
     */

    public void morningRoutine(){
        froilanRidingHorses();
        froilandaRidingHorses();
        feedingAllHorses();
        froilanEatsBreakfast();
        froilandaEatsBreakfast();
        System.out.println("Froilan and Froiland morning routine complete.\n");
    }


    public String froilanRidingHorses(){
        for (Animal horse : stable) {
            froilan.mount(horse);
            froilan.dismount(horse);
        }
        for (Animal horse : stable1) {
            froilan.mount(horse);
            froilan.dismount(horse);
        }
        for (Animal horse : stable2) {
            froilan.mount(horse);
            froilan.dismount(horse);
        }
        System.out.println("Froilan rode all the horses in the stables.");
        return "Froilan rode all the horses in the stables.";
    }

    public String froilandaRidingHorses(){
        for (Animal horse : stable) {
            froilanda.mount(horse);
            froilanda.dismount(horse);
        }
        for (Animal horse : stable1) {
            froilanda.mount(horse);
            froilanda.dismount(horse);
        }
        for (Animal horse : stable2) {
            froilanda.mount(horse);
            froilanda.dismount(horse);
        }
        System.out.println("Froilanda rode all the horses in the stables.");
        return "Froilanda rode all the horses in the stables.";
    }

    public String feedingAllHorses(){
        for (Animal horse : stable) {
            horse.eat(new Corn());
            horse.eat(new Corn());
            horse.eat(new Corn());
        }
        for (Animal horse : stable1) {
            horse.eat(new Corn());
            horse.eat(new Corn());
            horse.eat(new Corn());
        }
        for (Animal horse : stable2) {
            horse.eat(new Corn());
            horse.eat(new Corn());
            horse.eat(new Corn());
        }
        System.out.println("Froilan fed all the horses 3 ears of corn.");
        return "Froilan fed all the horses 3 ears of corn.";
    }

    public void froilanEatsBreakfast(){
        froilan.eat(new Corn());
        froilan.eat(new Tomato());
        froilan.eat(new Tomato());
        for (int i = 0; i < 5; i++) {
            froilan.eat(new EdibleEgg());
        }
        System.out.println("Froilan ate a BIG breakfast!");
    }

    public void froilandaEatsBreakfast(){
        froilanda.eat(new Corn());
        froilanda.eat(new Corn());
        froilanda.eat(new Tomato());
        for (int i = 0; i < 2; i++) {
            froilanda.eat(new EdibleEgg());
        }
        System.out.println("Froilanda ate her breakfast.");
    }

    //SUNDAY ROUTINE!!!
    public void runSunday(){
        System.out.println(">>> Today is Sunday.");
        morningRoutine();
        froilandPlantingCrops();
    }

    public void froilandPlantingCrops(){
        froilan.plant(new CornStalk(), cornRow);
        froilan.plant(new TomatoPlant(), tomatoRow);
        froilan.plant(new PotatoPlant(), potatoRow);
        System.out.println("First, second, and third croprows have different crops planted! Good job, Froilan!\n");
    }

    //MONDAY ROUTINE!!!

    public void runMonday(){
        System.out.println(">>> Today is Monday.");
        morningRoutine();
        froilandaFlysCropDuster();
    }
    public void froilandaFlysCropDuster(){
        froilan.plant(new CornStalk(), cornRow);
        froilan.plant(new TomatoPlant(), tomatoRow);
        froilan.plant(new PotatoPlant(), potatoRow);
        froilanda.fly(new CropDuster());
        for (CropRow cropRow : froilansFarmField) {
            for (Crop crop : cropRow) {
                crop.setHasBeenFertilized(true);
            }
        }
        System.out.println("Froilanda flew the CropDuster and fertilized all croprows within the field! Nice flying!\n");
    }

    //TUESDAY ROUTINE!!!
    public void runTuesday(){
        System.out.println(">>> Today is Tuesday.");
        morningRoutine();
        froilanUsesTractor();
    }

    public void froilanUsesTractor() {
        Tractor tractor = new Tractor();
        froilan.plant(new CornStalk(), cornRow);
        froilan.plant(new TomatoPlant(), tomatoRow);
        froilan.plant(new PotatoPlant(), potatoRow);
        tractor.operate(froilansFarm);
        for (CropRow cropRow : froilansFarmField) {
            for (Crop crop : cropRow) {
                tractor.harvest(crop);
            }
        }
        System.out.println("Froilan harvests every crop on the field! Nice tractor-ing!\n");
    }

    //WEDNESDAY ROUTINE!!!
    public void runWednesday(){
        System.out.println(">>> Today is Wednesday.");
        morningRoutine();
        chickensYieldEggs();
    }
    public void chickensYieldEggs(){
        for (Chicken chicken : chickenCoop2){
            chicken.setHasBeenFertilized(false);
            Edible egg = chicken.yield();
            if (!(egg == null)) {
                eggCarton.add(egg);
            }
        }
        System.out.println("Some chickens laid eggs! Let's store them in the egg carton!\n");
    }

    //THURSDAY ROUTINE!!!
    public void runThursday(){
        System.out.println(">>> Today is Thursday.");
        morningRoutine();
        froilanEatsEggCarton();
    }
    public void froilanEatsEggCarton(){
        for (Chicken chicken : chickenCoop2){
            chicken.setHasBeenFertilized(false);
            Edible egg = chicken.yield();
            if (!(egg == null)) {
                eggCarton.add(egg);
            }
        }
        for (Edible egg : eggCarton){
            froilan.eat(egg);
        }
        eggCarton.clear();
        System.out.println("Froilan, you greedy farmer, you ate the whole egg carton!\n");
    }
    //FRIDAY ROUTINE!!!
    public void runFriday(){
        System.out.println(">>> Today is Friday.");
        morningRoutine();
        sallyArrivesAndRidesHorses();
    }

    public String sallyArrivesAndRidesHorses(){
        Farmer sally = new Farmer("Sally");
        farmHouse.add(sally);
        System.out.println("Sally has arrived!");

        for (Animal horse : stable) {
            sally.mount(horse);
            sally.dismount(horse);
        }
        for (Animal horse : stable1) {
            sally.mount(horse);
            sally.dismount(horse);
        }
        for (Animal horse : stable2) {
            sally.mount(horse);
            sally.dismount(horse);
        }
        System.out.println("Sally rode all the horses.\n");
        return "Sally rode all the horses.\n";
    }
    //SATURDAY ROUTINE!!!
    public void runSaturday(){
        System.out.println(">>> Today is Saturday.");
        morningRoutine();
        sallyPlantsPotatoes();
    }
    public void sallyPlantsPotatoes(){
        Farmer sally = new Farmer("Sally");
        farmHouse.add(sally);

        //Sally plants five potatoes
        for (int i = 0; i < 5; i++) {
            sally.plant(new PotatoPlant(), potatoRow2);
        }
        System.out.println("Sally plants five potato crops.\n");
    }




























//    public void run(){
//    }
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
