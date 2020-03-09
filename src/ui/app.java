package ui;

import domain.Festival;
import domain.Loonwerknemer;
import domain.Vrijwilliger;
import domain.WerknemerVergoedPerUur;

import java.time.LocalDate;

public class app {
    public static void main(String[] args) {
        Festival TML = new Festival("TML", LocalDate.of(2020, 6, 1), LocalDate.of(2020, 6, 6));

        Vrijwilliger RodeKruis1 = new Vrijwilliger("Jansens", "Jan", "99.02.19-545.09");
        Loonwerknemer Supervisor = new Loonwerknemer("Engels", "Bert", "99.88.43-432.54");

        TML.voegWerknemerToe(RodeKruis1);
        TML.voegWerknemerToe(Supervisor);

        Supervisor.verhoogAantalGewerkteUren(45);
        RodeKruis1.verhoogAantalGewerkteUren(34);

        TML.geefAantalBonnetjesDieNogVoorzienMoetenWorden();
        TML.geefMedewerkersAlsString();
        Supervisor.verhoogAantalGewerkteUren(32);
        RodeKruis1.verhoogAantalGewerkteUren(21);

        TML.geefAantalBonnetjesDieNogVoorzienMoetenWorden();

    }
}
