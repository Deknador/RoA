package application;

import application.Sprachen.SprachenLogic;

public enum Status {
	KNOCKDOWN (SprachenLogic.lngText("KNOCKDOWN")),
	STUN (SprachenLogic.lngText("STUN")),
	BURN (SprachenLogic.lngText("BURN")),
	WET (SprachenLogic.lngText("WET")),
	BLIND (SprachenLogic.lngText("BLIND")),
	DRUNK (SprachenLogic.lngText("DRUNK")),
	DISEASED (SprachenLogic.lngText("DISEASED")),
	POISON (SprachenLogic.lngText("POISON")),
	BLEED (SprachenLogic.lngText("BLEED")),
	BROCKEN (SprachenLogic.lngText("BROCKEN")),
	CONFUSED (SprachenLogic.lngText("CONFUSED")),
	DEAD (SprachenLogic.lngText("DEAD")),
	ZOMBIE (SprachenLogic.lngText("ZOMBIE"));
	
    private final String name;       

    private Status(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}
