package pl.sda.arp4.inheritance.ksztalty;

public class Kolo extends Ksztalt{
private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    public double obliczPole() {
        return Math.PI * promien * promien;
        // Math.pow(promien, 2.0);
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}
