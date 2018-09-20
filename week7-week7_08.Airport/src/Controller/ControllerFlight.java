package Controller;

import java.util.HashMap;
import java.util.Map;

import Model.Airplane;
import Model.Airport;
import Model.Flight;

public class ControllerFlight implements InterfaceControllerFlight{
	
	Map<String, Flight> flights;
	

//---------------------------------------------------------------------
// CONSTRUCTOR	

	public ControllerFlight() {
		this.flights = new HashMap<String, Flight>();
	}
	
	
//---------------------------------------------------------------------
// METHODS
	
	public void addFlight(String planeID, String departAirport, String destAirport) {
		this.flights.put(planeID, new Flight(planeID));
		if()
		this.flights.get(planeID).setFlights(flightdata);
	}

	@Override
	public Airplane getAirplane(Flight flight) {
		return flight.getAirplane();
	}

	@Override
	public void changeAirplane(Flight flight, Airplane airplane) {
		flight.setAirplane(airplane);
	}

	@Override
	public Airport getDepartureAirport(Flight flight) {
		for(Airport airport : flight.getAirports().keySet()) {
			return airport;
		}
		return null;
	}

	@Override
	public void changeDepartureAirport(Flight flight, Airport airport) {
		HashMap<Airport, Airport> temp = new HashMap<Airport, Airport>();
		temp.put(this.getDepartureAirport(flight), flight.getAirports().get(this.getDepartureAirport(flight)));
		flight.getFlightdata().remove(flight.getAirplane());
		flight.getFlightdata().get(flight.getAirplane()).put(airport, temp.get(this.getDepartureAirport(flight)));
	}


	@Override
	public Airport getDestinyAirport(Flight flight) {
		return flight.getFlightdata().get(flight.getAirplane()).get(this.getDepartureAirport(flight));
		
	}

	@Override
	public void changeDestinyAirport(Flight flight, Airport airport) {
		flight.getFlightdata().get(flight.getAirplane()).replace(this.getDepartureAirport(flight), airport);
	}
	
//---------------------------------------------------------------------
// GETTERS & SETTERS		

	public Map<String, Flight> getFlights() {
		return flights;
	}


	public void setFlights(Map<String, Flight> flights) {
		this.flights = flights;
	}
}
