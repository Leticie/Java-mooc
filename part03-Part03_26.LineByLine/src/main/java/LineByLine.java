
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            split(input);
            if (input.equals("")) {
                break;
            }
        }       
    }
    
    public static void split(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]); 
        }    
    }
    
}
