package com.company;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int i=0;

        System.out.println("Welkom bij Round The Clock");
        System.out.println();
        System.out.println("Start het spel? (ja/nee)");

    String antwoord=scanner.nextLine();
    switch(antwoord){

    }
    while(i==0){
        System.out.println();
    }
    }
}
class Beurt{
    Dart darts;

    Beurt(Dart darts){
        this.darts = darts;
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

class Spel{

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