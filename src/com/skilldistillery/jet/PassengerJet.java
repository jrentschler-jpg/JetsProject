package com.skilldistillery.jet;

public class PassengerJet extends Jet {
		public PassengerJet(String typeOfJet, String model, double speed, int range, long price)  {
			super(typeOfJet,model, speed, range, price);
			
		}

		public PassengerJet() {
			// TODO Auto-generated constructor stub
		}

//		@Override
//		public void fly() {
//			// TODO Auto-generated method stub
//			
//		}
		@Override
		public void fly() {
			System.out.println("Please remain seated and buckled until the seat-belt sign goes off!");
		}
}
