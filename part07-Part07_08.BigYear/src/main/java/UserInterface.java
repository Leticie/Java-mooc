import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticie
 */
public class UserInterface {
    private BirdsList listOfBirds;
    
    public UserInterface() {
        this.listOfBirds = new BirdsList();
    }
    
    public void printInstructions() {
        System.out.println("Welcome to the best bird friendly program ever!\n");
        System.out.println("Commands: ");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program\n");
    }
    
    public void readUserInput(Scanner scan) {
        while(true) {
            System.out.println("Your command? ");
            String command = scan.nextLine();
            
            commandAdd(command, scan);
            commandObservation(command, scan);
            commandAll(command, scan);
            commandOne(command, scan);
            
            if (command.equals("Quit")) {
                break;
            }
        }
    }
    public void commandAdd(String command, Scanner scan) {
        if (command.equals("Add")) {
            System.out.println("Name: ");
            String inputName = scan.nextLine();
            System.out.println("Name in Latin: ");
            String inputNameLatin = scan.nextLine();
            listOfBirds.addBird(new Bird(inputName, inputNameLatin));
        }
    }
    
    public void commandObservation(String command, Scanner scan) {
        if (command.equals("Observation")) {
            System.out.println("Bird? ");
            String inputName = scan.nextLine();
            boolean observed = listOfBirds.observation(inputName);
            if (observed == false) {
                System.out.println("Not a bird!");
            }
        }
    }
    
    public void commandAll(String command, Scanner scan) {
        if (command.equals("All")) {
            this.listOfBirds.printList();
        }
    }
    
    public void commandOne(String command, Scanner scan) {
        if (command.equals("One")) {
            System.out.println("Bird? ");
            String inputName = scan.nextLine();
            this.listOfBirds.printOne(inputName);
        }
    }
}
