package de.itagile.golf;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import java.util.stream.Stream;

import de.itagile.golf.operation.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class EinfacherIntepreterTest {

    private Interpreter interpreter = new EinfacherInterpreter();

    private static Stream<Arguments> schlagParameter() {
        return Stream.of(
                Arguments.of("Schlage Ball", Schlag.class),
                Arguments.of("Nächstes Loch", Lochwechsel.class),
                Arguments.of("Hilfe", Hilfe.class),
                Arguments.of("Zeige Gesamtschlagzahl", GesamtschlaegeAnzeigen.class),
                Arguments.of("Foo", Hilfehinweis.class),
                Arguments.of("SB", Schlag.class),
                Arguments.of("NL", Lochwechsel.class),
                Arguments.of("H", Hilfe.class),
                Arguments.of("ZG", GesamtschlaegeAnzeigen.class)
        );
    }

    @ParameterizedTest
    @MethodSource("schlagParameter")
    public void interpretiertBefehle(String befehl, Class<Operation> operation) throws Exception {
        assertThat(interpreter.interpretiere(befehl), instanceOf(operation));
    }
}
