package View;


import java.util.Scanner;

import Model.Airplane;
import Model.Airport;
import Model.Flight;
import Controller.*;

public class IO {
	
	Scanner reader;
	ControllerAirplane controllerAirplane = new ControllerAirplane();
	ControllerFlight controllerFlight = new ControllerFlight();
	ControllerAirport controllerAirport = new ControllerAirport();
	
// --------------------------------------------------------------------
// CONSTRUCTOR	
	
	public IO(Scanner reader) {
		this.reader = reader;
	}
	
// --------------------------------------------------------------------
// METHODS	

	public void addPlane(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        
        System.out.print("Give plane capacity: ");
        Integer planeCapacity = Integer.parseInt(reader.nextLine());
        
        controllerAirplane.addAirplane(planeID, planeCapacity);
    }
	
	public void printPlaneInfo(){
	     System.out.print("Give plane ID: ");
	     String planeID = reader.nextLine();
	     System.out.println("\n" + this.controllerAirplane.getAirplane(planeID));
	}
	
	public void printPlanes(){
		System.out.println("");
        for(Airplane airplane : this.controllerAirplane.getAirplanes().values()){
            System.out.println(airplane);
        }
        System.out.println("");
    }
	
	public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departAirport = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destAirport = reader.nextLine();
        
        this.controllerAirport.checkAirports(departAirport, destAirport);
        
        Airplane thisAirplane = this.controllerAirplane.getAirplane(planeID);
        Airport thisDepartAirport = this.controllerAirport.getAirport(departAirport);
        Airport thisDestAirport = this.controllerAirport.getAirport(destAirport);
        Flight thisFlight = this.controllerFlight.createFlight(thisDepartAirport, thisDestAirport);
        
        this.controllerFlight.addFlight(thisAirplane, thisFlight);
    }
	
	public void printFlights(){
		System.out.println("");
        for(Airplane airplane : this.controllerFlight.getFlights().keySet()) {
            for(Flight flight : this.controllerFlight.getFlights().get(airplane)) {
            	System.out.print(airplane + " " + flight + "\n");
            }
        }        
    }
}