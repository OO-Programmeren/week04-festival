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
        //test geldige naam
        //test geldige start datum
        //test geldige einddatum en ligt na start
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

    public String geefMedewerkersAlsString(){
        String output = null;
        for (Werknemer werknemer: werknemers) {
            output += "\n \n" + werknemer.toString();
        }
        return output;
    }

    public Werknemer vindMedewerkerMetRRN(String rijksregisternummer){
        for (Werknemer werknemer: werknemers) {
            if (werknemer.getRijksregisternummer().equals(rijksregisternummer)){
                return werknemer;
            }
        }
        return null;
    }

    public void voegWerknemerToe(Werknemer werknemer){
        //lege werkenemer threx
        //kijken als werknemer is al toegevoegd
        werknemers.add(werknemer);
    }

    public int geefAantalBonnetjesDieNogVoorzienMoetenWorden(){
        int bonnetjesTeVoorzien = 0;
        for (Werknemer werknemer: werknemers) {
            if (werknemer instanceof Vrijwilliger){
                bonnetjesTeVoorzien += ((Vrijwilliger) werknemer).geefVerloning();
            }
        }

        return bonnetjesTeVoorzien;
    }

    public double geefGemiddeldeVerloningPrestatie(){
        return 0.00;u
    }

    public String toString(){ return null;}

    //geef prestaties loopen over de werknemerslijst indien instanceof is dan weegeven

}
