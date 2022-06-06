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
                            Spel1.allesMis();
                            break;
                        case 2:
                            Spel1.éénRaak();
                            aantalRaak = aantalRaak + 1;
                            break;
                        case 3:
                            Spel1.tweeRaak();
                            aantalRaak = aantalRaak + 2;
                            break;
                        case 4:
                            Spel1.allesRaak();
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
            StatistiekSpel totaalBeurten = new StatistiekSpel(Spel1.beurt.size(), aantalRaak);
            System.out.println("Je hebt gewonnen!");
            System.out.println();
            totaalBeurten.printUitslag();
            System.out.println();
            totaalBeurten = new StatistiekGemiddeldeRaak(Spel1.beurt.size(), aantalRaak);
            totaalBeurten.printUitslag();
            break;

        case "nee":
            scanner.close();
            break;
    }
    }
}

