package com.skilldistillery.jet;

import java.util.List;
import java.util.Scanner;

public class JetsApplication {
	private AirField airField;
	private Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public JetsApplication() {
		airField = new AirField();
	}

	private void launch() {
		// TODO Auto-generated method stub
	}

	private void displayUserMenu() {
		int select = 0;
		while (select != 9) {
			System.out.println();
			System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
			System.out.println("                                                                                 ");
			System.out.println("-----***-----         WELCOME, TO JOURDAN'S JET'S FLEET             -----***-----");
			System.out.println("                                                                                 ");
			System.out.println("-----***----------***----------***----------***----------***----------***--------");
			System.out.println("                                                                                 ");
			System.out.println("   >>PLEASE SELECTION FROM THE FOLLOWING MENU OPTIONS:                           ");
			System.out.println("                                                                                 ");
			System.out.println("   >>1. LiSt FlEet                                                               ");
			System.out.println("   >>2. FlY aLl JeTs                                                             ");
			System.out.println("   >>3. ViEw FaStEsT jEt                                                         ");
			System.out.println("   >>4. ViEw JeT wItH lOnGeSt RaNgE                                              ");
			System.out.println("   >>5. LoAd AlL cArGo JeTs                                                      ");
			System.out.println("   >>6. DoGfIgHt!                                                                ");
			System.out.println("   >>7. AdD a JeT fRoM fLeEt                                                     ");
			System.out.println("   >>8. ReMoVe a JeT fRoM fLeEt                                                  ");
			System.out.println("   >>9. QuIt                                                                     ");
			System.out.println("                                                                                 ");
			System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
			System.out.println("                                                                                 ");
			System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");
			System.out.println("                                                                                 ");
			System.out.println("-----***-----***-----***----------***----------***----------***----------***-----");

			scanner = new Scanner(System.in);
			select = scanner.nextInt();

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
				//jetWithLongestRange();
				//break;
			}
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
			jet.fly();
		}
	}
private void viewFastestJet() {
	
	List<Jet> listJets = airField.getJets();
	int s = 0;
	Jet s1 = s1.getSpeed());
	s1.setSpeed(65);
	for (Jet jet : listJets) {
		if(jet.getSpeed() > s1.getSpeed()) {
			s1 = jet;
		}
		
	}
	System.out.println(s1.toString());
//	System.out.printf("");
	
}
private void jetWithLongestRange() {
	List<Jet> listJets = airField.getJets();
	Jet s = new Jet();
	s.setRange(65);
	for (Jet jet : listJets) {
		if(jet.getRange() > s.getRange()) {
			s = jet;
		}
	}
	System.out.println(s.toString());
}

























}
