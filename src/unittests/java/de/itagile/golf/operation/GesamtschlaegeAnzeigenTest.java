package de.itagile.golf.operation;

import de.itagile.golf.Scorecard;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GesamtschlaegeAnzeigenTest {
    private Scorecard scorecard = mock(Scorecard.class);
    @Test
    void zeigtGesamtschlaegeAn() {
        when(scorecard.gesamtzahlSchlaege()).thenReturn(1);
        String ergebnis = new GesamtschlaegeAnzeigen().fuehreAus(scorecard);
        assertThat(ergebnis, containsString("insgesamt 1 Schläge"));
    }
}
