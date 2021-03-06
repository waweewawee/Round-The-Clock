package com.company;

import java.util.Observable;
import java.util.Observer;

import static com.company.StatistiekSpel.gespeeldSpel;

public abstract class Spel implements Observer {
    public void allesRaak(){
        Darts dart1 = new Darts(true);
        Darts dart2 = new Darts(true);
        Darts dart3 = new Darts(true);
        Beurt1 beurt = new Beurt1(dart1, dart2, dart3);
        gespeeldSpel.add(beurt);
    }

    public void allesMis(){
        Darts dart1 = new Darts(false);
        Darts dart2 = new Darts(false);
        Darts dart3 = new Darts(false);
        Beurt1 beurt = new Beurt1(dart1, dart2, dart3);
        gespeeldSpel.add(beurt);
    }

    public void éénRaak(){
        Darts dart1 = new Darts(true);
        Darts dart2 = new Darts(false);
        Darts dart3 = new Darts(false);
        Beurt1 beurt = new Beurt1(dart1, dart2, dart3);
        gespeeldSpel.add(beurt);
    }

    public void tweeRaak(){
        Darts dart1 = new Darts(true);
        Darts dart2 = new Darts(true);
        Darts dart3 = new Darts(false);
        Beurt1 beurt = new Beurt1(dart1, dart2, dart3);
        gespeeldSpel.add(beurt);
    }

    public int randomGetal(){
        return 0;
    }
}
