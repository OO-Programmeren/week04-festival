package domain;

public class WerknemerVastePrijs extends Werknemer {
    private Prestatie prestatie;

    public WerknemerVastePrijs(String naam, String voornaam, String rijksregisternummer, Prestatie prestatie) {
        super(naam, voornaam, rijksregisternummer);
        this.prestatie = prestatie;
    }

    public int geefVerloning() {
        return this.prestatie.getVergoeding();
    }

    public String toString() {
        return super.toString() + "\n Geleverde prestatie :" + this.prestatie.getNaam() + " aan €" + this.prestatie.getVergoeding() + "";
    }
}
