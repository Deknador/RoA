package application;

import application.Sprachen.SprachenLogic;

public enum Charakterwerte {
	HP (SprachenLogic.lngText("HP")),
	AUSDAUER (SprachenLogic.lngText("AUSDAUER")),
	MANA (SprachenLogic.lngText("MANA")),
	
	AP (SprachenLogic.lngText("AP")),
	
	STAERKE (SprachenLogic.lngText("STAERKE")),
	ABWEHR (SprachenLogic.lngText("ABWEHR")),
	GESCHICK (SprachenLogic.lngText("GESCHICK")),
	AGILITAET (SprachenLogic.lngText("AGILITAET")),
	BEGABUNG (SprachenLogic.lngText("BEGABUNG")),
	RESISTENZ (SprachenLogic.lngText("RESISTENZ"));
	
    private final String name;       

    private Charakterwerte(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}

