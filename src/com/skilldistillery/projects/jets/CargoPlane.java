package com.skilldistillery.projects.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {

	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	@Override
	public void loadCargo() {
		System.out.println("Cargo Jets are now all loaded!");

	}

}
