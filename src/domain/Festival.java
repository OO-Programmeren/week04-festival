package domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Festival {
    private String naam;
    private java.time.LocalDate startdatum;
    private java.time.LocalDate einddatum;
    private java.util.ArrayList<Werknemer> werknemers;
    private java.util.ArrayList<Optreden> optredens;

    public Festival(String naam, LocalDate startdatum, LocalDate einddatum) {
        this.naam = naam;
        this.startdatum = startdatum;
        this.einddatum = einddatum;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getStartdatum() {
        return startdatum;
    }

    public LocalDate getEinddatum() {
        return einddatum;
    }

    public ArrayList<Werknemer> getWerknemers() {
        return werknemers;
    }

    public ArrayList<Optreden> getOptredens() {
        return optredens;
    }

    public String getMedewerkersTekstVorm(){
        return "trest";
    }
}
