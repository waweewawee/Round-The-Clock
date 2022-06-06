package com.company;

class StatistiekSpel {
    public int totaalBeurten;
    public int totaalRaak;

    StatistiekSpel(int totaalBeurten, int totaalRaak) {
        this.totaalBeurten = totaalBeurten;
        this.totaalRaak = totaalRaak;
    }

    public void printUitslag() {
        System.out.println("Je hebt er dit spel " + totaalBeurten + " beurten over gedaan en daarmee heb je er " + totaalRaak + " raak gegooid");
    }

}
