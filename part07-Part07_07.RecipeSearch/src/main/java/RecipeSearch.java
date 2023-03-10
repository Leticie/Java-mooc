import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UserInterface();
        
        System.out.println("File to read: ");
        String inputFile = scanner.nextLine();
        System.out.println("\nCommands:\n" + "list - lists the recipes\n" + "stop - stops the program\n" + "find name - searches recipes by name\n" + "find cooking time - searches recipes by cooking time\n" + "find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println("\nEnter command:");
            String command = scanner.nextLine();
            System.out.println("");
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                userInterface.list(inputFile);
            }
            
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String searchedName = scanner.nextLine();
                System.out.println("");
                userInterface.findName(inputFile, searchedName);
            }
            
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                userInterface.findCookingTime(inputFile, maxCookingTime);
            }
            
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String searchedIngredient = scanner.nextLine();
                System.out.println("");
                userInterface.findIngredient(inputFile, searchedIngredient);
            }
            

        }    

    }

}
