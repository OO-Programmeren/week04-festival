package domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Werknemer {
    private String naam;
    private String voornaam;
    private String rijksregisternummer;

    public Werknemer(String naam, String voornaam, String rijksregisternummer) {
        if (isGeldigRijksregisternummer(rijksregisternummer)){
            this.naam = naam;
            this.voornaam = voornaam;
            this.rijksregisternummer = rijksregisternummer;
        }
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getRijksregisternummer() {
        return rijksregisternummer;
    }

    public abstract int geefVerloning();

    public boolean isGeldigRijksregisternummer(String rijksregisternummer) {
        //[0-9]{2}\.?[0-9]{2}\.?[0-9]{2}-[0-9]{3}\.?[0-9]{2}
        String regex = "[0-9]{2}\\.?[0-9]{2}\\.?[0-9]{2}-[0-9]{3}\\.?[0-9]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public String toString(){
        return this.getClass().getSimpleName() + ": " + this.getVoornaam() + " " + this.getNaam() + "(" + this.getRijksregisternummer() + ")"
                + "\n Totale vergoeding (nog te betalen): " + this.geefVerloning();
    }
}
