package com.skilldistillery.jet;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String typeOfJet,String model, double speed, int range, long price) {
		super(typeOfJet,model, speed, range, price);
	}

	public CargoPlane() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void loadCargo() {
		System.out.println("The fellow airman are loading cargo on this aircraft.");
	}

	@Override
	public void fly() {
		System.out.println("Ladies and Gentleman, this Cargo Plane " + getModel()
				+ " you currently are on, has reached cruising altitude.");
		double time = getRange() / getSpeed();
		System.out.println("Thes Cargo Plane " + getModel() + "flies at " + getSpeed() + "MPH.");
		System.out.println("The cost for this Cargo Plane is: $" + getPrice());
		System.out.println("The time this " + getModel() + " can travel without stopping for fuel is: " + time);
		System.out.println("The coverage range is: " + getRange());

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
}
