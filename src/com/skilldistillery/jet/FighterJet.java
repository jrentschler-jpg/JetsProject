package com.skilldistillery.jet;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String typeOfJet,String model, double speed, int range, long price) {
		super(typeOfJet,model, speed, range, price);
	}
	public FighterJet() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fight () {
		System.out.println("Ladies and Gentlemen, the " + getModel() + " is locked and loaded for a DogFight!" );
	}
	@Override
	public void fly() {
		System.out.println("Watch us take down the enemy!!");
		
	}
}
