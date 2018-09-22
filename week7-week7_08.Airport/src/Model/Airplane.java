package Model;

public class Airplane{
    
    private String planeID;
    private Integer capacity;

    public Airplane(String planeID, Integer capacity) {
		this.planeID = planeID;
		this.capacity = capacity;
	}
	
// -------------------------------------------------------
// HASHCODE & EQUALS
	
	@Override
	public int hashCode() {
		return this.planeID.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		if (planeID == null) {
			if (other.planeID != null)
				return false;
		} else if (!planeID.equals(other.planeID))
			return false;
		return true;
	}
	
//---------------------------------------------------------------------
// GETTERS & SETTERS
	    
	    public String getPlaneID() {
			return planeID;
		}

		public void setPlaneID(String planeID) {
			this.planeID = planeID;
		}

		public Integer getCapacity() {
			return capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}
	
// -------------------------------------------------------
// TOSTRING

	@Override
    public String toString(){
        return this.planeID + " (" + this.capacity + " ppl)";
    }


        

}