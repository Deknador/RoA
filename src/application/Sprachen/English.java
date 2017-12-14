package application.Sprachen;

public enum English {
	HP ("Healthpoints");
	
	
    private final String name;       

    private English(String s) {
        name = s;
    }
    
    public String toString() {
    	return this.name;
    }
}