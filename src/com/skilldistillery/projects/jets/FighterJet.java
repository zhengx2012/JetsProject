package com.skilldistillery.projects.jets;

public class FighterJet extends Jet implements CombatReady{
	
	public FighterJet() {
		
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fight() {
		
		
	}
	

}
