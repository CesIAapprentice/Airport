package View;

import java.util.Scanner;

import Controller.Actions;

public class UI {
    
    private Scanner reader;
    private IO io;
    private Menus menus;
    private Actions actions;
    private String userChoice;
    

    public UI() {
    	this.reader = new Scanner(System.in);
        this.io = new IO(this.reader);
        this.menus = new Menus();
        this.actions = new Actions(this.reader);
    }
    
    public void menu1(){
        
        this.menus.printHeader1();
        
        while(true){
            this.menus.printMenu1();
            this.userChoice = reader.nextLine();
             
            if(this.userChoice.equals("1")){
                this.io.addPlane();
                //System.out.println("");
            }
        
            else if(this.userChoice.equals("2")){
                this.actions.addFlight();
                //System.out.println("");
            }
        
            else if(this.userChoice.equals("x")){
                System.out.println("");
                break;
            } else System.out.println("unknown parameter for choice: " + this.userChoice);
        }
    }
        
    public void menu2(){
        
        this.menus.printHeader2();
        
        while(true){
            this.menus.printMenu2();
            String choice=reader.nextLine();
            
            if(choice.equals("1")){
                this.actions.printPlanes();
                //System.out.println("");
            }
        
            else if(choice.equals("2")){
                this.actions.printFlights();
                System.out.println("");
            }
            
            else if(choice.equals("3")){
                this.actions.printPlaneInfo();
                System.out.println("");
            }
        
            else if(choice.equals("x")){
                break;
            }
        }
    }
}