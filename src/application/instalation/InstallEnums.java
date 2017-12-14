package application.instalation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;

import application.Ausruestungsplatz;

public class InstallEnums {

	
	public InstallEnums(){
		
	}
	public void install(){
		File currentPath = new File (Paths.get(".").toAbsolutePath().normalize().toString());
		
		HashMap<Ausruestungsplatz, String> ausruestungsplatz = new HashMap<Ausruestungsplatz, String>();
		try {
			FileWriter writer = new FileWriter(ausruestungsplatz.getClass().getName()+".pak");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
