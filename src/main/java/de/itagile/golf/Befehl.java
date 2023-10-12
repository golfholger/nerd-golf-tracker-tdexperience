package de.itagile.golf;

public interface Befehl {

	String kommando();

	Operation operation();

	String beschreibung();

	default String abkuerzung() {
		return "";
	}

}
