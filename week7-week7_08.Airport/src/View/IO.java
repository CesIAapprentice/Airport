package View;


import java.util.ArrayList;
import java.util.Scanner;

import Model.Airplane;
import Model.Flight;
import Controller.*;

public class IO {
	
	Scanner reader;
	ControllerAirplane controllerAirplane = new ControllerAirplane();
	ControllerFlight controllerFlight = new ControllerFlight();
	ControllerAirport controllerAirport = new ControllerAirport();
	
	public IO(Scanner reader) {
		this.reader = reader;
	}

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
	     System.out.println(this.controllerAirplane.getAirplane(planeID));
	}
	
	public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departAirport = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destAirport = reader.nextLine();
        
        this.controllerAirport.checkAirports(departAirport, destAirport);
        
        this.controllerFlight.addFlight(this.controllerAirport,planeID, departAirport, destAirport);
    }
	
	public void printPlanes(){
        
        for(Airplane airplane : this.controllerAirplane.getAirplanes().values()){
            System.out.println(airplane);
        }
        System.out.println("");
    }
	
	public void printFlights(){
        for(Flight flight : this.controllerFlight.getFlights().values()) {
                System.out.print(flight);
        }
        System.out.print("\n");
    }
}