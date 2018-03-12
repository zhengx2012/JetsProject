package com.skilldistillery.projects.jets;

public class AirField {

	public Jet[] jets = new Jet[6];

	public AirField() {
		Jet cargo1 = new CargoPlane("Boeing 777 Freighter", 901.21, 9065, 295_700_000);
		Jet cargo2 = new CargoPlane("Boeing Dreamlifter", 878.00, 7800, 232_000_000);
		Jet fighter1 = new FighterJet("A-10 Warthog", 833.62, 4148, 20_000_000);
		Jet fighter2 = new FighterJet("F 15E Strike Eagle", 2655.35, 3889, 36_000_000);
		Jet plain1 = new PlainJet("Boeing BBJ", 827.18, 7223, 65_000_000);

		jets[0] = cargo1;
		jets[1] = cargo2;
		jets[2] = fighter1;
		jets[3] = fighter2;
		jets[4] = plain1;

	}

	public void addJets(int userAddJets) {
		int arrayLength = 0;
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				arrayLength = i++;
			}
		}
		if (userAddJets == 1) {
			Jet newFighterJet = new CargoPlane();
			jets[arrayLength] = newFighterJet;
		}

		else if (userAddJets == 2) {
			Jet newFighterJet = new FighterJet();
			jets[arrayLength] = newFighterJet;
		}

		else if (userAddJets == 3) {
			Jet newPlainJet = new PlainJet();
			jets[arrayLength] = newPlainJet;
		}

	}

	public Jet[] getJets() {
		return jets;
	}

	public void setJets(Jet[] jets) {
		this.jets = jets;
	}

	public void addCargoJets(String inputModel, double inputSpeed, int inputRange, long inputPrice) {
		Jet newJet = new CargoPlane(inputModel, inputSpeed, inputRange, inputPrice);
		jets[5] = newJet;

	}

	public void addFighterJets(String inputModel, double inputSpeed, int inputRange, long inputPrice) {
		Jet newJet = new FighterJet(inputModel, inputSpeed, inputRange, inputPrice);
		jets[5] = newJet;

	}

	public void addPlainJets(String inputModel, double inputSpeed, int inputRange, long inputPrice) {
		Jet newJet = new PlainJet(inputModel, inputSpeed, inputRange, inputPrice);
		jets[5] = newJet;

	}

}
