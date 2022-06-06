package com.company;

class StatistiekGemiddeldeRaak extends StatistiekSpel {
    StatistiekGemiddeldeRaak(int totaalBeurten, int totaalRaak) {
        super(totaalBeurten, totaalRaak);
    }

    @Override
    public void printUitslag() {
        double x = totaalBeurten;
        double y = totaalRaak;
        System.out.printf("Je hebt dit spel gemiddeld %3.1f Darts raak gegooid per beurt", gemiddeldRaakPerBeurt(x, y));
    }

    public double gemiddeldRaakPerBeurt(double beurten, double raak) {
        double gemiddeldRaakPerBeurt = raak / beurten;
        return gemiddeldRaakPerBeurt;
    }

    public String wegingPrestatie(double gemiddeldRaak, int duurMinuten, boolean plezier, boolean herhaalbaar) {
        String result = "Je hebt niet gegooid";
        if (gemiddeldRaak <= 3.0) {
            result = "Geweldig gegooid!";
        }
        if (gemiddeldRaak <= 2.0) {
            result = "Prima gegooid";
        }
        if (gemiddeldRaak <= 1.0) {
            result = "Matig gegooid";
        }
        result += " en ";
        if (duurMinuten < 15) {
            result += "snel gespeeld";
        } else {
            result += "de tijd genomen";
        }
        result += " en ";
        if (plezier) {
            result += "het was leuk";
        } else {
            result += "het was niet leuk";
        }
        result += " en ";
        if (herhaalbaar) {
            result += "het is voor herhaling vatbaar";
        } else {
            result += "het is niet voor herhaling vatbaar";
        }
        return result;
    }

}
