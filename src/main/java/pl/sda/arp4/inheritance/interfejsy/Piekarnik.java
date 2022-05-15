package pl.sda.arp4.inheritance.interfejsy;

public class Piekarnik implements UrzadznieWlaczalne, UrzadznieWylaczalne {
    public void wlacz() {
        System.out.println("Wlaczam piekarnik");
    }

    @Override
    public void wylacz() {
        System.out.println("Wylaczam piekarnik");

    }
}
