package domain;

public class Vrijwilliger extends Werknemer {

    public Vrijwilliger(String naam, String voornaam, String rijksregisternummer) {
        super(naam, voornaam, rijksregisternummer);
        setVerloning(2);
    }
}
