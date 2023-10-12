package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Wenn;

public class GesamtschlaegeStepdefs {

	private TrackerDriver tracker;

	public GesamtschlaegeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}

	@Wenn("ich die Gesamtschläge anzeigen lasse")
	public void ich_die_gesamtschläge_anzeigen_lasse() {
		tracker.gibEin("Zeige Gesamtschlagzahl");
	}

	@Dann("sehe ich {int} Gesamtschläge")
	public void sehe_ich_gesamtschläge(Integer expected) {
		tracker.assertThatAntwort(containsString(expected + " Schläge"));
	}

}
