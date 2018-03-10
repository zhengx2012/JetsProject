package com.skilldistillery.projects.jets;

import java.util.Scanner;

public class JetApplication {
	static AirField airField = new AirField();
	private static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the Jet ");
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

		if ((userInput < 1) || (userInput > 8)) {
			System.out.println("I know you like planes, so use you common sense and choose again!");
			System.out.println();
			displayUserMenu();

		} else if (userInput == 1) {
			Jet[] jets = airField.getJets();
			if (userInput == 1) {
				for (int i = 0; i < jets.length; i++) {
					if (jets[i] != null) {
						System.out.println(jets[i].getModel());
						
					}
				}
			}
		}

	}

}
