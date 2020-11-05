package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa testKorpa;

    @BeforeEach
    void inicijalizacija(){
        testKorpa = new Korpa();
        testKorpa.dodajArtikl(new Artikl("Biciklo",2000,"1"));
        testKorpa.dodajArtikl(new Artikl("Biciklo2",2000,"2"));
        testKorpa.dodajArtikl(new Artikl("Biciklo3",2000,"3"));
        testKorpa.dodajArtikl(new Artikl("Biciklo4",2000,"4"));
    }
      @Test
        void testDodavanjaArtikla(){
          assertEquals(4,testKorpa.getBrArtikala());
      }
      @Test
     void testIzbaciArtikalSaKodomDaLiJeIzbacen(){
          Artikl izbaceni = testKorpa.izbaciArtiklSaKodom("2");
          assertEquals(izbaceni.getKod(),"2");
          assertEquals(testKorpa.getBrArtikala(),3);
    }
      @Test
        void testDajUkupnuCijenu() {
          assertEquals(testKorpa.dajUkupnuCijenuArtikala(), 8000);
      }
      @Test
        void testPogresanId(){
            assertEquals(testKorpa.izbaciArtiklSaKodom("50"),null);
      }


}