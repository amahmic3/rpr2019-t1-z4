package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Supermarket supermarket;
    @BeforeEach
    void inicijalizacija(){
        supermarket= new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "7"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "8"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "9"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "10"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "11"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "12"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "13"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "14"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "15"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "16"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "17"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "18"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "19"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "20"));
    }
    @Test
    void testIzbaciArtikalSaKodom(){
        Artikl tmp = supermarket.izbaciArtiklSaKodom("15");
        assertEquals(tmp.getKod(),"15");
    }
    @Test
    void testIzbaciArtikalSaKodomBrElemenata(){
        supermarket.izbaciArtiklSaKodom("15");
        assertEquals(supermarket.getBrArtikala(),19);
    }


}