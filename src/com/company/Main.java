package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

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
            StatistiekSpel totaalBeurten = new StatistiekSpel(Spel.beurt.size(), 20);
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
    public Dart getDart2(){
        return worp2;
    }
    public Dart getDart3(){
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

class BerekeningStatistiek{

}

class StatistiekSpel{
    private int totaalBeurten;
    private int totaalRaak;

    StatistiekSpel(int totaalBeurten, int totaalRaak){
        this.totaalBeurten = totaalBeurten;
        this.totaalRaak=totaalRaak;
    }
    public void statistiekGemiddeldeRaak(){

    }

    public void printUitslag(){
        System.out.println("Je hebt gewonnen!");
        System.out.println("Je hebt er dit spel "+totaalBeurten+" beurten over gedaan en daarmee heb je er "+totaalRaak+" raak gegooid");
    }

}

class Testing{
    @Test
    public void testGemiddeldeRaak(){

    }

    @Test
    public void testRaakGegooid(){

    }

    @Test void beurtGespeeld(){

    }
}
