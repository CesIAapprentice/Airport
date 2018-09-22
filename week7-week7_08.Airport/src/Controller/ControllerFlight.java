package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Model.Airplane;
import Model.Airport;
import Model.Flight;

public class ControllerFlight implements InterfaceControllerFlight{
	
	Map<Airplane, ArrayList<Flight>> flights;

//---------------------------------------------------------------------
// CONSTRUCTOR	

	public ControllerFlight() {
		this.flights = new HashMap<Airplane, ArrayList<Flight>>();
	}
	
//---------------------------------------------------------------------
// METHODS
	
	public Flight createFlight(Airport departAirport, Airport destAirport) {
		return new Flight(departAirport, destAirport);
	}
	
	public void addFlight(Airplane airplane, Flight flight) {
		if(!this.flights.containsKey(airplane)) {
			this.flights.put(airplane, new ArrayList<Flight>());
		}
		if(!this.flights.get(airplane).contains(flight)) {
			this.flights.get(airplane).add(flight);
		}
	}
	
	@Override
	public Airplane getAirplane(Flight flight) {
		for(Airplane airplane : this.flights.keySet()) {
			if(this.flights.get(airplane).contains(flight)) {
				return airplane;
			}
		}
		return null;
	}

	@Override
	public void changeAirplane(Flight flight, Airplane airplane) {
		this.flights.get(airplane).remove(flight);
		this.addFlight(airplane, flight);
	}


	@Override
	public Airport getDepartureAirport(Flight flight) {
		for(Airport airport : flight.getFlightdata().keySet()) {
			return airport;
		}
		return null;
	}

	@Override
	public void changeDepartureAirport(Flight flight, Airport airport) {
		Airport destAirport = new Airport(this.getDestinyAirport(flight).getCode());
		flight.getFlightdata().remove(this.getDepartureAirport(flight));
		flight.getFlightdata().put(airport, destAirport);
	}


	@Override
	public Airport getDestinyAirport(Flight flight) {
		return flight.getFlightdata().get(this.getDepartureAirport(flight));
	}

	@Override
	public void changeDestinyAirport(Flight flight, Airport airport) {
		flight.getFlightdata().put(this.getDepartureAirport(flight), airport);
	}
	
//---------------------------------------------------------------------
// GETTERS & SETTERS		

	public Map<Airplane, ArrayList<Flight>> getFlights() {
		return flights;
	}


	public void setFlights(Map<Airplane, ArrayList<Flight>> flights) {
		this.flights = flights;
	}
}
