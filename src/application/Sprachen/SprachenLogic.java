package application.Sprachen;

public class SprachenLogic {
	
	public SprachenLogic(){
		
	}
	
	public static String lngText (String s){
		
		if(s.equals(Sprachen.GER)){
			return English.valueOf(s).toString();
		}else if (s.equals(Sprachen.ENG)){
			
		}
		
		return("");
	}
	
	
	
	
	
}
