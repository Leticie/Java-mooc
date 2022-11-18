
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String stringos = scanner.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double doubl = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string " + stringos);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + doubl);
        System.out.println("You gave the boolean " + bool);
        
        
        
    }
}
