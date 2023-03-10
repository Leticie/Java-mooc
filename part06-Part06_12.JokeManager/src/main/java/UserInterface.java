
import java.util.ArrayList;
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
    private Scanner scanner;
    private JokeManager jokemanager;
    
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.scanner = scanner;
        this.jokemanager = jokeManager;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
            }
            
            adding(command);
            drawing(command);
            printing(command);
        }
    }       
        
    public void adding(String command) {
        if (command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = scanner.nextLine();
            this.jokemanager.addJoke(joke);
        }    
    }

    public void drawing(String command) {
        if (command.equals("2")) {
            System.out.println(this.jokemanager.drawJoke());
        }
    }
    
    public void printing(String command) {
        if (command.equals("3")) {
            this.jokemanager.printJokes();
        }    
    }
}
