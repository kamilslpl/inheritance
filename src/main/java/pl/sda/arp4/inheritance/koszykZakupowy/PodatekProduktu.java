package pl.sda.arp4.inheritance.koszykZakupowy;

public enum PodatekProduktu {
    VAT8(0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(1);

    private final double wartoscPodatku;

    PodatekProduktu(double wartoscPodatku) {
        this.wartoscPodatku = wartoscPodatku;
    }

    public double getWartoscPodatku() {
        return wartoscPodatku;
    }
}
