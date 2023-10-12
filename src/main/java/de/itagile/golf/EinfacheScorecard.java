package de.itagile.golf;

public class EinfacheScorecard implements Scorecard {

	private int aktuellesLoch = 1;
	private int anzahlSchlaege;
	private int gesamtSchlaege = 0;

	public void erhoeheAnzahlSchlaege() {
		anzahlSchlaege++;
		gesamtSchlaege++;
	}

	public void schliesseLochAb() {
		aktuellesLoch++;
		anzahlSchlaege = 0;
	}

	public int anzahlSchlaege() {
		return anzahlSchlaege;
	}

	public int aktuellesLoch() {
		return aktuellesLoch;
	}

	@Override
	public int gesamtzahlSchlaege() {
		return gesamtSchlaege;
	}
}
