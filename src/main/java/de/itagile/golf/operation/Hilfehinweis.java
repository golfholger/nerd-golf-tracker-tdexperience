package de.itagile.golf.operation;

import de.itagile.golf.Operation;
import de.itagile.golf.Scorecard;

public class Hilfehinweis implements Operation {
    @Override
    public String fuehreAus(Scorecard scorecard) {
        return "Diesen Befehl kenne ich nicht. Gib 'Hilfe' ein, um mögliche Befehle zu sehen.";
    }
}
