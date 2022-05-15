package pl.sda.arp4.inheritance.wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainRzucanieWyjatkowWyklad {

        public static void main(String[] args) {
            try {
                metoda();
            } catch (Exception e) {
                System.out.println("takie rzeczy exception");;
            }
        }

// rekurencja - wywolania cos przez siebie
    public static void metoda() throws Exception {
        //niejawny wyjatek bo nie na czerwono :)
//            throw new RuntimeException("Runtime Yo!");

throw new Exception(":)");

    }

}
