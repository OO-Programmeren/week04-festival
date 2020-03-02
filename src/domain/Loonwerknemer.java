package domain;

public class Loonwerknemer extends Werknemer {
    public Loonwerknemer(String naam, String voornaam, String rijksregisternummer) {
        super(naam, voornaam, rijksregisternummer);
        setVerloning(10);
    }
}
