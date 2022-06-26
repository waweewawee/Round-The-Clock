package com.company;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Spel> spellen = new ArrayList<>();

    public void addObserver(Spel spel){
        this.spellen.add(spel);
    }

    public void removeObserver(Spel spel){
        this.spellen.remove(spel);
    }

    public void notifyObservers(String arg){
        for(Spel spel : this.spellen){
            //spel.update(arg);
        }
    }
}
