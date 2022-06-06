package com.company;

import java.util.ArrayList;
import java.util.Observable;

import static com.company.StatistiekSpel.gespeeldSpel;

public class Spel1 extends Spel {
    private Menu2 notification;
    private String naam;

    Spel1(String naam){
        this.naam=naam;
    }

    public String getNaam(){return naam;}

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
        notification=(Menu2) o;
        System.out.println("Woah je hebt perfect gegooid! Geweldig!");
    }
}