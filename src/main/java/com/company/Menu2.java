package com.company;

import java.util.Observable;
import java.util.Scanner;

public class Menu2 extends Menu implements MenuSelectie, MenuStart, MenuStatistiek {
    Scanner scanner = new Scanner(System.in);
    private String menu2;
    int aantalRaak = 0;

    Menu2(String menu2){
        this.menu2=menu2;
    }

    @Override
    public void StartMenu() {
        System.out.println("Welkom bij Dart Hunter");
        System.out.println();
        System.out.println("Bij Dart Hunter krijg je een random getal.");
        System.out.println("Vervolgens moet je in het vak van dat getal gooien om punten te krijgen");
        System.out.println("Je krijgt 3 kansen per beurt, de eerste tot 20 punten wint!");
        System.out.println();
        System.out.println("Start het spel? (ja/nee)");
        //SelectieMenuSpel();
    }

    @Override
    public void SelectieMenuSpel2() {
        Spel2 DartHunter = new Spel2("Dart Hunter");
        String antwoordJaNee = scanner.nextLine();
        switch(antwoordJaNee) {
            case "ja":
                int i = 0;
                boolean gewonnen = false;
                while (i == 0) {
                    System.out.println("Momenteel heb je " + aantalRaak + " punten");
                    System.out.println("---------------");
                    System.out.println("Je getal voor deze worp is: "+DartHunter.randomGetal());
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
        Spel2 DartHunter = new Spel2("Dart Hunter");
        int antwoordBeurt = scanner.nextInt();

        switch (antwoordBeurt) {
            case 1:
                DartHunter.allesMis();
                break;
            case 2:
                DartHunter.éénRaak();
                aantalRaak = aantalRaak + 1;
                break;
            case 3:
                DartHunter.tweeRaak();
                aantalRaak = aantalRaak + 2;
                break;
            case 4:
                DartHunter.allesRaak();
                aantalRaak = aantalRaak + 3;
                System.out.println("Woah je hebt perfect gegooid! Geweldig!");
                break;
        }
    }

    public String getMenu2(){return menu2;}
}
