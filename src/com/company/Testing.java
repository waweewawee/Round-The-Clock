package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Testing {
    @Test
    public void testGemiddeldeRaak() {
        //Arrange
        StatistiekGemiddeldeRaak testGemiddeldeRaak = new StatistiekGemiddeldeRaak(12, 20);
        double verwachtResultaat = 1.66;
        //Act
        double testResultaat = testGemiddeldeRaak.gemiddeldRaakPerBeurt(12, 20);
        //Assert
        assertEquals(verwachtResultaat, testResultaat, 2);
    }

    @Test
    public void testAllesRaakGegooid() {
        //Arrange
        Dart testWorp1 = new Dart(true);
        Dart testWorp2 = new Dart(true);
        Dart testWorp3 = new Dart(true);
        Beurt testAllesRaakGegooid = new Beurt(testWorp1, testWorp2, testWorp3);
        //Act
        boolean verwachteResultaat1=testAllesRaakGegooid.getWorp1().getDart();
        boolean verwachteResultaat2=testAllesRaakGegooid.getWorp2().getDart();
        boolean verwachteResultaat3=testAllesRaakGegooid.getWorp3().getDart();
        //Assert
        assertTrue(verwachteResultaat1);
        assertTrue(verwachteResultaat2);
        assertTrue(verwachteResultaat3);
    }

    @Test
    public void testBeurtenGespeeld() {
        //Arrange
        ArrayList<Beurt> testBeurtenGespeeld = new ArrayList<>();
        int verwachteResultaat=4;
        //Act
        testBeurtenGespeeld.add(Spel.allesMis());
        testBeurtenGespeeld.add(Spel.éénRaak());
        testBeurtenGespeeld.add(Spel.tweeRaak());
        testBeurtenGespeeld.add(Spel.allesRaak());
        int testResultaat = testBeurtenGespeeld.size();
        //Assert
        assertEquals(verwachteResultaat, testResultaat);
    }
}
