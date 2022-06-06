package com.company;

import java.util.Scanner;

public class Menu2 implements MenuSelectie, MenuStart, MenuStatistiek {
    Scanner scanner = new Scanner(System.in);
    private String menu2;
    int aantalRaak = 0;
    Spel2 DartHunter = new Spel2("Dart Hunter");

    Menu2(String menu2){
        this.menu2=menu2;
        StartMenu();
    }

    @Override
    public void StartMenu() {
        System.out.println("Welkom bij Dart Hunter");
        System.out.println();
        System.out.println("Bij Dart Hunter krijg je een random getal.");
        System.out.println("Vervolgens moet je in het vak van dat getal gooien om een punt te krijgen.");
        System.out.println("Je krijgt 1 kans per beurt, de eerste tot 10 punten wint!");
        System.out.println();
        System.out.println("Start het spel? (ja/nee)");
        SelectieMenuSpel();
    }

    @Override
    public void SelectieMenuSpel() {
        String antwoordJaNee = scanner.nextLine();
        if (!antwoordJaNee.equals("ja") || !antwoordJaNee.equals("nee")) {
            System.out.println("Geen geldig antwoord, probeer opnieuw (ja of nee)");
        }
        switch(antwoordJaNee) {
            case "ja":
                int i = 0;
                boolean gewonnen = false;
                while (i == 0) {
                    System.out.println("Momenteel heb je " + aantalRaak + " punten");
                    System.out.println("---------------");
                    System.out.println("Je getal voor deze worp is: "+DartHunter.randomGetal());
                    System.out.println("(1) Raak!");
                    System.out.println("(2) Mis!");
                    if (!gewonnen) {
                        int antwoordBeurt = scanner.nextInt();

                        switch (antwoordBeurt) {
                            case 1:
                                DartHunter.addBeurtRaak();
                                aantalRaak = aantalRaak + 1;
                                break;
                            case 2:
                                DartHunter.addBeurtMis();
                                break;
                        }
                    }
                    if (aantalRaak >= 10) {
                        gewonnen = true;
                        i = 1;
                        PrintStatistiek();
                    }
                }
                scanner.close();
                break;

            case "nee":
                scanner.close();
                break;
        }
        scanner.close();
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

    public String getMenu2(){return menu2;}
}
