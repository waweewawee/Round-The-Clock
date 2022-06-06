package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Spel2 extends Spel {
    private String naam;

    Spel2(String naam){
        this.naam=naam;
    }

    public int randomGetal(){
        int randomGetal = ThreadLocalRandom.current().nextInt(1, 20);
        return randomGetal;
    }
}
