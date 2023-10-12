package de.itagile.golf.befehl;

import de.itagile.golf.Befehl;
import de.itagile.golf.BefehleSammler;
import de.itagile.golf.Operation;
import de.itagile.golf.operation.GesamtschlaegeAnzeigen;
import de.itagile.golf.operation.Hilfe;

public class GesamtschlaegeAnzeigenBefehl implements Befehl {

	public String kommando() {
		return "Zeige Gesamtschlagzahl";
	}

	public Operation operation() {
		return new GesamtschlaegeAnzeigen();
	}

	public String beschreibung() {
		return "dann zeige ich dir wie viele Schläge du insgesamt gemacht hast";
	}

	@Override
	public String abkuerzung() {
		return "ZG";
	}
}
