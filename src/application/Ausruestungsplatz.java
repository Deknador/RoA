package application;

import application.Sprachen.SprachenLogic;

public enum Ausruestungsplatz {
	KOPF (SprachenLogic.lngText("KOPF")),
	BRUST (SprachenLogic.lngText("BRUST")),
	SCHULTER(SprachenLogic.lngText("SCHULTER")),
	ARME (SprachenLogic.lngText("ARME")),
	BEINE (SprachenLogic.lngText("BEINE")),
	FUESSE (SprachenLogic.lngText("FUESSE")),
	WAFFES1 (SprachenLogic.lngText("WAFFE1")),
	WAFFE2S1 (SprachenLogic.lngText("WAFFE2")),
	WAFFES2 (SprachenLogic.lngText("WAFFE1")),
	WAFFE2S2 (SprachenLogic.lngText("WAFFE2")),
	WAFFES3 (SprachenLogic.lngText("WAFFE1")),
	WAFFE2S3 (SprachenLogic.lngText("WAFFE2")),
	MUNITION (SprachenLogic.lngText("MUNITION")),
	MUNITION2 (SprachenLogic.lngText("MUNITION")),
	MUNITION3 (SprachenLogic.lngText("MUNITION"));
	
    private final String name;       

    private Ausruestungsplatz(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}


