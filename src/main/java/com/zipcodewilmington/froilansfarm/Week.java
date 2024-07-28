package com.zipcodewilmington.froilansfarm;

public class Week {
    Plot plot = new Plot();


    public String runFullWeek(){
        plot.setUp();
        plot.runSunday();
        plot.runMonday();
        plot.runTuesday();
        plot.runWednesday();
        plot.runThursday();
        plot.runFriday();
        plot.runSaturday();
        return "Full week completed.";
    }

    //run the full week



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


}
