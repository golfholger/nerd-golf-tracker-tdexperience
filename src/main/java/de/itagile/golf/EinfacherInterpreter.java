package de.itagile.golf;

import de.itagile.golf.operation.Hilfehinweis;
import de.itagile.golf.operation.Schlag;

import java.util.HashMap;
import java.util.Map;


public class EinfacherInterpreter implements Interpreter {

	private Map<String, Operation> operationen = new HashMap<>();

	public EinfacherInterpreter() {
		new BefehleSammler().sammle().forEach(befehl -> operationen.put(befehl.kommando(), befehl.operation()));
		new BefehleSammler().sammle().forEach(befehl -> operationen.put(befehl.abkuerzung(), befehl.operation()));
	}

	@Override
	public Operation interpretiere(String befehlString) {
		Operation operation = operationen.get(befehlString);
		if (operation == null) {
			return new Hilfehinweis();
		}
		return operation;
	}
}
