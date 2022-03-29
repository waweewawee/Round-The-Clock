package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom bij Round The Clock");
        System.out.println();
        System.out.println("Start het spel? (ja/nee)");

    String antwoordJaNee=scanner.nextLine();
    switch(antwoordJaNee){
        case "ja":
            int i=0;
            int aantalRaak=0;
            while(i==0){
                System.out.println("Hoe is je beurt gegaan?");
                System.out.println("(1) Alles mis :(");
                System.out.println("(2) Eén raak");
                System.out.println("(3) Twee raak");
                System.out.println("(4) Alles raak! :D");
                boolean gewonnen=false;
                if(!gewonnen){
                int antwoordBeurt=scanner.nextInt();

                switch(antwoordBeurt) {
                    case 1:
                        Spel spel1 = new Spel("alles mis");
                        spel1.allesMis();
                        break;
                    case 2:
                        Spel spel2 = new Spel("1 raak");
                        spel2.éénRaak();
                        aantalRaak+=1;
                        break;
                    case 3:
                        Spel spel3 = new Spel("2 raak");
                        spel3.tweeRaak();
                        aantalRaak+=2;
                        break;
                    case 4:
                        Spel spel4 = new Spel("3 raak");
                        spel4.allesRaak();
                        aantalRaak+=3;
                        break;
                }
                }
                if(aantalRaak>=20){
                    gewonnen=true;
                }
            }
            break;

        case "nee":
            scanner.close();
            break;
    }
    }
}
class Beurt{
    Dart dart1;
    Dart dart2;
    Dart dart3;

    Beurt(Dart dart1, Dart dart2, Dart dart3){

        this.dart1 = dart1;
        this.dart2 = dart2;
        this.dart3 = dart3;
    }

    public void allesMis(){
        Dart dart1 = new Dart(false);
        Dart dart2 = new Dart(false);
        Dart dart3 = new Dart(false);
    }
    public void éénRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(false);
        Dart dart3 = new Dart(false);
    }
    public void tweeRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(true);
        Dart dart3 = new Dart(false);
    }
    public void allesRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(true);
        Dart dart3 = new Dart(true);
    }


}

class Spel {
    Beurt beurt;
    String beurt1;
    Spel(String beurt1){
        this.beurt1=beurt1;
    }
    public Beurt allesMis(){
        Dart dart1 = new Dart(false);
        Dart dart2 = new Dart(false);
        Dart dart3 = new Dart(false);
        Beurt beurtTypeAllesMis = new Beurt(dart1, dart2, dart3);
        return beurtTypeAllesMis;
    }
    public Beurt éénRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(false);
        Dart dart3 = new Dart(false);
        Beurt beurtTypeEénRaak = new Beurt(dart1, dart2, dart3);
        return beurtTypeEénRaak;
    }
    public Beurt tweeRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(true);
        Dart dart3 = new Dart(false);
        Beurt beurtTypeTweeRaak = new Beurt(dart1, dart2, dart3);
        return beurtTypeTweeRaak;
    }
    public Beurt allesRaak(){
        Dart dart1 = new Dart(true);
        Dart dart2 = new Dart(true);
        Dart dart3 = new Dart(true);
        Beurt beurtTypeAllesRaak = new Beurt(dart1, dart2, dart3);
        return beurtTypeAllesRaak;
    }
}

class Dart{
    boolean hit;

    Dart(boolean hit){
        this.hit=hit;
    }

}

class BerekeningStatistiek{

}

class StatistiekSpel{

}
