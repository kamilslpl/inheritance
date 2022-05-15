package pl.sda.arp4.inheritance.wyjatki;

/*
1. Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b,
i wyświetla wynik dzielenia a/b.
Jeżeli b jest zerowe program powinien wyświetlić odpowiedni komunikat.
        Wariant 1: Zastosuj instrukcję if
        Wariant 2: Zastosuj instrukcję try-catch

        2. Napisz program który pyta użytkownika o dwie liczby (wykorzystaj program 1)
         a następnie sprawdza czy druga liczba nie jest ==0.
         Jeśli jest, to wyrzuca wyjątek ‘CholeroException’
         z komunikatem “Pamiętaj cholero, by nie dzielić przez zero!”.
        3. Napisz klasę Person, Club, NoAdultException. Klasa Person powinna zawierać, imię, nazwisko i wiek. Klasa Club powinna zawierać metodę enter(Person person), która wyrzuca wyjątek NoAdultException, jeżeli osoba jest niepełnoletnia.
        (edited)
*/

import java.util.Scanner;

public class WyjatkiZadanie {
    public static void main(String[] args) {
        int liczbaA, liczbab;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe A");
        liczbaA = scanner.nextInt();
        System.out.println("Podaj liczbe B");
        liczbab = scanner.nextInt();

     /*   if (liczbab == 0) {
            System.out.println("nie moge dzielic przez 0!!! ");
        } else {
            double wynikDzielenia = liczbaA / liczbab;
            System.out.println("Wynik dzielenia to: " + wynikDzielenia);
        }*/

        try{
            double wynikDzielenia = liczbaA / liczbab;
            System.out.println("Wynik dzielenia to: " + wynikDzielenia);
        }catch (CholeroException ce){
            System.out.println(ce.getMessage());
        };



    }
}


