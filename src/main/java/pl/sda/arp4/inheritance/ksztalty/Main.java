package pl.sda.arp4.inheritance.ksztalty;

public class Main
{
    public static void main(String[] args) {
        // S single responsibility
        // O open/close principle
        // L liskov substitution
        // I interface segregation
        // D dependency inversion/injection (dopiero pod koniec kursu zrozumiemy)

        Kwadrat k = new Kwadrat(5);

        System.out.println("Pole: " + k.obliczPole());
        System.out.println("Obwod: " + k.obliczObwod());

        Ksztalt[] ksztalts = new Ksztalt[5];
        // dodawanie ksztaltow

        ksztalts[0] = new Kolo(32.0);
        ksztalts[1] = new Kwadrat(2.3);
        ksztalts[2] = new Trapez(30, 50, 20, 10, 100);
        ksztalts[3] = new Kwadrat(15.0);
        ksztalts[4] = new Kolo(1.1111111);

        double sumaPolksztaltow = 0;
        double sumaObwodow = 0;
        for (Ksztalt ksztalt : ksztalts) {
            System.out.println("Pole: " + ksztalt.obliczPole());
            System.out.println("Obwod: " + ksztalt.obliczObwod());
            sumaPolksztaltow = sumaPolksztaltow + ksztalt.obliczPole();
            sumaObwodow = sumaObwodow + ksztalt.obliczObwod();
        }
        System.out.println("Suma pól: " + sumaPolksztaltow);
        System.out.println("Suma obwodow: " + sumaObwodow);
    }
}
