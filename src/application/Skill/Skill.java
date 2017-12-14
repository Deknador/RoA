package application.Skill;

import java.util.ArrayList;
import java.util.HashMap;

import application.Status;

public class Skill {
	
	
	private Skillcategory sc;
	private ArrayList<Sideskill> sideskills;
	
	private String name, beschreibung, formel;
	private int kostenExp, kosten;
	private ArrayList<Status> vorraussetzungAnwendung;
	private ArrayList<Skill> voraussetzungSkill;
	private ArrayList<Sideskill> voraussetzungSideskill;
	private HashMap<Status, Integer> voraussetzungWert;
	private String art;
	
	private int dicecount; 
	private int dicenumber;
	private int diceeyes;
	
	
	
	
	
	
	
	
	
	public Skillcategory getSc() {
		return sc;
	}
	public void setSc(Skillcategory sc) {
		this.sc = sc;
	}
	public ArrayList<Sideskill> getSideskills() {
		return sideskills;
	}
	public void setSideskills(ArrayList<Sideskill> sideskills) {
		this.sideskills = sideskills;
	}
}
