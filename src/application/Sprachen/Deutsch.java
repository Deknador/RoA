package application.Sprachen;

public enum Deutsch {
	
//	Ausr�stungspl�tze
	KOPF ("Kopf"),
	BRUST ("Brust"),
	SCHULTER("Schulter"),
	ARME ("Arme"),
	BEINE ("Beine"),
	FUESSE ("F��e"),
	WAFFE1 ("Waffe 1"),
	WAFFE2 ("Waffe 2"),
	MUNITION ("Munition"),
	
// 	Charakterwerte
	HP ("Leben"),
	AUSDAUER ("Ausdauer"),
	MANA ("Mana"),
	AP ("Aktionspunkte"),
	STAERKE("St�rke"),
	ABWEHR("Abwehr"),
	GESCHICK("Geschick"),
	AGILITAET("Agilit�t"),
	BEGABUNG("Begabung"),
	RESISTENZ("Resistenz"),
	
// Elemente
	FEUER ("Feuer"),
	WASSER ("Wasser"),
	ERDE ("Erde"),
	WIND ("Wind"),
	BLITZ ("Blitz"),
	LICHT ("Licht"),
	DUNKELHEIT ("Dunkelheit"),
	EIS ("EIS"),
	
// Ruestungsarten
	STOFF ("Stoff"),
	LEDER ("Leder"),
	KETTE ("Kette"),
	PLATTE ("Platte"),
	SCHUPPE ("Schuppe"),
	KNOCHEN ("Knochen"),
	
//  Status
	KNOCKDOWN ("Niedergeschlagen"),
	STUN ("Bet�ubt"),
	BURN ("Brennen"),
	WET ("Durchn�sst"),
	BLIND ("Geblendet"),
	DRUNK ("Betrunken"),
	DISEASED ("Verseucht"),
	POISON ("Vergiftet"),
	BLEED ("Blutung"),
	BROCKEN ("Gebrochen"),
	CONFUSED ("Verwirrt"),
	DEAD ("Tot"),
	ZOMBIE ("Zombie"),
	
// Waffenart
	EHSCHWERT ("Einhandschwert"),
	ZHSCHWERT ("Zweihandschwert"),
	DOLCH ("Dolch"),
	STAB ("Stab"),
	FAUST ("Faustwaffen"),
	SENSE ("Sense"),
	SPEER ("Speer"),
	EHSTREITKOLBEN ("Einhandstreitkolben"),
	ZHSTREITKOLBEN ("Zweihandstreitkolben"),
	EHAXT ("Einhandaxt"),
	ZHAXT ("Zweihandaxt"),
	EHHAMMER ("Einhandhammer"),
	ZHHAMMER ("Zweihandhammer"),
	WURFDOLCH ("Wurfdolch"),
	BOGEN ("Bogen"),
	ARMBRUST ("Armbrust"),
	GEWEHR ("Gewehr"),
	PISTOLE ("Pistole"),
	GRIMOIRE ("Grimoire");
	
    private final String name;       

    private Deutsch(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}


