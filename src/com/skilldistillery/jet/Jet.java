package com.skilldistillery.jet;

public abstract class Jet {
	private String typeOfJet;
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public Jet(String typeOfJet,String model, double speed, int range, long price) {
		super();
		this.typeOfJet = typeOfJet;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		
	}
	public Jet() {
		
	}

	public String getTypeOfJet() {
		return typeOfJet;
	}

	public void setTypeOfJet(String typeOfJet) {
		this.typeOfJet = typeOfJet;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	public abstract void fly();
	
	public double getSpeedInMach(double speedInMph) {
//		double speedInMach = speedInMph/767.269; //verify calculations
//		Object getSpeedInMach = null;
		double speedInMach = speedInMph/range; 
		return speedInMach;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [typeOfJet=").append(typeOfJet).append(", model=").append(model).append(", speed=")
				.append(speed).append(", range=").append(range).append(", price=").append(price).append("]");
		return builder.toString();
	}



	

}
