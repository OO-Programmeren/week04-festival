package domain;

public class Vrijwilliger extends WerknemerVergoedPerUur {
    protected int aantalBonnetjesPerUur;

    public Vrijwilliger(String naam, String voornaam, String rijksregisternummer) {
        super(naam, voornaam, rijksregisternummer);
        this.aantalBonnetjesPerUur = 2;
    }

    @Override
    public int geefVerloning() {
        return (super.aantalGewerkteUren * aantalBonnetjesPerUur);
    }

    public String toString(){
        return super.toString() + "\n Te betalen in bonnetjes";
    }
}
