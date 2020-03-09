package domain;

public class Prestatie {
    private String naam;
    private int vergoeding;
    private double minimaleVergoeding = 20;

    public Prestatie(String naam, int vergoeding) {
        if (vergoeding < 20 ){
            throw new IllegalArgumentException();
        }
        if (naam.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.naam = naam;
        this.vergoeding = vergoeding;
    }

    public String getNaam() {
        return naam;
    }

    public int getVergoeding() {
        return vergoeding;
    }

    public double getMinimaleVergodeing() {
        return minimaleVergoeding;
    }
}
