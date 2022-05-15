package pl.sda.arp4.inheritance.interfejsy;

public class Radio implements UrzadznieWlaczalne, UrzadznieWylaczalne {
    public void wlacz(){
        System.out.println("Wlaczam radio");
    }

    @Override
    public void wylacz() {
        System.out.println("Radio off");

    }
}
