package com.company;

import java.util.Scanner;

public abstract class Menu {
    public void menuVolgorde(Menu1 menu1, Menu2 menu2){
        Scanner scanner = new Scanner(System.in);
        Menu1 menu11 = new Menu1("gestartRoundTheClock");
        Menu2 menu21 = new Menu2("gestartDartHunter");
        StartTekst();
        int antwoord = scanner.nextInt();
        if(antwoord==1) {
            menu1.StartMenu();
            if (menu1.getMenu1() == menu11.getMenu1()) {
                menu1.SelectieMenuSpel1();
                menu1.PrintStatistiek();
            }
        }
        else if (antwoord == 2) {
            menu2.StartMenu();
            if (menu2.getMenu2() == menu21.getMenu2()) {
                menu2.SelectieMenuSpel2();
            }
        }
    }

    public void StartMenu(){}

    public void StartTekst(){
        System.out.println("Welk spel wilt u spelen?");
        System.out.println("Selectie: ");
        System.out.println("1. Round The Clock");
        System.out.println("2. Dart Hunter");
    }

    public void SelectieMenuSpel1(){}
    public void SelectieMenuSpel2(){}
    public void beurtMenu(){}
    public void PrintStatistiek(){

    }
}
