import com.company.StatistiekGemiddeldeRaak;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Equivalentieklassen {

    @Test
public void testWegingGemiddeldeRaak(){
    //Arrange
    StatistiekGemiddeldeRaak testWeging = new StatistiekGemiddeldeRaak(0,0);
    String testResultaat1="Matig gegooid";
    String testResultaat2="Matig gegooid";
    String testResultaat3="Matig gegooid";
    String testResultaat4="Prima gegooid";
    String testResultaat5="Prima gegooid";
    String testResultaat6="Prima gegooid";
    String testResultaat7="Geweldig gegooid!";
    String testResultaat8="Geweldig gegooid!";
    //Act
    String verwachtResultaat1=testWeging.wegingGemiddeldeRaak(0.0);
    String verwachtResultaat2=testWeging.wegingGemiddeldeRaak(0.5);
    String verwachtResultaat3=testWeging.wegingGemiddeldeRaak(1.0);
    String verwachtResultaat4=testWeging.wegingGemiddeldeRaak(1.1);
    String verwachtResultaat5=testWeging.wegingGemiddeldeRaak(1.5);
    String verwachtResultaat6=testWeging.wegingGemiddeldeRaak(2.0);
    String verwachtResultaat7=testWeging.wegingGemiddeldeRaak(2.1);
    String verwachtResultaat8=testWeging.wegingGemiddeldeRaak(2.5);
    //Assert
    assertEquals(testResultaat1, verwachtResultaat1);
    assertEquals(testResultaat2, verwachtResultaat2);
    assertEquals(testResultaat3, verwachtResultaat3);
    assertEquals(testResultaat4, verwachtResultaat4);
    assertEquals(testResultaat5, verwachtResultaat5);
    assertEquals(testResultaat6, verwachtResultaat6);
    assertEquals(testResultaat7, verwachtResultaat7);
    assertEquals(testResultaat8, verwachtResultaat8);
}

}
