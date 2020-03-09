package domain;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class FestivalTest {
    private Festival festivalCorrect;

    @Before
    public void setUp() throws Exception {
        festivalCorrect = new Festival("TML", LocalDate.of(2020, 6, 1), LocalDate.of(2020, 6, 6));
    }

    @Test
    public void test_voegt_nieuw_festival_toe_met_correcte_gegevens(){
        festivalCorrect.
    }
}