package com.company;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ThreadLocalRandom;

import static com.company.StatistiekSpel.gespeeldSpel;

public class Spel2 extends Spel implements Observer {
    private String naam;
    Darts observable = new Darts(false);

    Spel2(String naam){
        this.naam=naam;
        observable.addObserver(this);
        if(observable.isHetKoningsdag()){
            observable.setNotification("Je mag niet spelen op koningsdag");
        }
    }

    @Override
    public int randomGetal(){
        int randomGetal = ThreadLocalRandom.current().nextInt(1, 20);
        return randomGetal;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Het is Koningsdag, dan mag je niet spelen.");
        System.exit(0);
    }
}
