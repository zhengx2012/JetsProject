package com.skilldistillery.projects.jets;

public class AirField {
	
	private Jet [] jets;
	
	public AirField() {
		Jet cargo1 = new CargoPlane("Boeing 777 Freighter", 901.21 , 9065, 295_700_000);
		Jet cargo2 = new CargoPlane("Boeing Dreamlifter", 878.00, 7800, 232_000_000);
		Jet fighter1 = new FighterJet("A-10 Warthog", 833.62, 4148, 20_000_000);
		Jet fighter2 = new FighterJet("F 15E Strike Eagle", 2655.35, 3889, 36_000_000);
		Jet plain1 = new PlainJet("Boeing BBJ", 827.18, 7223, 65_000_000);
		
		Jet [] jets = new Jet[100];
		jets[0] = cargo1;
		jets[1] = cargo2;
		jets[2] = fighter1;
		jets[3] = fighter2;
		jets[4] = plain1;
		
	}

}
