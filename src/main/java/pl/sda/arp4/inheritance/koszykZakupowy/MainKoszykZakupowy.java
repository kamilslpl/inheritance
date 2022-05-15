package pl.sda.arp4.inheritance.koszykZakupowy;

/*
Stworzymy koszyk zakupowy z produktami. Nasz koszyk będzie przechowywał zamówienie które możemy złożyć w pizzerii lub restauracji (lub sklepie).
        Stwórz enum PodatekProduktu i dodaj wartości:
        VAT8
        VAT23
        VAT5
        NO_VAT
        Stwórz klasę Produkt. Dodaj w niej pola:
        nazwa produktu
        cena produktu (netto)
        ilość podatku (PodatekProduktu)
*/

import java.util.Arrays;
import java.util.Scanner;

public class MainKoszykZakupowy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc produktow: ");
        int iloscProduktow = scanner.nextInt();
        scanner.nextLine();

        Produkt[] tablicaProduktow = new Produkt[iloscProduktow];

        for (int i = 0; i < tablicaProduktow.length; i++) {
            System.out.println("Podaj nazwe produktu:");
            String nazwa = scanner.next();
            System.out.println("Podaj cene netto produktu:");
            double cenaNetto = scanner.nextDouble();

            PodatekProduktu podatekProduktu = null;
            do {
                System.out.println("Podaj rodzaj podatku: " + (Arrays.toString(PodatekProduktu.values())) + "");
                String podatekProduktuString = scanner.next();
                try {
                    podatekProduktu = PodatekProduktu.valueOf(podatekProduktuString.toUpperCase());
                } catch (IllegalArgumentException iae) {
                    System.out.println("Zly podatek produktu");
                }
            } while (podatekProduktu == null);
            Produkt p = new Produkt(nazwa, cenaNetto, podatekProduktu);
            System.out.println("Cena brutto " + p.cenaBrutto());
            tablicaProduktow[i] = p;
        }
        System.out.println("Czy będzie faktura czy paragon?");
        String czyFaktura = scanner.next();

        if (czyFaktura.equalsIgnoreCase("faktura")) {
            System.out.println("Proszę podać numer nip:");
            String nip = scanner.next();

            Faktura faktura = new Faktura(nip, tablicaProduktow);
            System.out.println(faktura);
        } else {
            Rachunek rachunek = new Rachunek(tablicaProduktow);
            System.out.println(rachunek);


        }
    }
}

