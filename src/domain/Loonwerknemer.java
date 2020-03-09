package domain;

public class Loonwerknemer extends WerknemerVergoedPerUur {
    protected int uurloon;

    public Loonwerknemer(String naam, String voornaam, String rijksregisternummer) {
        super(naam, voornaam, rijksregisternummer);
        this.uurloon = 10;
    }

    @Override
    public int geefVerloning() {
        return (super.aantalGewerkteUren * uurloon);
    }
}
