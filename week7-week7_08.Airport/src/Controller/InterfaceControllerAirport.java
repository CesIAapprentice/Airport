package Controller;

import Model.Airport;

public interface InterfaceControllerAirport {
	
	void changeCode(Airport airport, String code);
	void addAirport(String code);
	Airport getAirport(String code);
	void deleteAirport(String code);
	

}
