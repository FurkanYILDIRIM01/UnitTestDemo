package HesapmakineTest ;

import org.junit.Test;
import org.testng.Assert;
public class Test_Case {
    @Test
    public void TestTopla() {
        //GIVEN
        HesapMakine hesapMakine = new HesapMakine();

        int sayi1 = 5;
        int sayi2 = 18;
        //WHEN
        int toplam = hesapMakine.topla(sayi1, sayi2);
        //THEN
        Assert.assertEquals(23, toplam);
    }

        @Test
        public void TestCikar(){


            HesapMakine hesapMakine = new HesapMakine();

            int sayi1=5;
            int sayi2=18;

            int cikar = hesapMakine.cikar(sayi1,sayi2);

            Assert.assertEquals(-12,cikar);
        }








}

