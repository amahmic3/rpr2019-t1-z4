package ba.unsa.etf.rpr;

public class Artikl {
    private String nazivArtikla;
    private double cijena;
    private int kod;
    public  Artikl(String _nazivArtikla,double _cijena,int _kod){
        nazivArtikla=_nazivArtikla;
        cijena=_cijena;
        kod=_kod;
    }

    public String getNaziv() {
        return nazivArtikla;
    }

    public double getCijena() {
        return cijena;
    }

    public int getKod() {
        return kod;
    }
}
