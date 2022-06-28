package com.company;

public abstract class Menu {
    public void menuVolgorde(){
        StartMenu();
        SelectieMenuSpel();
        PrintStatistiek();
    }

    public void StartTekst(){
        System.out.println("Welk spel wilt u spelen?");
        System.out.println("Selectie: ");
        System.out.println("1. Round The Clock");
        System.out.println("2. Dart Hunter");
    }

    public void StartMenu(){}
    public void SelectieMenuSpel(){}
    public void PrintStatistiek(){

    }
}
