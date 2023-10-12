package de.itagile.golf;

import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EinfacheScorecardTest {

	private Scorecard scorecard = new EinfacheScorecard();
	
	@Test
	public void inkrementiertSchlagzahlEinmal() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();

		assertThat(scorecard.anzahlSchlaege(), is(1));
	}
	
	@Test
	public void inkrementiertSchlagzahlMehrmals() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.anzahlSchlaege(), is(2));
	}
	
	@Test
	public void setztSchlagzahlZurueck() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		assertThat(scorecard.anzahlSchlaege(), is(0));
	}
	
	@Test
	public void hatInitialErstesLoch() throws Exception {
		assertThat(scorecard.aktuellesLoch(), is(1));
	}
	
	@Test
	public void zaehltAktuellesLoch() throws Exception {
		scorecard.schliesseLochAb();
		assertThat(scorecard.aktuellesLoch(), is(2));
	}

	@Test
	void zaehltSchlaegeUeberMehrereLoecher() throws Exception {
		scorecard.erhoeheAnzahlSchlaege();
		scorecard.schliesseLochAb();
		scorecard.erhoeheAnzahlSchlaege();
		assertThat(scorecard.gesamtzahlSchlaege(), is(2));
	}
}
