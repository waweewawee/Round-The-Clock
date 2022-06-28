package com.company;

import java.util.Scanner;

public class StartKeuze {
    Menu1 menu1 = new Menu1("menu1");
    Menu2 menu2 = new Menu2("menu2");
    Scanner scanner = new Scanner(System.in);
    StartKeuze(){
        menu1.StartTekst();
        int antwoord= scanner.nextInt();
        if(antwoord==1){
            menu1.menuVolgorde();
        }
        else if(antwoord==2){
            menu2.menuVolgorde();
        }
    }
}
