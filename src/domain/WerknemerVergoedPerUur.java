package domain;

public abstract class WerknemerVergoedPerUur extends Werknemer {
    protected int aantalGewerkteUren;

    public WerknemerVergoedPerUur(String naam, String voornaam, String rijksregisternummer) {
        super(naam, voornaam, rijksregisternummer);
    }

    public void verhoogAantalGewerkteUren(int aantal) {
        this.aantalGewerkteUren += aantal;
    }

    public void resetAantalGewerkteUren() {
        this.aantalGewerkteUren = 0;
    }

    public String toString() {
        return super.toString() + "\n Aantal uren gewerkt (nog niet betaald): " + this.aantalGewerkteUren;
    }


}
