package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij Round The Clock");
        System.out.println();
        System.out.println("Start het spel? (ja/nee)");

    String antwoordJaNee = scanner.nextLine();
    switch(antwoordJaNee){
        case "ja":
            int i = 0;
            int aantalRaak = 0;
            boolean gewonnen=false;
            while(i==0){
                System.out.println("Momenteel heb je er "+aantalRaak+" al raak gegooid");
                System.out.println("---------------");
                System.out.println("Hoe is je beurt gegaan?");
                System.out.println("(1) Alles mis :(");
                System.out.println("(2) Eén raak");
                System.out.println("(3) Twee raak");
                System.out.println("(4) Alles raak! :D");
                if(!gewonnen) {
                    int antwoordBeurt = scanner.nextInt();

                    switch (antwoordBeurt) {
                        case 1:
                            Spel.allesMis();
                            break;
                        case 2:
                            Spel.éénRaak();
                            aantalRaak = aantalRaak + 1;
                            break;
                        case 3:
                            Spel.tweeRaak();
                            aantalRaak = aantalRaak + 2;
                            break;
                        case 4:
                            Spel.allesRaak();
                            aantalRaak = aantalRaak + 3;
                            break;
                    }
                }
                if(aantalRaak>=20){
                    gewonnen=true;
                    i=1;
                }
            }
            scanner.close();
            StatistiekSpel totaalBeurten = new StatistiekSpel(Spel.beurt.size(), aantalRaak);
            System.out.println("Je hebt gewonnen!");
            System.out.println();
            totaalBeurten.printUitslag();
            System.out.println();
            totaalBeurten = new StatistiekGemiddeldeRaak(Spel.beurt.size(), aantalRaak);
            totaalBeurten.printUitslag();
            break;

        case "nee":
            scanner.close();
            break;
    }
    }
}
class Beurt{
    private Dart worp1;
    private Dart worp2;
    private Dart worp3;

    Beurt(Dart worp1, Dart worp2, Dart worp3){
        this.worp1 = worp1;
        this.worp2 = worp2;
        this.worp3 = worp3;
    }

    public Dart getWorp1(){
        return worp1;
    }
    public Dart getWorp2(){
        return worp2;
    }
    public Dart getWorp3(){
        return worp3;
    }
}

class Spel {
    public static ArrayList<Beurt> beurt = new ArrayList<>();

    Spel(ArrayList<Beurt> beurt){
        this.beurt=beurt;
    }

    public static Beurt allesMis(){
        Dart dart1 = new Dart(false);
        Dart dart2 = new Dart(false);
        Dart dart3 = new Dart(false);
        Beurt beurtTypeAllesMis = new Beurt(dart1, dart2, dart3);
        beurt.add(beurtTypeAllesMis);
        return beurtTypeAllesMis;
    }
    public static Beurt éénRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(false);
        Dart dart3 = new Dart(false);
        Beurt beurtTypeEénRaak = new Beurt(dart1, dart2, dart3);
        beurt.add(beurtTypeEénRaak);
        return beurtTypeEénRaak;
    }
    public static Beurt tweeRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(true);
        Dart dart3 = new Dart(false);
        Beurt beurtTypeTweeRaak = new Beurt(dart1, dart2, dart3);
        beurt.add(beurtTypeTweeRaak);
        return beurtTypeTweeRaak;
    }
    public static Beurt allesRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(true);
        Dart dart3 = new Dart(true);
        Beurt beurtTypeAllesRaak = new Beurt(dart1, dart2, dart3);
        beurt.add(beurtTypeAllesRaak);
        return beurtTypeAllesRaak;
    }
}

class Dart{
    boolean dart;

    Dart(boolean dart){
        this.dart=dart;
    }

    public boolean getDart(){
        return dart;
    }

}

class StatistiekSpel{
    public int totaalBeurten;
    public int totaalRaak;

    StatistiekSpel(int totaalBeurten, int totaalRaak){
        this.totaalBeurten = totaalBeurten;
        this.totaalRaak=totaalRaak;
    }

    public void printUitslag(){
        System.out.println("Je hebt er dit spel "+totaalBeurten+" beurten over gedaan en daarmee heb je er "+totaalRaak+" raak gegooid");
    }

}

class StatistiekGemiddeldeRaak extends StatistiekSpel{
    StatistiekGemiddeldeRaak(int totaalBeurten, int totaalRaak) {
        super(totaalBeurten, totaalRaak);
    }
    @Override
    public void printUitslag(){
        double x = totaalBeurten;
        double y = totaalRaak;
        System.out.printf("Je hebt dit spel gemiddeld '%3.2f' Darts raak gegooid per beurt", gemiddeldRaakPerBeurt(x, y));
    }

    public double gemiddeldRaakPerBeurt(double beurten, double raak){
        double gemiddeldRaakPerBeurt=raak/beurten;
        return gemiddeldRaakPerBeurt;
    }
}

