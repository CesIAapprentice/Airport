package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import Model.Airplane;
import Model.Airport;
import Model.Flight;

public class Actions {
    
    Scanner reader;
    HashMap<String, Airplane> fleet;
    Airport airport;

    public Actions(Scanner reader) {
        this.reader = reader;
        this.fleet = new HashMap<String, Airplane>();
        this.airport = new Airport();
    }

    
    public void printPlanes(){
        ArrayList<Airplane> airplanes = new ArrayList<Airplane>(this.fleet.values());
        for(Airplane airplane : airplanes){
            System.out.println(airplane);
        }
        System.out.println("");
    }
    
    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.println(this.fleet.get(planeID));
    }
    

    
    
    

    
    public void printFlights(){
        for( ArrayList<Airspace> flight : this.airport.getAirport()){
            for (Airspace flightData : flight){
                System.out.print(flightData);
                if(flightData != flight.get(flight.size() -1)){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    

}