package com.company;

import java.util.Observable;
import java.util.Scanner;

public class Menu1 extends Menu implements MenuSelectie, MenuStart, MenuStatistiek {
    Scanner scanner = new Scanner(System.in);
    private String menu1;
    int aantalRaak = 0;

    Menu1(String menu1){
        this.menu1=menu1;
    }

    @Override
    public void StartMenu() {
        System.out.println("Welkom bij Round The Clock");
        System.out.println();
        System.out.println("Bij Round The Clock gooi je om de beurt 3 darts per beurt.");
        System.out.println("Van het begin tot het eind moet je in volgorde van 1 tot en met 20 gooien om te winnen");
        System.out.println();
        System.out.println("Start het spel? (ja/nee)");
        //SelectieMenuSpel();
    }

    @Override
    public void SelectieMenuSpel1() {
        String antwoordJaNee = scanner.nextLine();
        switch(antwoordJaNee) {
                case "ja":
                    int i = 0;
                    boolean gewonnen = false;
                    while (i == 0) {
                        System.out.println("Momenteel heb je er " + aantalRaak + " al raak gegooid");
                        System.out.println("---------------");
                        System.out.println("Hoe is je beurt gegaan?");
                        System.out.println("(1) Alles mis :(");
                        System.out.println("(2) Eén raak");
                        System.out.println("(3) Twee raak");
                        System.out.println("(4) Alles raak! :D");
                        if (!gewonnen) {
                            beurtMenu();
                        }
                        if (aantalRaak >= 20) {
                            gewonnen = true;
                            i = 1;
                        }}
                    break;
                case "nee":
                    break;
        }}

    public void beurtMenu(){
        Spel1 RoundTheClock = new Spel1("Round The Clock");
        int antwoordBeurt = scanner.nextInt();
        switch (antwoordBeurt) {
            case 1:
                RoundTheClock.allesMis();
                break;
            case 2:
                RoundTheClock.éénRaak();
                aantalRaak = aantalRaak + 1;
                break;
            case 3:
                RoundTheClock.tweeRaak();
                aantalRaak = aantalRaak + 2;
                break;
            case 4:
                RoundTheClock.allesRaak();
                aantalRaak = aantalRaak + 3;
                System.out.println("Woah je hebt perfect gegooid! Geweldig!");
                break;
        }
    }

    @Override
    public void PrintStatistiek() {
        StatistiekSpel totaalBeurten = new StatistiekSpel(StatistiekSpel.gespeeldSpel.size(), aantalRaak);
        System.out.println("Je hebt gewonnen!");
        System.out.println();
        totaalBeurten.printUitslag();
        System.out.println();
        totaalBeurten = new StatistiekGemiddeldeRaak(StatistiekSpel.gespeeldSpel.size(), aantalRaak);
        totaalBeurten.printUitslag();
    }

    public String getMenu1(){return menu1;}
}
