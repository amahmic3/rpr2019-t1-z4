package ba.unsa.etf.rpr;

public class Korpa {
    private int brArtikala=0;
    private Artikl[] korpica=new Artikl[50];


    public boolean dodajArtikl(Artikl a){
        if(brArtikala<50){
            korpica[brArtikala]=a;
            brArtikala++;
        }else return  false;
        return  true;
    }

    public Artikl[] getArtikli() {
        return korpica;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl povratni=null;
        for(int i=0;i<brArtikala;i++){
            if(korpica[i]!=null && korpica[i].getKod().equals(kod)){
                povratni = korpica[i];
                korpica[i]=null;
                for(int j=i;j<brArtikala-1;j++){
                    korpica[j]=korpica[j+1];
                }
                korpica[brArtikala-1]=null;
                brArtikala=brArtikala-1;
            }
        }
        return  povratni;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma=0;
        for(Artikl a:korpica){
            if(a!=null)
            suma=suma+a.getCijena();
        }
        return suma;
    }
    public int getBrArtikala(){
        return  brArtikala;
    }
}
