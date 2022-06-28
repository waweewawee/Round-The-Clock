package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Main {
    public static void main(String[] args) {
        Menu1 roundTheClock = new Menu1("gestartRoundTheClock");
        Menu2 dartHunter = new Menu2("gestartDartHunter");
        roundTheClock.menuVolgorde(roundTheClock, dartHunter);
        }
}


