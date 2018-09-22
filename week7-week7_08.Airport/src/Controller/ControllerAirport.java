package Controller;

import java.util.HashMap;
import java.util.Map;

import Model.Airport;

public class ControllerAirport implements InterfaceControllerAirport{
	
	Map<String,Airport> airports;
	
//---------------------------------------------------------------------
// CONSTRUCTOR   	

	public ControllerAirport() {
		this.airports = new HashMap<String,Airport>();
	}

//---------------------------------------------------------------------
// METHODS
	
	public void checkAirports(String departAirport, String destAirport) {
		this.checkAirports(departAirport);
		this.checkAirports(destAirport);
		
	}
	
	public void checkAirports(String airport) {
		if(!this.airports.containsKey(airport)) {
			this.airports.put(airport, new Airport(airport));
		}
	}

	@Override
	public void changeCode(Airport airport, String code) {
		this.airports.replace(code, airport);
	}
	
	@Override
	public Airport getAirport(String code) {
		return this.airports.get(code);
		
	}
	
	@Override
	public void addAirport(String code) {
		this.airports.put(code, new Airport(code));
		
	}

	@Override
	public void deleteAirport(String code) {
		this.airports.remove(code);
		
	}
	
	
//---------------------------------------------------------------------
// GETTERS & SETTERS   

		public Map<String, Airport> getAirports() {
		return airports;
	}

	public void setAirports(Map<String, Airport> airports) {
		this.airports = airports;
	}
}
