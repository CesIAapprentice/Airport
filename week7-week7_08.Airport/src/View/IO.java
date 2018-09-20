package View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Model.Airplane;
import Model.Flight;
import Controller.*;

public class IO {
	
	Scanner reader;
	ControllerAirplane controllerAirplane = new ControllerAirplane();
	ControllerFlight controllerFlight = new ControllerFlight();
	
	public IO(Scanner reader) {
		this.reader = reader;
	}

	public void addPlane(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        
        System.out.print("Give plane capacity: ");
        Integer planeCapacity = Integer.parseInt(reader.nextLine());
        
        Airplane airplane = new Airplane(planeID, planeCapacity);
        controllerAirplane.addAirplane(planeID, planeCapacity);
    }
	
	public void addFlight(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departAirport = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destAirport = reader.nextLine();
        
        this.controllerFlight.addFlight(this.controllerAirplane.getplaneID, departAirport, destAirport);
    }
	
    public void printPlanes(){
        ArrayList<Airplane> airplanes = new ArrayList<Airplane>(this.fleet.values());
        for(Airplane airplane : airplanes){
            System.out.println(airplane);
        }
        System.out.println("");
    }
}