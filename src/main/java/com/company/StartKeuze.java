package com.company;

import java.util.Scanner;

public class StartKeuze {
    Menu1 menu1 = new Menu1("menu1");
    Menu2 menu2 = new Menu2("menu2");
    Scanner scanner = new Scanner(System.in);
    StartKeuze(){
        System.out.println("Welk spel wilt u spelen?");
        System.out.println("Selectie: ");
        System.out.println("1. Round The Clock");
        System.out.println("2. Dart Hunter");
        int antwoord= scanner.nextInt();
        if(antwoord==1){
            menu1.menuVolgorde();
        }
        else if(antwoord==2){
            menu2.menuVolgorde();
        }
    }
}
