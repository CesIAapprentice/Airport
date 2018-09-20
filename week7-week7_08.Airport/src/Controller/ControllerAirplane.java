package Controller;

import java.util.HashMap;
import java.util.Map;

import Model.Airplane;

public class ControllerAirplane implements InterfaceControllerAirplane{
	
	Map<String, Airplane> airplanes;

//---------------------------------------------------------------------
// CONSTRUCTOR   
	
	public ControllerAirplane() {
		this.airplanes = new HashMap<String, Airplane>();
	}
	
//---------------------------------------------------------------------
// METHODS

	@Override
	public String getPlaneID(Airplane airplane) {
		return airplane.getPlaneID();
	}
	
	@Override
	public void changePlaneID(Airplane airplane, String planeID) {
		this.deleteAirplane(planeID);
		this.airplanes.put(planeID, airplane);
	}

	@Override
	public void changeCapacity(Airplane airplane, Integer capacity) {
		airplane.setCapacity(capacity);
		
	}

	@Override
	public void addAirplane(String planeID, Integer capacity) {
		this.airplanes.put(planeID, new Airplane(planeID, capacity));
		
	}

	@Override
	public Airplane getAirplane(String planeID) {
		return this.airplanes.get(planeID);
	}

	@Override
	public void deleteAirplane(String planeID) {
		this.airplanes.remove(planeID);
	}

}
