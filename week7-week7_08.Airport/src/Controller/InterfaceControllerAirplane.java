package Controller;

import Model.Airplane;

public interface InterfaceControllerAirplane {
	
	String getPlaneID(Airplane airplane);
	void changePlaneID(Airplane airplane, String planeID);
	void changeCapacity(Airplane airplane, Integer capacity);
	void addAirplane(String planeID, Integer capacity);
	Airplane getAirplane(String planeID);
	void deleteAirplane(String planeID);

}
