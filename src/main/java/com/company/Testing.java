package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.*;

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
    /* Fixen voor OPT3 Testopdracht herkansing
    @Test
    public void testIsAllesRaakGegooid() {
        //Arrange
        Darts testWorp1 = new Darts(true);
        Darts testWorp2 = new Darts(true);
        Darts testWorp3 = new Darts(true);
        Beurt1 testAllesRaakGegooid1 = new Beurt1(testWorp1, testWorp2, testWorp3);
        Darts testWorp4 = new Darts(false);
        Darts testWorp5 = new Darts(true);
        Darts testWorp6 = new Darts(true);
        Beurt1 testAllesRaakGegooid2 = new Beurt1(testWorp4, testWorp5, testWorp6);
        Darts testWorp7 = new Darts(true);
        Darts testWorp8 = new Darts(false);
        Darts testWorp9 = new Darts(true);
        Beurt1 testAllesRaakGegooid3 = new Beurt1(testWorp7, testWorp8, testWorp9);
        Darts testWorp10 = new Darts(true);
        Darts testWorp11 = new Darts(true);
        Darts testWorp12 = new Darts(false);
        Beurt1 testAllesRaakGegooid4 = new Beurt1(testWorp10, testWorp11, testWorp12);
        //Act
        boolean verwachtResultaat1=testAllesRaakGegooid1.isAllesRaak(testAllesRaakGegooid1);
        boolean verwachtResultaat2=testAllesRaakGegooid2.isAllesRaak(testAllesRaakGegooid2);
        boolean verwachtResultaat3=testAllesRaakGegooid3.isAllesRaak(testAllesRaakGegooid3);
        boolean verwachtResultaat4=testAllesRaakGegooid4.isAllesRaak(testAllesRaakGegooid4);
        //Assert
        assertTrue(verwachtResultaat1);
        assertFalse(verwachtResultaat2);
        assertFalse(verwachtResultaat3);
        assertFalse(verwachtResultaat4);
    }

    @Test
    public void testWegingGemiddeldeRaak(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat1="Matig gegooid en snel gespeeld en het was leuk en het is niet voor herhaling vatbaar";
        String testResultaat2="Matig gegooid en de tijd genomen en het was niet leuk en het is voor herhaling vatbaar";
        String testResultaat3="Prima gegooid en snel gespeeld en het was leuk en het is niet voor herhaling vatbaar";
        String testResultaat4="Prima gegooid en de tijd genomen en het was niet leuk en het is voor herhaling vatbaar";
        String testResultaat5="Geweldig gegooid! en snel gespeeld en het was leuk en het is niet voor herhaling vatbaar";
        String testResultaat6="Geweldig gegooid! en de tijd genomen en het was niet leuk en het is voor herhaling vatbaar";
        //Act
        String verwachtResultaat1=testWeging.wegingPrestatie(0.5, 10, true, false);
        String verwachtResultaat2=testWeging.wegingPrestatie(0.5, 20, false, true);
        String verwachtResultaat3=testWeging.wegingPrestatie(1.5, 10, true, false);
        String verwachtResultaat4=testWeging.wegingPrestatie(1.5, 20, false, true);
        String verwachtResultaat5=testWeging.wegingPrestatie(2.5, 10, true, false);
        String verwachtResultaat6=testWeging.wegingPrestatie(2.5, 20, false, true);
        //Assert
        assertEquals(testResultaat1, verwachtResultaat1);
        assertEquals(testResultaat2, verwachtResultaat2);
        assertEquals(testResultaat3, verwachtResultaat3);
        assertEquals(testResultaat4, verwachtResultaat4);
        assertEquals(testResultaat5, verwachtResultaat5);
        assertEquals(testResultaat6, verwachtResultaat6);
    }

    @Test
    public void testBeurtenGespeeld() {
        //Arrange
        ArrayList<Beurt> testBeurtenGespeeld = new ArrayList<>();
        int verwachteResultaat=4;
        //Act
        testBeurtenGespeeld.add(Spel1.allesMis());
        testBeurtenGespeeld.add(Spel1.éénRaak());
        testBeurtenGespeeld.add(Spel1.tweeRaak());
        testBeurtenGespeeld.add(Spel1.allesRaak());
        int testResultaat = testBeurtenGespeeld.size();
        //Assert
        assertEquals(verwachteResultaat, testResultaat);
    }*/
}
