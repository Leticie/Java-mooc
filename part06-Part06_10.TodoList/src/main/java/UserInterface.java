
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
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scan = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.println("Command:");
            String command = scan.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            add(command);
            list(command);
            remove(command);
        }
    }
    
    public void add(String command) {
        if (command.equals("add")){
            System.out.println("To add:");
            String toAdd = scan.nextLine();
            this.list.add(toAdd);
        }
    }
    
    public void list(String command) {
        if (command.equals("list")){
            this.list.print();
        }
    }
    
    public void remove(String command){
        if (command.equals("remove")) {
            System.out.println("Which one is removed?");
            int removed = Integer.valueOf(scan.nextLine());
            this.list.remove(removed);
        }
    }
}
