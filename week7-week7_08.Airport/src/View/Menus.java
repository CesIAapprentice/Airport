package View;

public class Menus {

   public void printHeader1(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
    }
    
    public void printHeader2(){
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
    }
    
    public void printMenu1(){
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }
    
    public void printMenu2(){
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
 }
