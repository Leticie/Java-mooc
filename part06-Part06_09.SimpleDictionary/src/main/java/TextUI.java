
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
public class TextUI {
    private Scanner scan;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scan, SimpleDictionary dic) {
        this.scan = scan;
        this.dictionary = dic;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = this.scan.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } 
            
            else if (input.equals("add")) {
                System.out.println("Word:");
                String word = this.scan.nextLine();
                System.out.println("Translation:");
                String translation = this.scan.nextLine();
                this.dictionary.add(word, translation);
            } 
            
            else if (input.equals("search")) {
                System.out.println("To be translated:");
                String toBeTranslated = this.scan.nextLine();
                if (!(dictionary.translate(toBeTranslated) == null)) {
                    System.out.println(dictionary.translate(toBeTranslated));
                } else {
                    System.out.println("Word " + toBeTranslated + " was not found");
                }
            }
            
            else {
                System.out.println("Unknown command");
            }
        }    
            
    }
    
}
