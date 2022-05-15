package pl.sda.arp4.inheritance.wyjatki;

public class CholeroException extends RuntimeException{
    public CholeroException() {
        super("pamietaj nie dziel przez 0");
    }
}
