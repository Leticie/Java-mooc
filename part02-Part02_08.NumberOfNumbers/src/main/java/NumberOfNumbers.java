
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersInTotal = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number > 0 || number < 0) {
                numbersInTotal = numbersInTotal +  1;
            } else {
                System.out.println("Number of numbers: " + numbersInTotal);
                break;
            }
        }
        
        
    }
}
