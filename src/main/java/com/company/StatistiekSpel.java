package com.company;

import java.util.ArrayList;

class StatistiekSpel {
    public int totaalBeurten;
    public int totaalRaak;
    public static ArrayList<Beurt1> gespeeldSpel = new ArrayList<>();

    StatistiekSpel(int totaalBeurten, int totaalRaak) {
        this.totaalBeurten = totaalBeurten;
        this.totaalRaak = totaalRaak;
    }

    public void printUitslag() {
        System.out.println("Je hebt er dit spel " + totaalBeurten + " beurten over gedaan en daarmee heb je er " + totaalRaak + " raak gegooid");
    }

}
