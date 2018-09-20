package Controller;

import Model.Airplane;
import Model.Airport;
import Model.Flight;

public interface InterfaceControllerFlight {
	
	Airplane getAirplane(Flight flight);
	void changeAirplane(Flight flight, Airplane airplane);
	
	Airport getDepartureAirport(Flight flight);
	void changeDepartureAirport(Flight flight, Airport airport);
	
	Airport getDestinyAirport(Flight flight);
	void changeDestinyAirport(Flight flight, Airport airport);
}
