package com.skilldistillery.projects.jets;

import java.util.ArrayList;

public class AirField {
	
	public ArrayList<Jet> jets = new ArrayList<Jet>();
	
	public AirField() {
		Jet cargo1 = new CargoPlane("Boeing 777 Freighter", 901.21 , 9065, 295_700_000);
		Jet cargo2 = new CargoPlane("Boeing Dreamlifter", 878.00, 7800, 232_000_000);
		Jet fighter1 = new FighterJet("A-10 Warthog", 833.62, 4148, 20_000_000);
		Jet fighter2 = new FighterJet("F 15E Strike Eagle", 2655.35, 3889, 36_000_000);
		Jet plain1 = new PlainJet("Boeing BBJ", 827.18, 7223, 65_000_000);
		
		jets.add(cargo1);
		jets.add(cargo2);
		jets.add(fighter1);
		jets.add(fighter2);
		jets.add(plain1);
		
	}
	
	public void addJets() {
		System.out.println("What type of Jet would you like to add?");
		System.out.println("1. Cargo Jets");
		System.out.println("2. Fighter Jets");
		System.out.println("3. Plain Jets");
	}

	public ArrayList<Jet> getJets() {
		return jets;
	}

	public void setJets(ArrayList<Jet> jets) {
		this.jets = jets;
	}

}
