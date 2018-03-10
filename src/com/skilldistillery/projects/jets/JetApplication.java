package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class JetApplication {
	static AirField airField = new AirField();
	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Jet information section.");
		displayUserMenu();

	}

	private static void launch() {

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

		int userInput = kb.nextInt();
		Jet[] jets = airField.getJets();

		if ((userInput < 1) || (userInput > 8)) {
			System.out.println();
			System.err.println("I know you like planes, so use your common sense and choose again!");
			System.out.println();
			displayUserMenu();

		} else if (userInput == 1) {
			System.out.println("\nHere is the list of jets we have in stock: ");
			for (int i = 0; i < jets.length; i++) {
				if (jets[i] != null) {
					System.out.println(jets[i].getModel());

				}
			} 
			chooseAgain();
		}
		else if (userInput == 2) {
			
		}

	}
	private static void chooseAgain() {
		System.out.println("\nWhat would you like to do now?");
		System.out.println("1. Go back to the main menu");
		System.out.println("2. Quit");
		System.out.println();
		int userTryAgain = kb.nextInt();
		
		if ((userTryAgain != 1) && (userTryAgain !=2)) {
			System.err.println("That is not an option, please choose only \"1\" or \"2\".");
			chooseAgain();
		}
		
		else if (userTryAgain ==1) {
			displayUserMenu();
		}
		
		else if(userTryAgain == 2){
			System.out.println("Goodbye, thank you for using our info system.");
			System.exit(0);
		}

	}

}
