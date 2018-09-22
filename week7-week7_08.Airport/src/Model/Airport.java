package Model;

import java.util.ArrayList;
import java.util.List;

import Controller.ControllerAirport;

public class Airport{
    
    private String code;
    
//---------------------------------------------------------------------
// CONSTRUCTOR     
    
    public Airport(String code) {
		this.code = code;
	}

//---------------------------------------------------------------------
// HASHCODE & EQUALS	

	@Override
	public int hashCode() {
		return this.code.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
//---------------------------------------------------------------------
// GETTERS & SETTERS    

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		
//---------------------------------------------------------------------
// TOSTRING    

		@Override
		public String toString() {
			return this.code;
		}
    
}