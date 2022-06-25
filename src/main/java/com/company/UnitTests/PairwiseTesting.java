package com.company.UnitTests;

import com.company.StatistiekGemiddeldeRaak;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PairwiseTesting {
    @Test
    public void wegingPrestatie_05en10enWelWel_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0, 0);
        String testResultaat1 = "Matig gegooid en snel gespeeld en het was leuk en het is voor herhaling vatbaar";
        //Act
        String verwachtResultaat1 = testWeging.wegingPrestatie(0.5, 10, true, true);
        //Assert
        assertEquals(testResultaat1, verwachtResultaat1);
    }
    @Test
    public void wegingPrestatie_05en25enNietNiet_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0, 0);
        String testResultaat2 = "Matig gegooid en de tijd genomen en het was niet leuk en het is niet voor herhaling vatbaar";
        //Act
        String verwachtResultaat2 = testWeging.wegingPrestatie(0.5, 25, false, false);
        //Assert
        assertEquals(testResultaat2, verwachtResultaat2);
    }
    @Test
    public void wegingPrestatie_15en10enNietWel_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0, 0);
        String testResultaat3 = "Prima gegooid en snel gespeeld en het was niet leuk en het is voor herhaling vatbaar";
        //Act
        String verwachtResultaat3 = testWeging.wegingPrestatie(1.5, 10, false, true);
        //Assert
        assertEquals(testResultaat3, verwachtResultaat3);
    }
    @Test
    public void wegingPrestatie_15en25enWelNiet_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0, 0);
        String testResultaat4 = "Prima gegooid en de tijd genomen en het was leuk en het is niet voor herhaling vatbaar";
        //Act
        String verwachtResultaat4 = testWeging.wegingPrestatie(1.5, 25, true, false);
        //Assert
        assertEquals(testResultaat4, verwachtResultaat4);
    }
    @Test
    public void wegingPrestatie_25en10enWelNiet_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0, 0);
        String testResultaat5 = "Geweldig gegooid! en snel gespeeld en het was leuk en het is niet voor herhaling vatbaar";
        //Act
        String verwachtResultaat5 = testWeging.wegingPrestatie(2.5, 10, true, false);
        //Assert
        assertEquals(testResultaat5, verwachtResultaat5);
    }
    @Test
    public void wegingPrestatie_25en25enNietWel_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0, 0);
        String testResultaat6 = "Geweldig gegooid! en de tijd genomen en het was niet leuk en het is voor herhaling vatbaar";
        //Act
        String verwachtResultaat6 = testWeging.wegingPrestatie(2.5, 25, false, true);
        //Assert
        assertEquals(testResultaat6, verwachtResultaat6);
    }
}
