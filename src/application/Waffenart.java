package application;

import application.Sprachen.SprachenLogic;

public enum Waffenart{
	EHSCHWERT (SprachenLogic.lngText("EHSCHWERT")),
	ZHSCHWERT (SprachenLogic.lngText("ZHSCHWERT")),
	DOLCH (SprachenLogic.lngText("DOLCH")),
	STAB (SprachenLogic.lngText("STAB")),
	FAUST (SprachenLogic.lngText("FAUST")),
	SENSE (SprachenLogic.lngText("SENSE")),
	SPEER (SprachenLogic.lngText("SPEER")),
	EHSTREITKOLBEN (SprachenLogic.lngText("EHSTREITKOLBEN")),
	ZHSTREITKOLBEN (SprachenLogic.lngText("ZHSTREITKOLBEN")),
	EHAXT (SprachenLogic.lngText("EHAXT")),
	ZHAXT (SprachenLogic.lngText("ZHAXT")),
	EHHAMMER (SprachenLogic.lngText("EHHAMMER")),
	ZHHAMMER (SprachenLogic.lngText("ZHHAMMER")),
	
	WURFDOLCH (SprachenLogic.lngText("WURFDOLCH")),
	BOGEN (SprachenLogic.lngText("BOGEN")),
	ARMBRUST (SprachenLogic.lngText("ARMBRUST")),
	GEWEHR (SprachenLogic.lngText("GEWEHR")),
	PISTOLE (SprachenLogic.lngText("PISTOL")),
	GRIMOIRE (SprachenLogic.lngText("GRIMORE"));

    private final String name;       

    private Waffenart(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}
