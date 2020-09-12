package com.skilldistillery.jet;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	@Override
	public void fight () {
		System.out.println("Ladies and Gentlemen, the " + getModel() + "is locked and loaded for a DogFight!" );
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
