package com.company;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Spel1 extends Spel implements Observer {
    private String naam;
    Darts observable = new Darts(false);

    Spel1(String naam){
        this.naam=naam;
        observable.addObserver(this);
        if(observable.isHetKoningsdag()){
            observable.setNotification("Je mag niet spelen op koningsdag");
        }
    }

    public String getNaam(){return naam;}

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Het is Koningsdag, dan mag je niet spelen.");
        System.exit(0);
    }

}
