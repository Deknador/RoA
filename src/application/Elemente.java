package application;

import application.Sprachen.SprachenLogic;

public enum Elemente {
	FEUER (SprachenLogic.lngText("FEUER")),
	WASSER (SprachenLogic.lngText("WASSER")),
	ERDE (SprachenLogic.lngText("ERDE")),
	WIND (SprachenLogic.lngText("WIND")),
	BLITZ (SprachenLogic.lngText("BLITZ")),
	LICHT (SprachenLogic.lngText("LICHT")),
	DUNKELHEIT (SprachenLogic.lngText("DUNKELHEIT")),
	EIS (SprachenLogic.lngText("EIS"));
	
    private final String name;       

    private Elemente(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}