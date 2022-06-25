package com.company.UnitTests;

import com.company.StatistiekGemiddeldeRaak;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PairwiseTesting {

    @Test
    public void testWegingGemiddeldeRaak() {
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0, 0);
        String testResultaat1 = "Matig gegooid en snel gespeeld en het was leuk en het is niet voor herhaling vatbaar";
        String testResultaat2 = "Matig gegooid en de tijd genomen en het was niet leuk en het is voor herhaling vatbaar";
        String testResultaat3 = "Prima gegooid en snel gespeeld en het was leuk en het is niet voor herhaling vatbaar";
        String testResultaat4 = "Prima gegooid en de tijd genomen en het was niet leuk en het is voor herhaling vatbaar";
        String testResultaat5 = "Geweldig gegooid! en snel gespeeld en het was leuk en het is niet voor herhaling vatbaar";
        String testResultaat6 = "Geweldig gegooid! en de tijd genomen en het was niet leuk en het is voor herhaling vatbaar";
        //Act
        String verwachtResultaat1 = testWeging.wegingPrestatie(0.5, 10, true, false);
        String verwachtResultaat2 = testWeging.wegingPrestatie(0.5, 20, false, true);
        String verwachtResultaat3 = testWeging.wegingPrestatie(1.5, 10, true, false);
        String verwachtResultaat4 = testWeging.wegingPrestatie(1.5, 20, false, true);
        String verwachtResultaat5 = testWeging.wegingPrestatie(2.5, 10, true, false);
        String verwachtResultaat6 = testWeging.wegingPrestatie(2.5, 20, false, true);
        //Assert
        assertEquals(testResultaat1, verwachtResultaat1);
        assertEquals(testResultaat2, verwachtResultaat2);
        assertEquals(testResultaat3, verwachtResultaat3);
        assertEquals(testResultaat4, verwachtResultaat4);
        assertEquals(testResultaat5, verwachtResultaat5);
        assertEquals(testResultaat6, verwachtResultaat6);
    }
}
