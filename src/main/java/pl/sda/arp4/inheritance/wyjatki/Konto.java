package pl.sda.arp4.inheritance.wyjatki;

public class Konto {

    private double iloscSrodkow;

    public double podajIloscSrodkow(){
        return iloscSrodkow;
    }

    public double getIloscSrodkow() {
        return iloscSrodkow;
    }

    public void wykonajPrzelew(double kwota1) throws SrodkiNaKoncieException{
    //    iloscSrodkow = iloscSrodkow - kwota1;

        if (iloscSrodkow <kwota1){
            throw new SrodkiNaKoncieException("Blad przelewu, brak srodkow");

        }
        iloscSrodkow = iloscSrodkow - kwota1;

    }

    public void przelewPrzychodzacy(double kwota2){
        iloscSrodkow = iloscSrodkow + kwota2;

    }
}
