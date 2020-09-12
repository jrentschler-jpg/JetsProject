package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class AirField {
	private List<Jet> jets; //= new ArrayList<>();
	
	public AirField() {
		jets = new ArrayList<Jet>();
		
//		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets")) ) {
//			  String line;
//			  while ((line = bufIn.readLine()) != null) {
//			    String [] fields = line.split(",");
////			    Jet jet = new Jet (fields[0], Double.parseDouble(fields[1]),Integer.parseInt(fields[2]),Long.parseLong(fields[3]));
//			    Jet jet;
//			    switch (fields[0]) {
//			    case "CargoPlane":
//			    	jet = new CargoPlane(fields[0],fields[1], Double.parseDouble(fields[2]),Integer.parseInt(fields[3]),Long.parseLong(fields[4]));
//			    	break;
//			    case "FighterJet":
//			    	jet = new FighterJet(fields[0],fields[1], Double.parseDouble(fields[2]),Integer.parseInt(fields[3]),Long.parseLong(fields[4]));
//			    	break;
//			    case "PassengerJet":
//			    	jet = new PassengerJet(fields[0],fields[1], Double.parseDouble(fields[2]),Integer.parseInt(fields[3]),Long.parseLong(fields[4]));
//			    	break;
//			    default: jet = new GenericJet(fields[0],fields[1], Double.parseDouble(fields[2]),Integer.parseInt(fields[3]),Long.parseLong(fields[4]));
//			    
//			    }
//			    airField.add(jet);
//			  }
//			}
//			catch (IOException e) {
//			  System.err.println(e);
//			}
//		for (Jet jet : jets) {
//			System.out.println(jet);
//			
//		} {
//		}
//		
	};
	
	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}
	public void addNewJet(Jet newJet) {
		jets.add(newJet);
	}
	public void removeJet(int index) {
		jets.remove(index);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jets == null) ? 0 : jets.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirField other = (AirField) obj;
		if (jets == null) {
			if (other.jets != null)
				return false;
		} else if (!jets.equals(other.jets))
			return false;
		return true;
	}

	
	
//	public void addJet(Jet plane) {
//		this.listJets.add(plane);
//	}
//	public void removeJet(int i) {
//		this.listJets.remove(i);
//	}
//	public List<Jet>getListJets() {
//		return listJets;
//	}
}
