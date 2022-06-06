package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Spel2 {
    private String naam;

    Spel2(String naam){
        this.naam=naam;
    }

    public int randomGetal(){
        int randomGetal = ThreadLocalRandom.current().nextInt(1, 20);
        return randomGetal;
    }

    public void addBeurtRaak(){
        Darts dart1 = new Darts(true);
        Beurt2 beurt = new Beurt2(dart1);
        //StatistiekSpel.gespeeldSpel.add(beurt);
    }

    public void addBeurtMis(){
        Darts dart1 = new Darts(false);
        Beurt2 beurt = new Beurt2(dart1);
        //StatistiekSpel.gespeeldSpel.add(beurt);
    }
}
