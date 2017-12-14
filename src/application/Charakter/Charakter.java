package application.Charakter;

import java.util.ArrayList;
import java.util.HashMap;

import application.Charakterwerte;
import application.Elemente;
import application.Status;
import application.Skill.Skilllist;
import javafx.scene.image.Image;

public class Charakter {

	private Skilllist skl;
	private String firstName, secondName, thirdName;
	private ArrayList<Status> stati = new ArrayList<Status>();
	private CharEigenschaft charEigenschaft;
	private HashMap<Elemente, Integer> resistenzen;
	private boolean neu;
	
	private HashMap<Charakterwerte, Integer> wert;
	private Equip equip;
	
	private int exp;
	private ArrayList<History> history;
	
	private Image charPic;

	public HashMap<Charakterwerte, Integer> getWert() {
		return wert;
	}

	public void setWert(HashMap<Charakterwerte, Integer> wert) {
		this.wert = wert;
	}
	
	
	
	
	
}
