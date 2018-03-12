package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class JetApplication {
	static AirField airField = new AirField();
	static Jet[] jets = airField.getJets();
	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		launch();
	}

	private static void launch() {
		System.out.println("Welcome to the Jet information section.");
		displayUserMenu();

	}

	private static void displayUserMenu() {
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all Jets");
		System.out.println("3. View fastest Jet");
		System.out.println("4. View Jet with the longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a Jet to the FLeet");
		System.out.println("8. Quit");
		System.out.print("\n> ");

		int userInput = kb.nextInt();

		if ((userInput < 1) || (userInput > 8)) {
			System.out.println();
			System.err.println("I know you like planes, so use your common sense and choose again!");
			System.out.println();
			displayUserMenu();

		}

		else if (userInput == 1) {
			System.out.println("\nHere is the list of jets we have in stock: ");
			for (int i = 0; i < jets.length; i++) {
				if (jets[i] != null) {
					System.out.println(jets[i].toString());
				}
			}
			chooseAgain();
		}

		else if (userInput == 2) {
			System.out.println("\nJets getting ready for take off....");
			System.out.println();
			for (int i = 0; i < jets.length; i++) {
				if (jets[i] != null) {
					Jet jet = jets[i];
					jet.fly(jets[i]);
				}
			}
			chooseAgain();

		}

		else if (userInput == 3) {
			Jet fastestJet = jets[0];
			for (int i = 0; i < jets.length; i++) {
				if (jets[i] != null) {
					if (jets[i].getSpeed() > fastestJet.getSpeed()) {
						fastestJet = jets[i];
					}
				}
			}
			System.out.println();
			System.out.println("The fastest Jet is: " + fastestJet.getClass().getSimpleName() + " "
					+ fastestJet.getModel() + " with a speed of " + fastestJet.getSpeed() + " km/h");
			chooseAgain();

		}

		else if (userInput == 4) {
			Jet longestRange = jets[0];
			for (int i = 0; i < jets.length; i++) {
				if (jets[i] != null) {
					if (jets[i].getRange() > longestRange.getRange()) {
						longestRange = jets[i];
					}
				}
			}
			System.out.println();
			System.out.println("The Jet  with the longest range is: " + longestRange.getClass().getSimpleName() + " "
					+ longestRange.getModel() + " with a range of " + longestRange.getRange() + " km");
			chooseAgain();
		}

		else if (userInput == 5) {
			System.out.println("Thank you for browsing, this option is not yet available");
			chooseAgain();
		}

		else if (userInput == 6) {
			System.out.println("Thank you for browsing, this option is not yet available");
			chooseAgain();

		}

		else if (userInput == 7) {
			int userAddJet = 0;

			do {
				System.out.println("\nWhat type of Jet would you like to add?");
				System.out.println("1. Cargo Jets");
				System.out.println("2. Fighter Jets");
				System.out.println("3. Plain Jets");
				System.out.print("\n> ");
				userAddJet = kb.nextInt();

				airField.addJets(userAddJet);
				userInputJetData(userInput);

				if (((userAddJet < 1) || (userAddJet > 3))) {
					System.err.println("\nIt's easy as 123! So choose between 1 and 3.");
					System.out.print("\n> ");
				}

			} while ((userAddJet < 1) || (userAddJet > 3));
			chooseAgain();
		}

		else if (userInput == 8) {
			System.out.println("Goodbye, thank you for browing our Jet information.");
			System.exit(0);
		}
	}

	private static void chooseAgain() {
		System.out.println("\nWhat would you like to do now?");
		System.out.println("1. Go back to the main menu");
		System.out.println("2. Quit");
		System.out.print("\n> ");
		int userTryAgain = kb.nextInt();

		if ((userTryAgain != 1) && (userTryAgain != 2)) {
			System.err.println("That is not an option, please choose only \"1\" or \"2\".");
			System.out.print("\n> ");
			chooseAgain();
		}

		else if (userTryAgain == 1) {
			displayUserMenu();
		}

		else if (userTryAgain == 2) {
			System.out.println("Goodbye, thank you for browing our Jet information.");
			System.exit(0);
		}

	}

	// plug userInputs into an Array and pass that to the Jets array
	private static void userInputJetData(int userInput) {
		System.out.println("What is the model name?");
		String inputModel = kb.next();

		System.out.println("\nWhat is the speed in km?");
		double inputSpeed = kb.nextDouble();

		System.out.println("\nWhat is range in km?");
		int inputRange = kb.nextInt();

		System.out.println("\nHow much is the jet?");
		long inputPrice = kb.nextLong();

			airField.addPlainJets(inputModel, inputSpeed, inputRange, inputPrice);
//		if (userInput == 1) {
//			airField.addCargoJets(inputModel, inputSpeed, inputRange, inputPrice);
//		}
//		else if (userInput == 2) {
//			airField.addFighterJets(inputModel, inputSpeed, inputRange, inputPrice);
//		}
//		else if (userInput == 3) {
//			airField.addPlainJets(inputModel, inputSpeed, inputRange, inputPrice);
//		}

	}

}
