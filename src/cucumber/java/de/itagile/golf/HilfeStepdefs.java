package de.itagile.golf;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.de.Dann;
import io.cucumber.java.de.Wenn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HilfeStepdefs {
	
	private TrackerDriver tracker;

	public HilfeStepdefs(TrackerDriver tracker) {
		this.tracker = tracker;
	}
	
	@When("ich die Hilfe aufrufe")
	public void rufeHilfeAuf() {
		tracker.gibEin("Hilfe");
	}
	
	@Then("listet der NerdGolfTracker einen Eintrag zu {string} auf")
	public void pruefeHilfeEintrag(String kommando) {
		tracker.assertThatAntwort(containsString(kommando));
	}

	@Wenn("ich eine unbekannte Eingabe mache")
	public void ich_eine_unbekannte_eingabe_mache() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		tracker.gibEin("unbekannte Eingabe");
	}
	@Dann("bekomme ich einen Hinweis auf die Hilfe")
	public void bekomme_ich_einen_hinweis_auf_die_hilfe() {

		tracker.assertThatAntwort(containsString("Gib 'Hilfe' ein"));
	}
}
