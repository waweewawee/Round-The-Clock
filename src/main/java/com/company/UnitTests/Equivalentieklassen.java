package com.company.UnitTests;

import com.company.StatistiekGemiddeldeRaak;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Equivalentieklassen {

    @Test
    public void wegingGemiddeldeRaak_matigGegooid00_true(){
    //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat1="Matig gegooid";
    //Act
        String verwachtResultaat1=testWeging.wegingGemiddeldeRaak(0.0);
    //Assert
        assertEquals(testResultaat1, verwachtResultaat1);
    }
    @Test
    public void wegingGemiddeldeRaak_matigGegooid05_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat2="Matig gegooid";
        //Act
        String verwachtResultaat2=testWeging.wegingGemiddeldeRaak(0.5);
        //Assert
        assertEquals(testResultaat2, verwachtResultaat2);
    }
    @Test
    public void wegingGemiddeldeRaak_matigGegooid10_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat3="Matig gegooid";
        //Act
        String verwachtResultaat3=testWeging.wegingGemiddeldeRaak(1.0);
        //Assert
        assertEquals(testResultaat3, verwachtResultaat3);
    }
    @Test
    public void wegingGemiddeldeRaak_matigGegooid11_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat4="Prima gegooid";
        //Act
        String verwachtResultaat4=testWeging.wegingGemiddeldeRaak(1.1);
        //Assert
        assertEquals(testResultaat4, verwachtResultaat4);
    }
    @Test
    public void wegingGemiddeldeRaak_matigGegooid15_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat5="Prima gegooid";
        //Act
        String verwachtResultaat5=testWeging.wegingGemiddeldeRaak(1.5);
        //Assert
        assertEquals(testResultaat5, verwachtResultaat5);
    }
    @Test
    public void wegingGemiddeldeRaak_matigGegooid20_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat6="Prima gegooid";
        //Act
        String verwachtResultaat6=testWeging.wegingGemiddeldeRaak(2.0);
        //Assert
        assertEquals(testResultaat6, verwachtResultaat6);
    }
    @Test
    public void wegingGemiddeldeRaak_matigGegooid21_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat7="Geweldig gegooid!";
        //Act
        String verwachtResultaat7=testWeging.wegingGemiddeldeRaak(2.1);
        //Assert
        assertEquals(testResultaat7, verwachtResultaat7);
    }
    @Test
    public void wegingGemiddeldeRaak_matigGegooid25_true(){
        //Arrange
        StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
        String testResultaat8="Geweldig gegooid!";
        //Act
        String verwachtResultaat8=testWeging.wegingGemiddeldeRaak(2.5);
        //Assert
        assertEquals(testResultaat8, verwachtResultaat8);
    }
}
