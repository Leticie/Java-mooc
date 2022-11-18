
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        int sumYears = 0;
        int numberOfPeople = 0;
        int longest = 0;
        String nameLongest = "";

        
        while (true) {
            String input = scanner.nextLine();
            
            if(input.equals("")) {
                break;
            }
            
            //division
            String[] divided = input.split(",");
            int birthYear = Integer.valueOf(divided[1]);
            String name = divided[0];
            list.add(name);

            
            //age
            sumYears += birthYear;
            numberOfPeople += 1;

            //name
            if (name.length() > longest) {
                longest = name.length();
                nameLongest = name;
            }

            
        }
        
        
        System.out.println("Longest name: " + nameLongest);
        System.out.println("Average of the birth years: " + (double)sumYears/numberOfPeople);

    }
    
    
}
