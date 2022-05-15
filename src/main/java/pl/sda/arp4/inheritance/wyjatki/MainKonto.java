package pl.sda.arp4.inheritance.wyjatki;

import java.util.Scanner;

public class MainKonto {
    public static void main(String[] args) {
        Konto k = new Konto();
        Scanner scanner = new Scanner(System.in);
        double ilosc = k.podajIloscSrodkow();
        System.out.println("Stan konta: " + ilosc);
        k.przelewPrzychodzacy(1050);

        try {
            k.wykonajPrzelew(1000);
            System.out.println("Sukces przelewu " + k.podajIloscSrodkow());


        }catch (SrodkiNaKoncieException re){
            System.out.println("Blad: " + re.getMessage());
        }
       // System.out.println("Stan konta: " + k.podajIloscSrodkow());

       // ilosc = k.podajIloscSrodkow();
      //  System.out.println("Stan konta: " + ilosc);




    }
}
