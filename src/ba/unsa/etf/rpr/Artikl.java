package ba.unsa.etf.rpr;

public class Artikl {
    private String nazivArtikla;
    private int cijena;
    private String kod;
    public  Artikl(String _nazivArtikla,int _cijena,String _kod){
        nazivArtikla=_nazivArtikla;
        cijena=_cijena;
        kod=_kod;
    }

    public String getNaziv() {
        return nazivArtikla;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
