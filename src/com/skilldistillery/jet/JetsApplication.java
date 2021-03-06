package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JetsApplication {
	private AirField airField;
	private Scanner scanner;


	public static void main(String[] args) {
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.launch(jetsApp);
	}

	public JetsApplication() {
		airField = new AirField();
	}

	private void launch(JetsApplication jetsApp) {
	
		Scanner scanner = new Scanner(System.in);
		jetsApp.intializeJetDatabase();
		jetsApp.displayUserMenu();
		
	}

	private void displayUserMenu() {
		int select = 0;
		while (select != 9) {
			System.out.println();
			System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
			System.out.println("                                                                                 ");
			System.out.println("-----***-----         WELCOME, TO JOURDAN'S FLEET OF JETS!          -----***-----");
			System.out.println("                                                                                 ");
			System.out.println("-----***----------***----------***----------***----------***----------***--------");
			System.out.println("                                                                                 ");
			System.out.println("   >>PLEASE MAKE A SELECTION FROM THE FOLLOWING MENU OPTIONS:                    ");
			System.out.println("                                                                                 ");
			System.out.println("   >>1. LIST THE FLEET OF JETS                                                              ");
			System.out.println("   >>2. FLY ALL OF THE JETS                                                          ");
			System.out.println("   >>3. VIEW THE FASTEST JET                                                          ");
			System.out.println("   >>4. VIEW THE JET WITH THE LONGEST RANGE                                              ");
			System.out.println("   >>5. LOAD ALL OF THE CARGO JETS                                                      ");
			System.out.println("   >>6. LET'S HAVE A DOGFIGHT !*!*!                                                                ");
			System.out.println("   >>7. ADD A JET TO THE FLEET                                                      ");
			System.out.println("   >>8. REMOVE A JET FROM THE FLEET                                                 ");
			System.out.println("   >>9. QUIT                                                                     ");
			System.out.println("                                                                                 ");
			System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
			System.out.println("                                                                                 ");
			System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
			System.out.println("                                                                                 ");
			System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");

			scanner = new Scanner(System.in);
			select = scanner.nextInt();
			boolean keepGoing = true;

			switch (select) {
			case 1:
				listFleetAirField();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				viewFastestJet();
				break;
			case 4:
				jetWithLongestRange();
				break;
			case 5:
				loadAllCargoJets();
				break;
			case 6:
				dogFight();
				break;
			case 7:
				addNewJet(scanner);
				break;
			case 8:
				 removeJet(scanner, 0);
				 break;
//			case 9:
//				getSpeedInMach();
//				break;
			case 9:
				 quitProgram();
				keepGoing = false;
				 break;

			default:
				System.out.println("MAYDAY! MAYDAY! WE HAVE A PROBLEM...Clearly you are not a pilot!");
				break;
			}

		}

	}

	

	private void quitProgram() {
	System.out.println("I don't know about you, but I am EXHAUSTED from JETS! Let's go get a DRINK :)!!!");
		
	}

	private void intializeJetDatabase() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
//			    Jet jet = new Jet (fields[0], Double.parseDouble(fields[1]),Integer.parseInt(fields[2]),Long.parseLong(fields[3]));
				Jet jet;
				switch (fields[0]) {
				case "CargoPlane":
					jet = new CargoPlane(fields[0], fields[1], Double.parseDouble(fields[2]),
							Integer.parseInt(fields[3]), Long.parseLong(fields[4]));
					break;
				case "FighterJet":
					jet = new FighterJet(fields[0], fields[1], Double.parseDouble(fields[2]),
							Integer.parseInt(fields[3]), Long.parseLong(fields[4]));
					break;
				case "PassengerJet":
					jet = new PassengerJet(fields[0], fields[1], Double.parseDouble(fields[2]),
							Integer.parseInt(fields[3]), Long.parseLong(fields[4]));
					break;
				default:
					jet = new GenericJet(fields[0], fields[1], Double.parseDouble(fields[2]),
							Integer.parseInt(fields[3]), Long.parseLong(fields[4]));

				}
				airField.addNewJet(jet);
			}
		} catch (IOException e) {
			System.err.println(e);
		}

		
		
	}

	private void listFleetAirField() {
		List<Jet> listJets = airField.getJets();
		for (Jet jet : listJets) {
			System.out.println(jet);
		}
	}

	private void flyAllJets() {
		List<Jet> listJets = airField.getJets();
		for (Jet jet : listJets) {
			jet.fight();
			jet.fly();
		}
	}

	private void viewFastestJet() {

		List<Jet> listJets = airField.getJets();
		Jet s1 = listJets.get(0);
		for (Jet jet : listJets) {
			if (jet.getSpeed() > s1.getSpeed()) {
				s1 = jet;
			}
		}
		System.out.println(s1.toString());
//	System.out.printf("");

	}

	private void jetWithLongestRange() {
		List<Jet> listJets = airField.getJets();
//	Jet s1 = new Jet();
		Jet s1 = listJets.get(0);
		for (Jet jet : listJets) {
			if (jet.getRange() > s1.getRange()) {
				s1 = jet;
			}
		}
		System.out.println(s1.toString());
//	System.out.printf("");
	}

	private void loadAllCargoJets() {
		List<Jet> listJets = airField.getJets();
		CargoPlane cp;
		for (Jet jet : listJets) {
			if (jet instanceof CargoPlane) {
				cp = new CargoPlane(jet.getTypeOfJet(), jet.getModel(), jet.getSpeed(), jet.getRange(), jet.getPrice());
				cp.loadCargo();
			}
		}
	}

	private void dogFight() {
		List<Jet> listJets = airField.getJets();

		for (Jet jet : listJets) {
			if (jet instanceof CombatReady) {
//					fightJ = (CombatReady)new FighterJet(jet.getTypeOfJet(),jet.getModel(), jet.getSpeed(), jet.getRange(), jet.getPrice());
				((CombatReady) jet).fight();
			}

		}
	}
	private void addNewJet(Scanner scanner) {

		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
		System.out.println("------------------------- ADD NEW CUSTOM JETS HERE-------------------------------");
		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
		System.out.println("                                                                                 ");
		System.out.println("------------Please enter the kind of custom jet you want to add:            ");
		System.out.println("                                                                                 ");
		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");

		String typeOfJet;
		double speed;
		int range;
		long price;
		Jet j1 = new GenericJet();

		
		System.out.println("What type of plane would you like to add? Cargo, fighter, passenager");
		typeOfJet = scanner.next().toLowerCase();
		switch(typeOfJet) {
		case "cargo":
			j1 = new CargoPlane();
			break;
		case "fighter":
			j1 = new FighterJet();
			break;
		case "passenger":
			
		case "passenger jet":
			j1 = new PassengerJet();
			break;
		}
		System.out.println("Type of Jet: ");
		j1.setTypeOfJet(scanner.next());
		System.out.println("---> 1. Add Custom Jet Model Name: ");
		j1.setModel(scanner.next());
		System.out.println("---> 2. Enter Speed Of New Jet: ");
		j1.setSpeed(scanner.nextDouble());
		System.out.println("---> 3. Enter Range Of New Jet: ");
		j1.setRange(scanner.nextInt());
		System.out.println("---> 4. Enter Price Of New Jet: ");
		j1.setPrice(scanner.nextLong());
		System.out.println(j1.toString());
		airField.addNewJet(j1);

	}
	private void removeJet(Scanner scanner, int index) {
		List<Jet> listJets = airField.getJets();
//		System.out.println("The list of jets in your fleet: ");
//		for (int i = 0; i < listJets.size(); i++) {
		int i = 0;
		for (Jet jet : listJets) {
			System.out.println(i + " " + jet.getModel());
			
			i++;
		}	
		System.out.println();
		System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
		System.out.println("Please enter in the number associated with the Jet you would like to remove: ");
//		System.out.println(listJets);
		int removeJet = scanner.nextInt();
		airField.removeJet(removeJet);
	}
		
	}
