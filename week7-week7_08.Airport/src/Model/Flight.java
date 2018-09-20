package Model;

import java.util.HashMap;
import java.util.Map;

public class Flight {
    
	private String code;
	private Map<Airplane, HashMap<Airport, Airport>> flightdata;
 
//---------------------------------------------------------------------
// CONSTRUCTOR	
	
	public Flight(String code) {
		this.code = code;
		this.flightdata = new HashMap<Airplane,HashMap<Airport, Airport>>();
}
	
//---------------------------------------------------------------------
// METHODS  
	
	public Airplane getAirplane() {
		for(Airplane airplane : this.getFlightdata().keySet()) {
			return airplane;
		}
		return null;
	}
	
	public HashMap<Airport, Airport> getAirports(){
		return this.getFlightdata().get(this.getAirplane());
	}
	
	public void setAirplane(Airplane airplane) {
		HashMap<Airplane, HashMap<Airport, Airport>> temp = new HashMap<Airplane, HashMap<Airport, Airport>>();
		temp.put(this.getAirplane(), this.getAirports());
		this.flightdata.remove(this.getAirplane());
		this.flightdata.put(airplane, temp.get(this.getAirplane()));
	}
	
//---------------------------------------------------------------------
// GETTERS & SETTERS    
    
   public Map<Airplane, HashMap<Airport, Airport>> getFlightdata() {
		return flightdata;
	}
   
	public void setFlights(Map<Airplane, HashMap<Airport, Airport>> flightdata) {
		this.flightdata = flightdata;
	}
	
// -------------------------------------------------------
// HASHCODE & EQUALS

	@Override
	public int hashCode() {
		return Integer.parseInt(this.code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
 
// -------------------------------------------------------
// TOSTRING
	
@Override
    public String toString(){
		for(Airport airport : this.getAirports().keySet()) {
			Airport departAirport = airport;
			return "(" + departAirport + "-" + this.getAirports().get(departAirport) + ")";
		}
		return null;
    } 
 }