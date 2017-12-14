package application.Sprachen;

public enum Sprachen {
	GER ("deutsch"),
	ENG ("english");
	
	
	private final String name;       

    private Sprachen(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}
