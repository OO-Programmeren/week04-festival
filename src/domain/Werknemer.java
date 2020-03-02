package domain;

public abstract class Werknemer {
    private String naam;
    private String voornaam;
    private String rijksregisternummer;
    private int aantalGewerkteUren;
    private int verloning;

    public Werknemer(String naam, String voornaam, String rijksregisternummer) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.rijksregisternummer = rijksregisternummer;
        this.aantalGewerkteUren = 0;
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

    public void setVerloning(int verloning) {
        this.verloning = verloning;
    }
}
