package de.itagile.golf;

import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Wenn;

import static org.hamcrest.CoreMatchers.containsString;

public class AbkuerzungStepDefs {

    TrackerDriver trackerDriver;

    public AbkuerzungStepDefs(TrackerDriver tracker) {
        this.trackerDriver = tracker;
    }

    @Wenn("ich den Befehl {string} eingebe")
    public void ich_den_befehl_eingebe(String befehl) {
        trackerDriver.gibEin(befehl);
    }

    @Dann("habe ich einen Schlag ausgeführt")
    public void habe_ich_einen_schlag_ausgeführt() {
        trackerDriver.assertThatAntwort(containsString("1"));
    }

    @Dann("sehe ich die Hilfe")
    public void seheIchDieHilfe() {
        trackerDriver.assertThatAntwort(containsString("Ich reagiere auf"));
    }

    @Dann("sehe ich die Gesamtschlagzahl")
    public void seheIchDieGesamtschlagzahl() {
        trackerDriver.assertThatAntwort(containsString("insgesamt 0 Schläge"));
    }
}
