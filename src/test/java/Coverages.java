import com.company.Beurt1;
import com.company.Darts;
import com.company.StatistiekGemiddeldeRaak;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MCDC {

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

}
