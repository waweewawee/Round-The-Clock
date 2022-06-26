package com.company;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ThreadLocalRandom;

import static com.company.StatistiekSpel.gespeeldSpel;

public class Spel2 extends Spel implements Observer {
    private String naam;
    Darts darts = new Darts(false);

    Spel2(String naam){
        this.naam=naam;
        //darts.addObserver(this);
    }

    public int randomGetal(){
        int randomGetal = ThreadLocalRandom.current().nextInt(1, 20);
        return randomGetal;
    }

    @Override
    public void allesRaak(){
        Darts dart1 = new Darts(true);
        Darts dart2 = new Darts(true);
        Darts dart3 = new Darts(true);
        Beurt1 beurt = new Beurt1(dart1, dart2, dart3);
        gespeeldSpel.add(beurt);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Het is Koningsdag, dan mag je niet spelen.");
        System.exit(0);
    }
}
