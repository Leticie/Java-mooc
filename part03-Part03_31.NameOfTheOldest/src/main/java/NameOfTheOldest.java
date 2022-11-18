
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int ageOldest = 0;
        String nameOldest = "";
        
        while (true) {
            
            String input = scanner.nextLine();
            
            if (!(input.equals(""))) {
                String[] divided = input.split(",");
                int age = Integer.valueOf(divided[1]);
                String name = divided[0];
            
                if (age > ageOldest) {
                    ageOldest = age;
                    nameOldest = name;
                }           
            } else {
                System.out.println("Name of the oldest: " + nameOldest);
                break;
            }
            
        }
    }
}
