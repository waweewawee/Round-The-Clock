package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu1 roundTheClock = new Menu1("gestartRoundTheClock");
        Menu2 dartHunter = new Menu2("gestartDartHunter");
        roundTheClock.StartTekst();
        int antwoord=scanner.nextInt();
        switch(antwoord){
            case 1:
                roundTheClock.StartMenu();
                break;
            case 2:
                dartHunter.StartMenu();
                break;
        }}}

