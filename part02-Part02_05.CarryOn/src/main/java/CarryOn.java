
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shall we carry on?");
        String answer = scanner.nextLine();
        while (!answer.equals("no")) {
            System.out.println("Shall we carry on?");
            answer = scanner.nextLine();
        }
        
    }
}
