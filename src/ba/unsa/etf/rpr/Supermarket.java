package ba.unsa.etf.rpr;

public class Supermarket {
    private int brArtikala=0;
    private Artikl[] inventar = new Artikl[1000];
    public void dodajArtikl(Artikl ar) {
        if(brArtikala<1000){
            inventar[brArtikala]=ar;
            brArtikala=brArtikala+1;
        }
    }

    public Artikl[] getArtikli() {
        return inventar;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl povratni=null;
        for(int i=0;i<brArtikala;i++){

            if(inventar[i]!=null && inventar[i].getKod().equals(kod)){
                povratni = inventar[i];
                inventar[i]=null;
                for(int j=i;j<brArtikala-1;j++) {
                    inventar[j] = inventar[j + 1];
                }
                inventar[brArtikala-1]=null;
                brArtikala=brArtikala-1;
            }
        }
        return  povratni;
    }

    public int getBrArtikala() {
        return brArtikala;
    }
}
