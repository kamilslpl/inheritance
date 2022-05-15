package pl.sda.arp4.inheritance.koszykZakupowy;

public class Produkt {
    private String nazwaProduktu;
    private double cenaProduktu; //netto
    private PodatekProduktu podatek;

    @Override
    public String toString() {
        return "Produkt" +
                "Produkt " + nazwaProduktu +
                ", cena Produktu= " + cenaProduktu +
                ", podatek " + podatek + "\n"
                ;
    }
public double cenaBrutto(){
        double cenaProduktuBrutto = cenaProduktu + cenaProduktu* podatek.getWartoscPodatku();
    return cenaProduktuBrutto;
}

    public Produkt(String nazwaProduktu, double cenaProduktu, PodatekProduktu podatek) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktu = cenaProduktu;
        this.podatek = podatek;


    }
}
