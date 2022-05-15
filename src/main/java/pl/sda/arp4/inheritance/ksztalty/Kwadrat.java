package pl.sda.arp4.inheritance.ksztalty;

public class Kwadrat extends Ksztalt{

private double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public double obliczPole() {
        return 0;
    }

    @Override
    public double obliczObwod() {
        return 0;
    }
}

