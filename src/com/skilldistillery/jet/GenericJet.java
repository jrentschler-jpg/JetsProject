package com.skilldistillery.jet;

public class GenericJet extends Jet {

	public GenericJet(String typeOfJet, String model, double speed, int range, long price) {
		super(typeOfJet, model, speed, range, price);
		
	}

	public GenericJet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("This is a Generic Jet!");

	}

}
