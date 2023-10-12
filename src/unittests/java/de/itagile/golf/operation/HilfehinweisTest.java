package de.itagile.golf.operation;

import de.itagile.golf.Scorecard;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;

public class HilfehinweisTest {
    @Test
    void gibtHilfehinweisAus() {
        Hilfehinweis hilfehinweis = new Hilfehinweis();
        assertThat(hilfehinweis.fuehreAus(mock(Scorecard.class)), is("Diesen Befehl kenne ich nicht. Gib 'Hilfe' ein, um mögliche Befehle zu sehen."));
    }
}
