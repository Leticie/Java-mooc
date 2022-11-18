
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputNumber = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            inputNumber += 1;
        }
        
        System.out.println(inputNumber);

    }
}
