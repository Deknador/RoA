package application;

import application.Sprachen.SprachenLogic;

public enum Ruestungsart {
	STOFF (SprachenLogic.lngText("STOFF")),
	LEDER (SprachenLogic.lngText("LEDER")),
	KETTE (SprachenLogic.lngText("KETTE")),
	PLATTE (SprachenLogic.lngText("PLATTE")),
	SCHUPPE (SprachenLogic.lngText("SCHUPPE")),
	KNOCHEN (SprachenLogic.lngText("KNOCHEN"));
	
    private final String name;       

    private Ruestungsart(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}
