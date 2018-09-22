package Model;

import java.util.HashMap;

public class Flight {
    
	private HashMap<Airport, Airport> flightdata;
 
//---------------------------------------------------------------------
// CONSTRUCTOR	
	
	public Flight(Airport departAirport, Airport destAirport) {
		this.flightdata = new HashMap<Airport, Airport>();
		this.flightdata.put(departAirport, destAirport);
}
	
//---------------------------------------------------------------------
// GETTERS & SETTERS    
    
   public HashMap<Airport, Airport> getFlightdata() {
		return flightdata;
	}
   
	public void setFlightdata(HashMap<Airport, Airport> flightdata) {
		this.flightdata = flightdata;
	}
 
// -------------------------------------------------------
// TOSTRING
	
@Override
    public String toString(){
		for(Airport airport : this.flightdata.keySet()) {
			return "(" + airport + "-" + this.flightdata.get(airport) + ")";
		}
		return null;
    } 
 }