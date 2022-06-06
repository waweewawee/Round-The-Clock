package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> spellen = new ArrayList<>();
        spellen.add("Round The Clock");
        spellen.add("Dart Hunter");
        System.out.println("Welk spel wilt u spelen?");
        System.out.println("Selectie: ");
        System.out.println("1. "+spellen.get(0));
        System.out.println("2. "+spellen.get(1));
        int antwoord=scanner.nextInt();
        switch(antwoord){
            case 1:
                Menu1 roundTheClock = new Menu1("gestartRoundTheClock");
                roundTheClock.StartMenu();
                break;
            case 2:
                Menu2 dartHunter = new Menu2("gestartDartHunter");
                dartHunter.StartMenu();
                break;

        }
    }
}

