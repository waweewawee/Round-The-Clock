package com.company.UnitTests;

import com.company.Beurt1;
import com.company.Darts;
import com.company.StatistiekGemiddeldeRaak;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MCDC {
    @Test
    public void isAllesRaak_allesRaak_true(){
    //Arrange
        Darts testWorp1 = new Darts(true);
        Darts testWorp2 = new Darts(true);
        Darts testWorp3 = new Darts(true);
        Beurt1 testAllesRaakGegooid1 = new Beurt1(testWorp1, testWorp2, testWorp3);
    //Act
        boolean verwachtResultaat1=testAllesRaakGegooid1.isAllesRaak(testAllesRaakGegooid1);
    //Assert
        assertTrue(verwachtResultaat1);
    }

    @Test
    public void isAllesRaak_Dart2en3raak_false(){
    //Arrange
        Darts testWorp4 = new Darts(false);
        Darts testWorp5 = new Darts(true);
        Darts testWorp6 = new Darts(true);
        Beurt1 testAllesRaakGegooid2 = new Beurt1(testWorp4, testWorp5, testWorp6);
    //Act
        boolean verwachtResultaat2=testAllesRaakGegooid2.isAllesRaak(testAllesRaakGegooid2);
    //Assert
        assertFalse(verwachtResultaat2);
    }

    @Test
    public void isAllesRaak_Dart1en3raak_false(){
    //Arrange
        Darts testWorp7 = new Darts(true);
        Darts testWorp8 = new Darts(false);
        Darts testWorp9 = new Darts(true);
        Beurt1 testAllesRaakGegooid3 = new Beurt1(testWorp7, testWorp8, testWorp9);
    //Act
        boolean verwachtResultaat3=testAllesRaakGegooid3.isAllesRaak(testAllesRaakGegooid3);
    //Assert
        assertFalse(verwachtResultaat3);
    }

    @Test
    public void isAllesRaak_Dart1en2raak_false(){
    //Arrange
        Darts testWorp10 = new Darts(true);
        Darts testWorp11 = new Darts(true);
        Darts testWorp12 = new Darts(false);
        Beurt1 testAllesRaakGegooid4 = new Beurt1(testWorp10, testWorp11, testWorp12);
    //Act
        boolean verwachtResultaat4=testAllesRaakGegooid4.isAllesRaak(testAllesRaakGegooid4);
    //Assert
        assertFalse(verwachtResultaat4);
    }
}
